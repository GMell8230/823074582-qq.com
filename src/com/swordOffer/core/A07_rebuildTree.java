package com.swordOffer.core;

import java.util.HashMap;
import java.util.Map;

/**
* @author GMell
* @version 创建时间：2020年6月2日 下午9:55:20
* @describe
*/
public class A07_rebuildTree {
	
	private Map<Integer,Integer> inOrderIdx = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        // 记录inOrder的val和idx的对应关系，以供切分   
        for(int i = 0; i < in.length; i++){
            inOrderIdx.put(in[i],i);
        }
        // 思路是要对前序、中序进行递归的切分成左右子树，直到剩余一个节点，递归结束构建树
        return buildTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
    public TreeNode buildTree(int []pre, int preStart, int preEnd, int []in, int inStart, int inEnd){
        if(preStart > preEnd){
            return null;
        }
        int rootVal = pre[preStart];
        TreeNode root = new TreeNode(rootVal);
        if(preStart < preEnd){
            int inDivideIdx =  inOrderIdx.get(rootVal);
            int leftSubTreeNodes = inDivideIdx - inStart;
            int rigthSubTreeNodes = inEnd - inDivideIdx ;
            TreeNode leftSubTree = buildTree(pre, preStart+1, preStart + leftSubTreeNodes, in, inStart, inDivideIdx-1);
            TreeNode rightSubTree = buildTree(pre, preEnd - rigthSubTreeNodes, preEnd, in, inDivideIdx+1, inEnd);
            root.left = leftSubTree;
            root.right = rightSubTree;
            return root;
        }else{
            return root;
        }
    }
}
