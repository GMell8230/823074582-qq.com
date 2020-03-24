/**
　 * Title: A034_FirstNotRepeatingChar.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月2日下午9:10:52
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class A034_FirstNotRepeatingChar {
	
	public static void main(String[] args) {
		String str = "e";
		A034_FirstNotRepeatingChar a = new A034_FirstNotRepeatingChar();
		System.out.println(a.FirstNotRepeatingChar(str));
	}
    public int FirstNotRepeatingChar(String str) {
    	if (str.length() == 0 || str == null ) {
			return -1;
		}
    	HashMap<Character, Boolean> dict = new HashMap<Character, Boolean>();
    	char strArr[] = str.toCharArray();
    	for (int i = 0; i < strArr.length; i++) {
    		char cur = strArr[i];
    		if (!dict.containsKey(cur)) {
				dict.put(cur,true);
			}else {
				dict.put(cur,false);
			}
		}
    	ArrayList<Integer> idxList =new ArrayList<Integer>();
    	for (Map.Entry<Character, Boolean> en: dict.entrySet()) {
			if (en.getValue()) {
				char res = en.getKey();
				idxList.add(str.indexOf(res));
			}
		}
    	if (idxList.isEmpty()) {
			return -1;
		}else {
			Collections.sort(idxList);
			return idxList.get(0);
		}
    	
    }
}
