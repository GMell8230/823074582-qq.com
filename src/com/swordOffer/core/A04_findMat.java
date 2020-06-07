package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月1日 下午10:23:22
* @describe
*/
public class A04_findMat {
    public boolean Find(int target, int [][] array) {
    	int row = array.length;
    	int col = array[0].length;
    	if (row < 1 || col < 1) {
			return false;
		}
    	int pox_y = array.length-1;
    	int pox_x = 0;
    	while (pox_x >= 0 && pox_x < col && pox_y >= 0 && pox_y < row) {
        	int val = array[pox_y][pox_x];
			if (val == target) {
				return true;
			}else if (val < target) {
				pox_x++;
			}else {
				pox_y--;
			}
		}
    	return false;
    }
}
