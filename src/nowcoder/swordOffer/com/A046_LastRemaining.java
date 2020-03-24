/**
　 * Title: A046_LastRemaining.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月7日上午11:14:57
*/
package nowcoder.swordOffer.com;

public class A046_LastRemaining {
	public static void main(String[] args) {
//		int n = 9 , m = 3;
//		int pos = 0;
//		while (true) {
//			pos = (pos+1) % n;
//			System.out.println(pos);
//		}
		System.out.println(LastRemaining_Solution(9,1));
	}
	
    public static int LastRemaining_Solution(int n, int m) {
        if (n < 2 || m < 1) {
			return -1;
		}
        int pos = 0;
        int circle[] = new int[n];
        for (int i = 0; i < circle.length; i++) {
			circle[i] = 1;
		}
        //小朋友的人数
        int count = n;
        int step = 0;
        int last = -1;
        while(count >= 0) {
        	//当前位置有人
//        	System.out.println("pos:"+pos);
        	if (circle[pos] == 1 ) {
        		if (step == m-1) {
        			//退出此位置
        			circle[pos] = 0;
        			step = 0;
        			count--;
//        			System.out.println("=================\n exit:"+pos);
        			//最后一个
        			if (count == 0) {
						last = pos;
						break;
					}
				}else {
					step++;
				}
			}
        	pos = (pos+1 )% n;
        }
        return last;
    }
}
