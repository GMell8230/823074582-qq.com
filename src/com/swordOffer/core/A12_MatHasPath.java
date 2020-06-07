package com.swordOffer.core;


/**
* @author GMell
* @version 创建时间：2020年6月7日 下午7:59:27
* @describe
*/
public class A12_MatHasPath {
	static int [][]dir = {{0,-1},{0,1},{-1,0},{1,0}};
	static int rows, cols;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {        
    	if (rows == 0 || cols == 0) {
			return false;
		}
    	int [][]pathMat = new int[rows][cols];
    	this.rows = rows;
    	this.cols = cols;
    	char [][] format_matrix = new char[rows][cols];
    	int idx = 0;
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			format_matrix[i][j] = matrix[idx++];
    			pathMat[i][j] = 0;
//    			System.out.print(format_matrix[i][j]+" ");
    		}
//    		System.out.println();
    	}
    	int strIdx = 0;
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
//    			System.out.println(format_matrix[i][j]);
    			boolean res = searchMat(i, j, format_matrix, strIdx, str, pathMat);
    			if (res) {
					return true;
				}
    		}
    	}
    	return false;
    }
	private boolean searchMat(int row_Pos, int col_Pos, char[][] matrix, int strIdx, char[] str, int[][] pathMat) {
		if (strIdx == str.length) {
			return true;
		}
		if (row_Pos < 0 || col_Pos < 0 || row_Pos >= rows || col_Pos >= cols || matrix[row_Pos][col_Pos] != str[strIdx] || pathMat[row_Pos][col_Pos] == 1) {
			return false;
		}
		pathMat[row_Pos][col_Pos] = 1;
		for(int i = 0; i < 4; i++) {
//			System.out.println("x_pos: "+x_Pos+dir[i][0]+" y_pos: " +y_Pos+dir[i][1]);
			if(searchMat(row_Pos+dir[i][0], col_Pos+dir[i][1], matrix, strIdx+1, str,pathMat)) {
				return true;
			}
		}
		pathMat[row_Pos][col_Pos] = 0;
		return false;
	}
	public static void main(String[] args) {
		A12_MatHasPath sol = new A12_MatHasPath();
		char[] matrix = "ABCESFCSADEE".toCharArray();
		char []str = "ABCB".toCharArray();
		System.out.println(sol.hasPath(matrix, 3,4, str));
	}
}
