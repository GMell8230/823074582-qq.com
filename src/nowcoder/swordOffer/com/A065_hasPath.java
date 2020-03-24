/**
　 * Title: A065_hasPath.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月18日下午10:52:21
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;

public class A065_hasPath {
	public static void main(String[] args) {
		char[] matrix = "ABCESFCSADEE".toCharArray();
		int rows = 3;
		int cols = 4;
		char[] str = "ABCCED".toCharArray();
		System.out.println(hasPath(matrix, rows, cols, str));
	}

	public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		if (matrix.length == 0 || str.length == 0 || str.length > matrix.length) {
			return false;
		}

		char[][] map = new char[rows][cols];
		int[][] record = new int[rows][cols];
		char begin = str[0];
		ArrayList<Integer> begin_pos = new ArrayList<Integer>();
		boolean hasBegin = false;
		int pos = 0;
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				map[j][i] = matrix[pos++];
				record[j][i] = 0;
				if (map[j][i] == begin) {
					// 行
					begin_pos.add(j);
					// 列
					begin_pos.add(i);
					hasBegin = true;
				}
			}
		}

		if (!hasBegin) {
			return false;
		}
		int iterNums = begin_pos.size() / 2;
		int idx = 0;
		while (iterNums != 0) {
			int y = begin_pos.get(idx++);
			int x = begin_pos.get(idx++);
			for (int i = 0; i < cols; i++) {
				for (int j = 0; j < rows; j++) {
					record[j][i] = 0;
				}
			}
			boolean res = SearchMap(y, x, str, 0, map, record);
			if (res) {
				return true;
			}
			iterNums--;
		}
		return false;
	}

	private static boolean SearchMap(int rows, int cols, char[] str, int i, char[][] map, int[][] record) {
		if (i == str.length) {
			return true;
		}
		if (map[rows][cols] == str[i] && record[rows][cols] == 0) {
			System.out.println(str[i] + " pos: " + rows + ", " + cols);
			record[rows][cols] = 1;
			if (rows - 1 >= 0) {
				SearchMap(rows - 1, cols, str, i + 1, map, record);
			}
			if (rows + 1 < record.length) {
				SearchMap(rows + 1, cols, str, i + 1, map, record);
			}
			if (cols - 1 >= 0) {
				SearchMap(rows, cols - 1, str, i + 1, map, record);
			}
			if (cols + 1 < record[0].length) {
				SearchMap(rows, cols + 1, str, i + 1, map, record);
			}
			record[rows][cols] = 0;
		}
		return false;
	}

}
