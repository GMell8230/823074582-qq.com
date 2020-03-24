/**
　 * Title: A60_PrintTreeNode2.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月17日下午11:08:51
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class A060_PrintTreeNode2 {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if (pRoot == null) {
			return res;
		}
    	Queue<TreeNode> qu =new LinkedList<TreeNode>();
    	qu.offer(pRoot);
    	while (!qu.isEmpty()) {
			int size = qu.size();
			ArrayList<Integer> nodeArr = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode tempNode = qu.poll();
				if (tempNode == null) {
					continue;
				}
				nodeArr.add(tempNode.val);
				qu.add(tempNode.left);
				qu.add(tempNode.right);
			}
			if (nodeArr.size() !=0) {
				res.add(nodeArr);
			}
		}
    	return res;
        
    }
}
