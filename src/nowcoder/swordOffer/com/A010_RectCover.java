/**
　 * Title: A10_RectCover.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月30日下午10:02:56
*/
package nowcoder.swordOffer.com;

public class A010_RectCover {
    public static int RectCover(int target) {
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return RectCover(target-1) +RectCover(target-2);
        }
    }
    public static void main(String[] args) {
		int n = 4;
		System.out.println(RectCover(n));
	}
}
