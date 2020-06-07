package com.swordOffer.core;

import sun.tools.jar.resources.jar;

/**
* @author GMell
* @version 创建时间：2020年6月7日 下午10:01:43
* @describe
*/
public class A13_DFS_robotPath {
	static volatile int visitedCount = 0;
	static int rows, cols;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	static int k;
    public int movingCount(int threshold, int rows, int cols)
    {
    	if (rows <= 0 && cols <= 0) {
			return 0;
		}
    	k = threshold;
    	this.rows = rows;
    	this.cols = cols;
        int [][]mat = new int[rows][cols];
        boolean [][]visited = new boolean[rows][cols]; 
        for(int i = 0; i < rows; i++) {
        	for(int j = 0; j < cols; j++) {
        		mat[i][j] = sum(i,j);
//        		System.out.print(mat[i][j]+" ");
        		visited[i][j] = false;
        	}
//        	System.out.println();
        }
        DFS(0,0,mat,visited);
        return visitedCount;
    }
	private void DFS(int row_pos, int col_pos, int[][] mat, boolean[][] visited) {
		if (row_pos < 0 || row_pos >= rows || col_pos < 0 || col_pos >= cols || visited[row_pos][col_pos]) {
			return;
		}
		if (k < mat[row_pos][col_pos] ) {
			return;
		}
		visited[row_pos][col_pos] = true;
		visitedCount++;
		for (int i = 0; i < 4; i++) {
			DFS(row_pos+dir[i][0], col_pos+dir[i][1], mat, visited);
		}
	}
	private int sum(int i, int j) {
		int a = 0, b = 0;
		while(i != 0) {
			a += i%10;
			i /= 10;
		}
		while(j != 0) {
			b += j%10;
			j /= 10;
		}
		return a+b;
	}
	public static void main(String[] args) {
		A13_DFS_robotPath sol = new A13_DFS_robotPath();
		System.out.println(sol.movingCount(15, 20, 20));
	}
}
