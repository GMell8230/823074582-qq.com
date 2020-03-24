/**
　 * Title: A059_PrintTreeNode.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月17日下午9:45:07
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import nowcoder.swordOffer.com.A058_isSymmetrical.TreeNode;

public class A059_PrintTreeNode {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if (pRoot == null) {
			return res;
		}
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		boolean revse_op = true;
		qu.offer(pRoot);
		ArrayList<Integer> layerArr= new ArrayList<Integer>();
		while (!qu.isEmpty()) {
			int nodeNums = qu.size();
			for (int i = 0; i < nodeNums; i++) {
				TreeNode root = qu.poll();
				if (root == null) {
					continue;
				}
				if (revse_op) {
					layerArr.add(0,root.val);
				}else {
					layerArr.add(root.val);
				}
				qu.offer(root.right);
				qu.offer(root.left);
			}
			if (layerArr.size() != 0) {
				res.add(layerArr);
				layerArr.clear();
			}
			revse_op = !revse_op;
		}
		return res;
	}

}
