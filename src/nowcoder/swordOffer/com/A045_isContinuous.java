/**
　 * Title: A045_isContinuous.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月6日下午10:56:23
*/
package nowcoder.swordOffer.com;

import java.util.Arrays;

public class A045_isContinuous {
	public static void main(String[] args) {
		int [] numbers = {1,3,2,6,4};
		System.out.println(isContinuous(numbers));
	}
    public static boolean isContinuous(int [] numbers) {
    	if (numbers.length < 2) {
			return false;
		}
    	Arrays.sort(numbers);
    	int joke = 0;
    	for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				joke++;
			}
			if (numbers[i] > 0) {
				break;
			}
		}
    	int pre = numbers[joke];
    	for (int i = joke+1; i < numbers.length; i++) {
    		if (numbers[i] - pre == 1) {
    			//正常
    		}else if (numbers[i] - pre == 0) {
				return false;
			}else{
				if (joke >= numbers[i] - pre - 1) {
					joke = joke - (numbers[i] - pre-1);
				}else {
					return false;
				}
			}
    		pre = numbers[i];
		}
    	return true;
    }
}
