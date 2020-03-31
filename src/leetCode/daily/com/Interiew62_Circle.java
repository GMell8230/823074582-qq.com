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
    public static int lastRemaining(int n, int m) {
    	int res = sol(n, m);
    	return res;
    }

	private static int sol(int n, int m) {
		if (n == 1) {
			return 0;
		}
		int x = sol(n - 1, m);
		return (m + x) % n;
	}
	
	
	/*
	 * 链表解法
	 */
	public static void main(String[] args) {
		System.out.println(lastRemaining2(10, 3));
	}
	
	public static int lastRemaining1(int n, int m) {
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
	
	  public static int lastRemaining2(int n, int m) {
	    	int []circle = new int [n];
	    	for (int i = 0; i < circle.length; i++) {
				circle[i] = i;
			}
	    	int remain = n;
	    	int pos = -1;
	    	int step = 0;
	    	while (remain > 1) {
	    		pos = (pos+1) % n;
	    		if (circle[pos] != -1) {
	    			step++;
				}
	    		if (step == m) {
					circle[pos] = -1;
					System.out.println(pos);
					remain --;
					step = 0;
				}
			}
	    	for (int i = 0; i < circle.length; i++) {
				if (circle[i] != -1) {
					return circle[i];
				}
			}
	    	return -1;
	    }
	
}
