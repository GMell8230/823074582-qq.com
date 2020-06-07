package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月7日 下午7:08:47
* @describe
*/
public class A10_JumpFloor {
	public int JumpFloor(int target) {
		if (target < 1) {
			return 0;
		}
        int res =  (int) Math.pow(2, target-1);
		return res;
    }
	public static void main(String[] args) {
		A10_JumpFloor sol = new A10_JumpFloor();
		System.out.println(sol.JumpFloor(2));
	}
}
