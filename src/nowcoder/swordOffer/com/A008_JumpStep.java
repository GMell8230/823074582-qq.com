/**
　 * Title: A8_JumpStep.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月30日下午9:08:10
*/
package nowcoder.swordOffer.com;

public class A008_JumpStep {
	static int nums = 0;
    public int JumpFloor(int target) {
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
           return JumpFloor(target-1) + JumpFloor(target-1-1);
        }    }
}
