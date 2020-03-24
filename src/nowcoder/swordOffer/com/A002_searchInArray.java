/**
　 * Title: A1_searchInArray.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月29日下午5:40:10
*/
package nowcoder.swordOffer.com;

public class A002_searchInArray {
    public boolean Find(int target, int [][] array) {
    	int col = array[0].length-1;
    	int raw = array.length-1;
    	if (col == 0 || raw ==0) {
			return false;
		}
    	int pos_x = 0, pos_y=raw;
    	while(pos_x <= raw && pos_y >= 0) {
    		if(array[pos_x][pos_y] == target) {
    			return true;
    		}else if (array[pos_x][pos_y] > target) {
				pos_y--;
			}else {
				pos_x++;
			}
    	}
    	return false;
    	
    }
}
