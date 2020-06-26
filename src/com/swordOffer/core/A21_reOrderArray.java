package com.swordOffer.core;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
* @author GMell
* @version 创建时间：2020年6月24日 上午10:50:30
* @describe
*/
public class A21_reOrderArray {
	public static void main(String[] args) {
		A21_reOrderArray sol = new A21_reOrderArray();
		int [] array = {2,4,6,8,1,3,5,7};
		sol.reOrderArray(array);
	}
	
    public void reOrderArray(int [] array) {
    	
    	int lastIdx = 0;
        for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				Swap(array,lastIdx,i);
				lastIdx++;
			}
		}
        for (int i : array) {
			System.out.print(i+" ");
		}
    }

	private void Swap(int[] array, int lastIdx, int i) {
		// TODO Auto-generated method stub
		for (int j = i; j > lastIdx; j--) {
			int temp = array[j];
			array[j] = array[j-1];
			array[j-1] = temp;
			
		}
	}
	
	
	public void reOrder(int []nums) {
		int N = nums.length;
		for(int i = N - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if (nums[j] % 2 == 0 && nums[j+1] % 2 !=0) {
					swap(nums,j,j+1);
				}
			}
		}
	}
	private void swap(int[] nums, int i, int j) {
	    int t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	}
}
