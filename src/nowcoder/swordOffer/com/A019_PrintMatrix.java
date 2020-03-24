/**
　 * Title: A19_PrintMatrix.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月31日下午8:42:57
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;

public class A019_PrintMatrix {
	
	public static void main(String[] args) {
		int [][] matrix = {{1,2,3,4},{5,6,7,8}};

		ArrayList<Integer> res  = printMatrix(matrix);

	}
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
    	
    	ArrayList<Integer> res = new ArrayList<Integer>();
        int raw = matrix.length-1;
        int col = matrix[0].length-1;
        int record[][] = new int[raw+1][col+1];
        for (int i = 0; i <= raw; i++) {
			for (int j = 0; j <= col; j++) {
				record[i][j] = 0;
			}
		}
        int pos_x = -1, pos_y =0;
        int count = (raw+1)*(col+1);
        int dir[] = {0,1,2,3};//左下右上
        int direction = 0;
//		System.out.println("direction:"+direction);
        while(count >0){
            switch (dir[direction]) {
			case 0:pos_x++;break;	
			case 1:pos_y++;break;
			case 2:pos_x--;break;
			case 3:pos_y--;break;
			}
            if (pos_x >= 0 && pos_x <= col && pos_y >= 0 && pos_y <= raw && record[pos_y][pos_x] == 0) {
                int val = matrix[pos_y][pos_x];
                res.add(val);
//                System.out.println(val);
                count--;
            	record[pos_y][pos_x]  = 1;
			}else {
	            switch (dir[direction]) {
				case 0:pos_x--;break;	
				case 1:pos_y--;break;
				case 2:pos_x++;break;
				case 3:pos_y++;break;
				}
				direction =(direction+1)%4;
//				System.out.println("direction:"+direction);
			}
        }
        return res;
     }
}
