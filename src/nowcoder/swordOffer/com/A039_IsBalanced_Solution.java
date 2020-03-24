/**
　 * Title: A039_IsBalanced_Solution.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月3日上午11:49:04
*/
package nowcoder.swordOffer.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import nowcoder.swordOffer.com.A022_PrintFromTopToBottom.TreeNode;

public class A039_IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
    	if (root == null) {
			return true;
		}
    	if (root.left == null && root.right == null) {
			return true;
		}
    	ArrayList<Integer> leftList = new ArrayList<Integer>();
    	ArrayList<Integer> rightList = new ArrayList<Integer>();
    	int leftDeep = 0;
    	int rightDeep = 0;
    	if (root.left != null) {
    		DFS(root.left, 1, leftList);
    		Collections.sort(leftList);
    		leftDeep = leftList.get(leftList.size()-1);
		}else {
			leftDeep = 0;
		}
    	if (root.right != null) {
    		DFS(root.right, 1, rightList);
    		Collections.sort(rightList);
    		rightDeep = rightList.get(rightList.size()-1);
		}else {
			rightDeep = 0;
		}
    	if (Math.abs(rightDeep - leftDeep) < 2) {
			return true;
		}else {
	    	return false;
		}
    }

	private void DFS(TreeNode root, int cur, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		if (root == null) {
			list.add(cur);
		}else {
			DFS(root.right, cur+1, list);
			DFS(root.left, cur+1, list);
		}

	}

}
