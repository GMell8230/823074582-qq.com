package com.swordOffer.core;

import com.sun.org.apache.regexp.internal.recompile;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��7�� ����7:19:12
* @describe
*/
public class A11_minNumberInRotateArray {
    //˳�����
	public int minNumberInRotateArray(int [] array) {
        if (array.length < 1) {
			return 0;
		}
        int len = array.length-1;
        int cur = array[len];
        for(int i = len-1; i > 0; i--) {
        	if (cur < array[i]) {
				return cur;
			}else {
				cur = array[i];
			}
        }
        return cur;
    }
	// ����˼·
    public int minNumberInRotateArray1(int [] array) {
        if (array.length == 0) {
			return 0;
		}
        int l = 0, h = array.length-1;
        while (l < h) {
        	int m = (l+h-1)/2;
        	if (array[m] == array[l] && array[l] == array[h]) {
				return seqSearch(array, l, h);
			}else if(array[m] <= array[h]){
				h = m;
			}else {
				l = m+1;
			}
		}
        return array[l];
    }
	private int seqSearch(int[] array, int l, int h) {
		for(int i = l; i < h; i++) {
			if (array[i] > array[i+1]) {
				return array[i+1];
			}
		}
		return array[l];
	}
}
