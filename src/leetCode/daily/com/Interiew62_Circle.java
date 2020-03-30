/**
　 * Title: Interiew62_Circle.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月30日上午11:52:58
*/
package leetCode.daily.com;

import java.util.ArrayList;
import java.util.List;

import javax.naming.directory.InvalidSearchControlsException;

import com.sun.org.apache.xml.internal.utils.IntVector;
import com.sun.security.auth.SolarisNumericGroupPrincipal;

public class Interiew62_Circle {
	/*
	* 递归解法
	*/
    public int lastRemaining(int n, int m) {
    	int res = sol(n, m);
    	return res;
    }

	private int sol(int n, int m) {
		if (n == 1) {
			return 0;
		}
		int x = sol(n - 1, m);
		return (m + x) % n;
	}
	
	
	/*
	 * 链表解法
	 */
	public int lastRemaining1(int n, int m) {
    	List<Integer> arr = new ArrayList<Integer>();
    	for (int i = 0; i < n; i++) {
			arr.add(i);
		}
    	int idx = 0;
    	while (n > 1) {
    		idx = (idx + m - 1)% n;
    		arr.remove(idx);
    		idx--;
		}
    	return arr.get(0);
    }
}
