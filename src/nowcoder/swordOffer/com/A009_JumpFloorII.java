/**
　 * Title: A9_JumpFloorII.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月30日下午9:41:13
*/
package nowcoder.swordOffer.com;

public class A009_JumpFloorII {
    public int JumpFloorII(int target) {
        if (target == 1) {
			return 1;
		}else {
			return JumpFloorII(target-1)*2;	
		}
    }
}
