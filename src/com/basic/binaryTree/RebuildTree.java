package com.basic.binaryTree;

import java.util.HashMap;
import java.util.Map;

import com.swordOffer.core.TreeNode;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��7�� ����4:28:55
* @describe
*/
public class RebuildTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	Map<Integer, Integer> inOrderIdx = new HashMap<Integer, Integer>();
    	for (int i= 0; i < in.length; i++) {
			inOrderIdx.put(in[i], i);
		}
    	// �ݹ����
        return buildBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1, inOrderIdx);
    }
    public TreeNode buildBinaryTree(int []pre, int preL, int preR, int []in, int inL, int inR, Map<Integer, Integer> inOrderIdx) {
		//�ݹ��ص�
    	if (preL > preR) {
			return null;
		}
    	int nodeVal = pre[preL];
    	TreeNode cur = new TreeNode(nodeVal);

    	if (preL < preR) {
        	int inIdx = inOrderIdx.get(nodeVal);
        	int leftSubNodes = inIdx - inL;
        	int rightSubNodes = inR - inIdx;
			cur.left = buildBinaryTree(pre, preL+1, preL+leftSubNodes, in, inL, inIdx-1, inOrderIdx);
			cur.right = buildBinaryTree(pre, preR-rightSubNodes+1, preR, in, inIdx+1, inR, inOrderIdx);
			return cur;
		}else {
			return cur; 
		}
    }
}

