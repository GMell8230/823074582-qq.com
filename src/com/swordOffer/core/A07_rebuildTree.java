package com.swordOffer.core;

import java.util.HashMap;
import java.util.Map;

/**
* @author GMell
* @version ����ʱ�䣺2020��6��2�� ����9:55:20
* @describe
*/
public class A07_rebuildTree {
	
	private Map<Integer,Integer> inOrderIdx = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        // ��¼inOrder��val��idx�Ķ�Ӧ��ϵ���Թ��з�   
        for(int i = 0; i < in.length; i++){
            inOrderIdx.put(in[i],i);
        }
        // ˼·��Ҫ��ǰ��������еݹ���зֳ�����������ֱ��ʣ��һ���ڵ㣬�ݹ����������
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
