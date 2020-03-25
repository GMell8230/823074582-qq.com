/**
　 * Title: A0198_HouseRobber.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年3月24日下午8:34:09
*/
package leetCode.dp.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.sun.org.apache.xerces.internal.dom.DeferredProcessingInstructionImpl;

/*
 * dp问题与Interview_017_016_TheMasseuseLCCI相同
 */
public class A0337_HouseRobber3 {
	/*直到我遇到了 [2,1,3,null,4] 这样的测试用例
	 * （有多少人是死在这步的，挥动手中的荧光棒让我看到你们）：
	 * 题意并非如隔层求解和那么简单。原因在于对于相邻的两层节点，
	 * 第一层右边的节点和第二层左边的节点完全可以求和的（此时我的内心是奔溃的
	 * dp
	 */
	public int rob_error(TreeNode root) {
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
	
	/*
	 * 递归
	 * 假定:使用1个爷爷-2个孩子-4个孙子
	 * 1.相邻节点不能偷,爷爷和儿子之间不能偷,儿子和孙子之间不能偷,爷爷和孙子可以
	 * 2.符合二叉树结构,一个节点最多两个子节点
	 * Solution:4个孙子偷的钱 + 爷爷的钱 VS 两个儿子偷的钱 哪个组合钱多，就当做当前节点能偷的最大钱数,即动态规划最优子结构
	 * 递归解法;
	 * 当前为爷节点;遍历孙子节点;
	 */
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
	/*
	 * 上一步中,爷爷在计算了自己能偷多少钱的时候,同时计算了儿子和孙子的钱数;
	 * 当儿子作为爷爷的时候,就导致了儿子又重复计算了一遍孙子节点;
	 * 由此出现了重复的子问题
	 * 对重复子问题进行优化,进行记忆化(存入数组,hashmap),即将每次的结果存储起来,下次再计算就从缓存中取,不用再次计算;
	 * 这样就保证每个数字只计算了一次;
	 * 二叉树不适合用数组做缓存,所以用hashmap表存储,treenode当key,钱当value;
	 */
	public int rob2(TreeNode root) {
		HashMap<TreeNode, Integer> memo = new HashMap<TreeNode, Integer>();
		return robInternal(root, memo);
	}

	private int robInternal(TreeNode root, HashMap<TreeNode, Integer> memo) {
		if (root == null) {
			return 0;
		}
		if (memo.containsKey(root)) {
			return memo.get(root);
		}
		
		int money = root.val;
		if (root.right != null) {
			money += robInternal(root.right.right, memo) + robInternal(root.right.left, memo);
		}
		
		if (root.left!= null) {
			money += robInternal(root.left.right, memo) + robInternal(root.left.left, memo);
		}
		int res = Math.max(money, robInternal(root.left, memo) + robInternal(root.right, memo));
		memo.put(root, money);
		return res;
	}
	/*
	 * 上述用到了孙子节点,计算爷爷节点能偷的钱还要同时计算孙子节点投的钱,虽然有了记忆化,但是还是性能损耗;
	 * 换一种定义:每个节点可以选择偷或者不偷的两种状态,
	 * 约束:     即相连节点不能一起偷
	 * -当前节点偷,那么他的两个孩子不能偷
	 * -当前不偷,两个孩子节点只需要拿最多的钱出来就行;
	 * 用大小为2的数组表示状态 res[2] 0代表偷;1代表不偷
	 * 任何一个节点能偷到的最大钱的状态可以定义为:
	 * - 当前节点选择不偷: 当前节点能偷到的最大钱数 = 左孩子能偷到的钱 + 右孩子能偷到的钱
	 * root[1] = rob(root.left)[0] + rob(root.right)[0] + root.val;
	 * - 当前节点选择偷: 当前节点能偷到的最大钱数 = 左孩子选择自己不偷时能得到的钱 + 右孩子选择不偷时能得到的钱 + 当前节点的钱数
	 * root[0] = Math.max(rob(root.left)[0], rob(root.left)[1]) + Math.max(rob(root.right)[0], rob(root.right)[1])
	 */
	public int rob3(TreeNode root) {
	    int[] result = robInternal(root);
	    return Math.max(result[0], result[1]);
	}

	public int[] robInternal(TreeNode root) {
	    if (root == null) return new int[2];
	    int[] result = new int[2];

	    int[] left = robInternal(root.left);
	    int[] right = robInternal(root.right);

	    result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
	    result[1] = left[0] + right[0] + root.val;

	    return result;
	}
	
}
