package com.swordOffer.core;

import java.util.Arrays;

import sun.launcher.resources.launcher;
/**
 * @author GMell
 * @version 创建时间：2020年6月26日 下午4:57:33
 * @describe
 */
public class A33_VerifySquenceOfBST {
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0) {
			return false;
		}
		return sol(sequence, 0, sequence.length-1);
	}

	private boolean sol(int[] sequence, int begin, int end) {
		if (end - begin <=1) {
			return true;
		}
		
		int rootVal = sequence[end];
		int pivot = begin;
		while (pivot < end && sequence[pivot] <= rootVal) {
			pivot++;
		}
		for (int i = pivot; i < end; i++) {
			if (sequence[i] < rootVal) {
				return false;
			}
		}
		
		return sol(sequence, begin, pivot-1) && sol(sequence, pivot, end-1);
	
	}
}
