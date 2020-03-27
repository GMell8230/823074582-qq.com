/**
　 * Title: Alibaba_Sol1.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月27日上午8:56:14
*/
package nowcoder.springRecur.com;

import java.util.Scanner;


public class Alibaba_StrOper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  a = in.nextLine();
        String  b = in.nextLine();
        int res = vaildStr(a,b);
        System.out.println(res);
    }

	private static int vaildStr(String a, String b) {
		// 判断长度是否相等
		if (a.length() != b.length()) {
			return -1;
		}
		// 逐位判断 是否所有字符都能匹配
		StringBuffer temp_str = new StringBuffer(b);
        for (int i = 0; i <a.length(); i++) {
			char temp_char = a.charAt(i);
			boolean has = serchString(temp_char, temp_str);
			if (!has) {
				return -1;
			}
		}
        if (temp_str.length() != 0 ) {
			return -1;
		}
       // 判断有几个字符的前后顺序是对的，即能匹配上的；
        int matched = 0;
        int pos_a = 0, pos_b = 0;
        System.out.println(a);
        System.out.println(b);
        char []arr_a = a.toCharArray();
        char []arr_b = b.toCharArray();
        int len = a.length();
        while(pos_a < len && pos_b < len) {
			if (arr_a[pos_a] == arr_b[pos_b]) {
				pos_a++;
				pos_b++;
				matched++;
			}else {
				pos_a++;
			}
		}
        return a.length()-matched;
	}

	private static boolean serchString(char temp_char, StringBuffer temp_str) {
		int idx = 0;
		boolean has = false;
		for (int i = 0; i < temp_str.length(); i++) {
			if (temp_char == temp_str.charAt(i)) {
				idx = i;
				has = true;
				break;
			}
		}
		if (has) {
			temp_str.deleteCharAt(idx);
			return true;
		}else {
			return false;
		}
		
	}
}	
