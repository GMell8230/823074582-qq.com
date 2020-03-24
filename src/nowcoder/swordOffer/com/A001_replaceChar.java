/**
　 * Title: A1_replaceChar.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月29日下午5:52:00
*/
package nowcoder.swordOffer.com;

public class A001_replaceChar {
    public String replaceSpace(StringBuffer str) {
    	String res = new String(str);
    	res = res.replace(" ", "%20");
    	return res;
    }
}
