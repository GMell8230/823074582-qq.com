/**
　 * Title: A892_SurfaceAreaof3DShapes.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月25日下午12:20:04
*/
package leetCode.daily.com;

public class A892_SurfaceAreaof3DShapes {
    public int surfaceArea(int[][] grid) {
    	int row = grid.length;
    	int col = grid[0].length;
    	if (row == 0 || col == 0) {
			return 0;
		}
    	//遍历网格计数
    	int surfaceArea = 0;
    	for (int i = 0; i < row; i++) {
    		for (int j = 0; j < col; j++) {
    			if (grid[i][j] != 0) {
    				//
					surfaceArea += countArea(i, j, grid);
				}
    		}
		}
    	return surfaceArea;
    }

	//计算该网格内的area
	private int countArea(int i, int j, int[][] grid) {
    	int row = grid.length;
    	int col = grid[0].length;
    	//当前的块
    	int block = grid[i][j];
		//0.若该pos有堆叠,则减去堆叠(堆叠面=(块数-1)*2)
    	int area = block*6 - ((block -1)*2);
    	//1.若该pos的上下左右有相邻方块,则减去本网格中被遮挡的面
    	int x_dirs[] = {0,0,1,-1};
    	int y_dirs[] = {1,-1,0,0};
    	for (int op = 0; op < 4; op++) {
    		int x = i + x_dirs[op];
    		int y = j + y_dirs[op];
    		if (x >= 0 && x < row && y >=0 && y< col) {
				int linkedBlock = grid[x][y];
				int coverArea = block > linkedBlock ? linkedBlock : block;
				area -= coverArea;
			}    		
		}
    	return area;
	}
}
