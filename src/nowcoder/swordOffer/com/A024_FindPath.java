/**
　 * Title: A024_FindPath.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月1日下午9:47:54
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import nowcoder.swordOffer.com.A022_PrintFromTopToBottom.TreeNode;

public class A024_FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    	if (root == null) {
			return arr;
		}
    	int curVal = 0;
    	Stack<Integer> list = new Stack<Integer>();
    	DFS(curVal,target,root,list, arr);
    	
    	return arr;
    }

	private void DFS(int curVal, int target, TreeNode root, Stack<Integer> list, ArrayList<ArrayList<Integer>> arr) {
		// TODO Auto-generated method stub
		if (root == null &&curVal == target) {
				arr.add(new ArrayList(list));
				return;
		}
		if (root == null) {
			return;
		}
		list.add(root.val);
		DFS(curVal+root.val, target, root.right, list, arr);
		list.pop();
		if (root.left == null && root.right == null) {
			return;
		}
		list.add(root.val);
		DFS(curVal+root.val, target, root.left, list, arr);
		list.pop();
	}
}
