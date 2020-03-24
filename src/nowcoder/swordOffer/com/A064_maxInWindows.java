/**
　 * Title: A064_maxInWindows.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月18日下午10:16:16
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;

public class A064_maxInWindows {
	public static void main(String[] args) {
		String []input = "10,14,12,11".split(",");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (String string : input) {
			arr.add(Integer.valueOf(string));
		}
		int size = 5;
		Integer[] num = arr.toArray(new Integer[arr.size()]);
		
		ArrayList<Integer> res = maxInWindows(num, size);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
		
	}
	
	
    public static ArrayList<Integer> maxInWindows(Integer[] num, int size)
    {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	
    	if (num.length == 0 || size == 0 || num.length < size) {
			return res;
		}
		int max = num[0];
    	if (num.length == size) {
			for (int i = 1; i < num.length; i++) {
				if (num[i] > max) {
					max = num[i];
				}
			}
			res.add(max);
			return res;
		}

    	int max_pos = 0;
    	for (int i = 0; i < num.length; i++) {
    		int win_pos = i+size;
    		if (win_pos > num.length) {
				break;
			}
    		if (max_pos < i) {
				max_pos = i;
				max = num[i];
			}
    		for (int j = i; j < win_pos; j++) {
				if (max < num[j]) {
					max = num[j];
					max_pos = j;
				}
			}
    		res.add(max);
		}
        return res;
    }
}
