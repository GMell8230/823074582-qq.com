/**
　 * Title: A033_Permutation.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月2日下午4:48:39
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class A033_Permutation {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> res = new ArrayList<String>();
		if (str.length() == 0 || str == null) {
			return res;
		}
		PermutationHelper(str.toCharArray(), 0, res);
		Collections.sort(res);
		return res;
	}

	private void PermutationHelper(char[] charArray, int pos, ArrayList<String> res) {
		if (pos == charArray.length - 1) {
			String val = String.valueOf(charArray);
			if (!res.contains(val)) {
				res.add(val);
			}
		} else {
			for (int i = pos; i < charArray.length; i++) {
				swap(charArray, i, pos);
				PermutationHelper(charArray, pos + 1, res);
				swap(charArray, i, pos);
			}
		}

	}

	private void swap(char[] charArray, int i, int pos) {
		// TODO Auto-generated method stub
		char temp = charArray[i];
		charArray[i] = charArray[pos];
		charArray[pos] = temp;
	}
}
