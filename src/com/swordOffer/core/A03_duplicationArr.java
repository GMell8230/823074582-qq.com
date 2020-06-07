package com.swordOffer.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.standard.NumberUpSupported;

/**
* @author GMell
* @version 创建时间：2020年6月1日 下午9:15:45
* @describe
*/
public class A03_duplicationArr {
	public static void main(String[] args) {
		
	}
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		if (numbers == null || length < 0) {
			return false;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			if (set.contains(numbers[i])) {
				duplication[0] = numbers[i];
				return true;
			}
		}
		return false;
    }
	
	public boolean duplicate1(int numbers[],int length,int [] duplication) {
		if (numbers == null || length < 0) {
			return false;
		}
		for (int i = 0; i < length; i++) {
			while (numbers[i] != i) {
				if (numbers[i] == numbers[numbers[i]]) {
					duplication[0] = numbers[i];
					return true;
				}
				swap(numbers, i, numbers[i]);
			}
		}
		
		return false;
    }
	private void swap(int[] numbers, int i, int j) {
		// TODO Auto-generated method stub
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		
	}
	
}
