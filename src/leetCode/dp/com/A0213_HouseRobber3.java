/**
　 * Title: A0198_HouseRobber.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月24日下午8:34:09
*/
package leetCode.dp.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.sun.org.apache.xerces.internal.dom.DeferredProcessingInstructionImpl;

/*
 * dp问题与Interview_017_016_TheMasseuseLCCI相同
 */
public class A0213_HouseRobber3 {
	/*直到我遇到了 [2,1,3,null,4] 这样的测试用例
	 * （有多少人是死在这步的，挥动手中的荧光棒让我看到你们）：
	 * 题意并非如隔层求解和那么简单。原因在于对于相邻的两层节点，
	 * 第一层右边的节点和第二层左边的节点完全可以求和的（此时我的内心是奔溃的
	 * dp
	 */
	public int rob1(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return root.val;
		}
		//二叉树层次遍历+dp
		int []dp = new int[100];
		dp[0] = root.val;
		Queue<TreeNode> layer = new LinkedList<TreeNode>();
		if (root.left!=null) {
			layer.offer(root.left);
		}
		if (root.right!=null) {
			layer.offer(root.right);
		}
		int layer_i = 1;
		while (!layer.isEmpty()) {
			int curNodesSize = layer.size();
			int curLayerCount = 0;
			for (int i = 0; i < curNodesSize; i++) {
				TreeNode pollNode = layer.poll();
				curLayerCount += pollNode.val;
				if (pollNode.left != null) {
					layer.offer(pollNode.left);
				}
				if (pollNode.right != null) {
					layer.offer(pollNode.right);
				}
			}
			if (layer_i == 1) {
				dp[layer_i] = Math.max(curLayerCount, dp[layer_i-1]);
			}else {
				dp[layer_i] = Math.max(curLayerCount+dp[layer_i-2], dp[layer_i-1]);
			}
			layer_i++;
		}
    	return dp[layer_i-1];
    }
	
	public int rob(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int money = root.val;
		if (root.right != null) {
			money += rob(root.right.left) + rob(root.right.right);
		}
		if (root.left != null) {
			money += rob(root.left.right) + rob(root.left.left);  
		}
		return Math.max(money, rob(root.left)+rob(root.right));
	}
}
