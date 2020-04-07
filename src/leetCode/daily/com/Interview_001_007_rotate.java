/**
　 * Title: Interview_001_007_rotate.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月7日下午9:33:48
*/
package leetCode.daily.com;


public class Interview_001_007_rotate {
    public void rotate1(int[][] matrix) {
    	int len = matrix.length;
    	int [][]matrix_new = new int[matrix.length][];
    	
    	for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix_new[j][len-1-i] = matrix[i][j];
			}
		}
    	matrix = matrix_new;
    }
    public static void main(String[] args) {
    	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    	rotate(matrix); 
	}
    public static void rotate(int[][] matrix) {
    	int len = matrix.length;
    	//上下翻转
    	for (int i = 0; i < len/2; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[len-1-i][j];
				matrix[len-1-i][j] = temp;
			}
		}
    	//对角翻转
    	for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				if (i != j) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}

    }

	private void sawp(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
