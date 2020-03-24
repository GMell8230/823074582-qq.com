/**
　 * Title: A053_isNumeric.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月15日下午11:13:24
*/
package nowcoder.swordOffer.com;

public class A053_isNumeric {
	public boolean isNumeric(char[] str) {
		int add_op = 0; // 加减
		int sub_op = 0; // 加减
		int e_op = 0;
		int E_op = 0;
		int dot_op = 0;
		int idx = 0;
		if (str[0] == '+') {
			idx++;
		}
		if (str[0] == '-') {
			idx++;
		}
		String dict = "0123456789+-";
		char legalDict[] = dict.toCharArray();
		
		for (; idx < str.length; idx++) {
			char op = str[idx];
			if (op >= '0' && op <= '9') {
				continue;
			} else {
				switch (op) {
				case '-':
					if (str[idx - 1] == 'e' || str[idx - 1] == 'E') {
						sub_op++;
						if (sub_op > 1) {
							return false;
						}
						break;
					} else {
						return false;
					}
				case '+':
					if (str[idx - 1] == 'e' || str[idx - 1] == 'E') {
						add_op++;
						if (add_op > 1) {
							return false;
						}
						break;
					} else {
						return false;
					}
				case '.':
					if (E_op > 0 || e_op > 0) {
						return false;
					}
					dot_op++;
					if (dot_op > 1) {
						return false;
					}
					if (idx+1 >= str.length) {
						return false;
					}else {
						if (str[idx+1] < '0' || str[idx+1] > '9' ) {
							return false;
						}
					}
					break;
				case 'e':
					e_op++;
					if (e_op > 1) {
						return false;
					}
					if (idx+1 >= str.length) {
						return false;
					}else {
						boolean legal = false;
						for (int i = 0; i < legalDict.length; i++) {
							if (str[idx+1] == legalDict[i]) {
								legal = true;
								break;
							}
						}
						if (!legal) {
							return false;
						}
					}
					break;
				case 'E':
					E_op++;
					if (E_op > 1) {
						return false;
					}
					if (idx+1 >= str.length) {
						return false;
					}else {
						boolean legal = false;
						for (int i = 0; i < legalDict.length; i++) {
							if (str[idx+1] == legalDict[i]) {
								legal = true;
								break;
							}
						}
						if (!legal) {
							return false;
						}
					}
					break;
				default:
					return false;
				}
			}
		}
		return true;
	}
}
