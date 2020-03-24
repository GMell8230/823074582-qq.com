/**
　 * Title: A048_Add.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月7日下午5:21:44
*/
package nowcoder.swordOffer.com;

public class A048_Add {
    public int Add(int num1,int num2) {
        while (num2 != 0) {
			int temp = num1 ^ num2;
			num2 = (num1 & num2) << 1;
			num1 = temp;
		}
    	
    	return num1;
    }
}
