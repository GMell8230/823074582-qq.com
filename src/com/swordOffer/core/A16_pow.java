package com.swordOffer.core;
/**
* @author GMell
* @version 创建时间：2020年6月8日 上午10:34:48
* @describe
*/
public class A16_pow {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
			return 1;
		}
        if (exponent == 1) {
			return base;
		}
        if (base == 0 ) {
			return 0;
		}
        return Math.pow(base, exponent);
    }
    
    public double Power_1(double base, int exponent) {
        if (exponent == 0) {
			return 1;
		}
        if (exponent == 1) {
			return base;
		}
        if (base == 0 ) {
			return 0;
		}
        boolean isNegative = false;
        if (exponent < 0) {
        	exponent = -exponent;
			isNegative = true;
		}
        
        double pow = Power_1(base*base, exponent/2);
        if (exponent % 2 != 0) {
			pow = pow * base;
		}
        return isNegative ? 1/pow : pow;
    }
}
