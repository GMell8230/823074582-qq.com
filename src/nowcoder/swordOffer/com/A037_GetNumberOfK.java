/**
　 * Title: A037_GetNumberOfK.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月2日下午11:09:10
*/
package nowcoder.swordOffer.com;

public class A037_GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        //有序数组 二分查找
    	if (array.length == 0) {
			return 0;
		}
    	int count = 0;
    	int start = 0, end = array.length-1; 
    	int pos = 0;
    	int mid = (start + end) >> 1;
    	while (start <= end) {
    		if (array[mid] == k) {
				pos = mid;
				count++;
				break;
			}else if(array[mid] > k) {
				end = mid-1;
			}else {
				start = mid+1;
			}
    		mid = (start + end) >> 1;
		}
    	int temp = pos-1;
    	while (temp > 0) {
			if (array[temp] != k) {
				break;
			}
			temp--;
			count++;
		}
    	temp = pos+1;
    	while (temp < array.length-1) {
			if (array[temp] != k) {
				break;
			}
			temp++;
			count++;
		}
    	return count;
    }
}
