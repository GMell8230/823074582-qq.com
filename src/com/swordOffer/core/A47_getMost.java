package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年7月7日 下午10:37:43
* @describe
*/
public class A47_getMost {
	public static void main(String[] args) {
		int [][]board = {{1,2,5},{3,2,1}};
		System.out.println(getMost(board));
	}
	
    public static int getMost(int[][] board) {
        // write code here
    	if (board == null || board.length == 0 || board[0].length == 0) {
			return 0;
		}
    	int row = board.length;
    	int col = board[0].length;
    	for (int i = 1; i <row ; i++) {
			board[i][0] += board[i-1][0]; 
		}
    	for (int i = 1; i <col ; i++) {
			board[0][i] += board[0][i-1]; 
		}
    	
    	for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				board[i][j] += Math.max(board[i-1][j], board[i][j-1]);
			}
		}
    	
//    	for (int[] is : board) {
//			for(int ele : is)System.out.print(ele+" ");
//			System.out.println();
//		}
    	return board[row-1][col-1];
    }
}
