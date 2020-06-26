package com.swordOffer.core;

import java.util.regex.Pattern;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��24�� ����10:02:20
* @describe
*/
public class A20_isNumeric {
	
	public static void main(String[] args) {
		A20_isNumeric sol = new A20_isNumeric();
		System.out.println(sol.isNumeric("-.123".toCharArray()));
	}
	
	
    public boolean isNumeric(char[] str) {
        if (str.length == 0) {
			return false;
		}
        //�������ַ� -��+��num �������
        boolean sym = false;
        if (str[0] == '-' || str[0] == '+') {
			sym = true;
		}
        int start_pos = 0;
        if (sym) {
        	start_pos = 1;
		}
        //ȥ������λ�������ĸҪ�����ֿ�ͷ
        if ((str[start_pos] < '0' || str[start_pos] > '9') && str[start_pos] != '.') {
			return false;
		}
        
        boolean hasDot = false;
        boolean hasE = false;
        for (int i = start_pos+1; i < str.length; i++) {
        	//�ж�.
        	if (str[i] == '.') {
        		// .�Ƿ��״γ���
        		if (hasDot == false && hasE == false) {
        			hasDot = true;
        			// .����Ҫ������
        			if (i+1 >= str.length || str[i+1] < '0' || str[i+1] > '9') {
						return false;
					}
				}else {
					return false;
				}
				continue;
			}
        	
        	//�ж�E
        	if (str[i] == 'e' || str[i] == 'E') {
        		// E�Ƿ��״γ���
        		if (hasE == false) {
        			hasE = true;
        			// E����Ҫ������ �����
        			if (i+1 < str.length) {
        				if ((str[i+1] >= '0' && str[i+1] <= '9') || str[i+1] == '-' || str[i+1] == '+') {
        					if(str[i+1] == '-' || str[i+1] == '+') {
        						i++;
        					}
        					continue;
						}else {
							return false;
						}
					}else {
						return false;
					}
				}else {
					return false;
				}
			}
        	
        	if (str[i] >= '0' && str[i] <= '9') {
				continue;
			}else{
				return false;
			}
		}
        return true;
    }
    
    
    public boolean isNumeric2(char[] str) {
    	String pattern = "^[-+]?\\d*(?:\\.\\d*)?(?:[eE][+\\-]?\\d+)?$";
    	String s = new String(str);
    	return Pattern.matches(pattern, s);
    	
    	
    }
}
