/**
　 * Title: A040_FindNumsAppearOnce.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月3日下午12:24:20
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.omg.CORBA.IRObject;

public class A040_FindNumsAppearOnce {
	public static void main(String[] args) {
		int [] array = {2,4,3,6,3,2,5,5};
		int num1[] = {-1};
		int num2[] = {-1};
		FindNumsAppearOnce(array,num1 ,num2);
		System.out.println("num1: "+num1[0]+" num2: "+num2[0]);
	}
	
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
    	if (array.length < 2) {
			return;
		}
    	
    	HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
    	for (int i = 0; i < array.length; i++) {
    		//map中没有此值
			if (!arrMap.containsKey(array[i])) {
				arrMap.put(array[i], 1);
			}else {
				//出现两次的值置0;
				arrMap.put(array[i], 0);
			}
		}
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	for(Entry<Integer, Integer> en: arrMap.entrySet()) {
//    		System.out.println("key:"+en.getKey() + " value:"+en.getValue());
    		if (en.getValue() == 1) {
				res.add(en.getKey());
			}
    	}
    	if (res.size() != 2) {
			return;
		}else {
	    	num1[0] = res.get(0);
	    	num2[0] = res.get(1);
		}

    	return;
    }
}
