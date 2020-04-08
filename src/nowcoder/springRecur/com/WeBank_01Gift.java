/**
　 * Title: WeBank_Gift.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年4月8日下午7:27:04
*/
package nowcoder.springRecur.com;

import java.util.Scanner;

public class WeBank_01Gift {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			//礼物能够平均分
			if (m % n == 0) {
				System.out.println(0);
			}else {
			//礼物不够平均分，计算需要补的礼物数量
				int sub = 0;
				if (m < n) {
					sub = n-m;
				}else {
					sub = n - (m % n);
				}
				//全部补充礼物的花费
				int gift_cost = sub * b;
				//让小朋友走的花费
				int redpack_cost = 0;
				int goNum = 0;
				int curCost = gift_cost;
				while (m % n != 0) {
					n -- ;
					goNum++;
					redpack_cost = a*goNum;
					if (m % n == 0) {
						curCost = Math.min(curCost, redpack_cost);
						break;
					}
					if (m < n) {
						sub = n-m;
					}else {
						sub = n - (m % n);
					}
					//全部补充礼物的花费
					gift_cost = sub * b;
					curCost = Math.min(curCost, gift_cost+redpack_cost);
				}
				System.out.println(curCost);
			}
		}
	}
}
