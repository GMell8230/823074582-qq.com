package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年7月5日 下午7:42:06
* @describe
*/
public class A39_MoreThanhelf {
	
	public static void main(String[] args) {
		String input = "111221222";
		char []elems = input.toCharArray();
		int []arr = new int[elems.length];
		int pos = 0;
		for (char c : elems) {
			arr[pos++] = c-'0';
		}
		A39_MoreThanhelf sol = new A39_MoreThanhelf();
		System.out.println(sol.MoreThanHalfNum_Solution(arr));
	}
    public int MoreThanHalfNum_Solution(int [] array) {
    	int len = array.length;
    	if (len == 0) {
			return 0;
		}
        
    	int ele = array[0], count = 0;
    	for (int i : array) {
			if (count == 0) {
				ele = i;
				count = 1;
			}else {
				if (ele == i) {
					count++;
					if (count > len/2) {
						return ele;
					}
				}else {
					count--;
				}
			}
		}
    	count = 0;
    	for (int i : array) {
			if (i == ele) {
				count++;
			}
		}
    	return count > len/2 ? ele:0;
    }
}
