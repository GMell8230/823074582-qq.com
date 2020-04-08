/**
　 * Title: Interview_013_MovingCount.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月8日下午10:33:22
*/
package leetCode.daily.com;

import java.awt.image.RescaleOp;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;

public class Interview_013_MovingCount {
	public static void main(String[] args) {
		Interview_013_MovingCount test = new Interview_013_MovingCount();
		System.out.println(test.movingCount(38,15,9));
	}
    public int movingCount(int m, int n, int k) {
    	int [][]map = new int [m][n];
    	int [][]record = new int [m][n];
    	for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = calSum(i) + calSum(j);
				record[i][j] = 0;
				System.out.print(map[i][j]+"\t ");
			}
			System.out.println();
		}
    	return search(map, record, k, 0,0);
    	
    }

	private int search(int[][] map, int[][] record, int k, int x, int y) {
		if (x >= map.length || y >= map[0].length || record[x][y] == 1 || map[x][y] > k) {
			return 0;
		}
		record[x][y] = 1;
		return 1+search(map, record, k, x+1, y)+search(map, record, k, x, y+1);
	}

	private int calSum(int j) {
		int res = 0;
		while (j != 0) {
			res += j % 10;
			j /=10;
		}
		return res;
	}
}
