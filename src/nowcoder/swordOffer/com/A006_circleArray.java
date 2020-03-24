/**
　 * Title: A6_circleArray.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年1月30日上午11:05:29
*/
package nowcoder.swordOffer.com;

public class A006_circleArray {
	public static void main(String[] args) {
		int []array = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717
				,9170,9359,9719,9895,9896,
				9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,
				2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
		System.out.println(minNumberInRotateArray(array));
	}
	
    public static int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int temp = array[0];
        for(int i = 1; i < array.length-1; i++){
            if(array[i]< temp){
               return array[i];
            }
            temp = array[i];
        }
        return array[0];
    }
}
