package com.swordOffer.core;
/**
* @author GMell
* @version ����ʱ�䣺2020��6��7�� ����7:05:57
* @describe
*/
public class A10_RectCover {
    public int RectCover(int target) {
    	if (target <= 2) {
			return target;
		}
    	int pre1 = 1, pre2 = 2;
    	int res = 0;
        for(int i = 3; i <= target; i++ ) {
        	res = pre1 + pre2;
        	pre1 = pre2;
        	pre2 = res;
        }
    	return res;
    }
}
