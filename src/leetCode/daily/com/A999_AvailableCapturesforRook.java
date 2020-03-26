/**
　 * Title: A999_AvailableCapturesforRook.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月26日下午11:41:25
*/
package leetCode.daily.com;

import com.sun.jndi.toolkit.dir.DirSearch;

public class A999_AvailableCapturesforRook {
	public static void main(String[] args) {
		char[][] board = {{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','R','.','.','.','p'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'}};
		System.out.println(numRookCaptures(board));
	}
	public static int numRookCaptures(char[][] board) {
		int rook_x = 0, rook_y = 0;
		int row = 8;
		int col = 8;
		boolean hasFind = false;
		for (int i = 0; i < row; i++) {
			if (!hasFind) {
				for (int j = 0; j < col; j++) {
					if (board[i][j] == 'R') {
						rook_x = i;
						rook_y = j;
						hasFind = true;
						break;
					}
				}
			}
		}
		if (!hasFind) {
			return 0;
		}
		int count = 0;
		int []dirs_x = {0,0,1,-1};
		int []dirs_y = {1,-1,0,0};
		for (int i = 0; i < 4; i++) {
			int x = rook_x + dirs_x[i];
			int y = rook_y + dirs_y[i];
			while (x >= 0 && x < 8 && y >= 0 && y < 8) {
				if (board[x][y] == 'B') {
					break;
				}
				if (board[x][y] == 'p') {
					count++;
					break;
				}
				x = x + dirs_x[i];
				y = y + dirs_y[i];
			}
		}
		return count;
	}
}
