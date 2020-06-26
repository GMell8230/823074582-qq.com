package com.swordOffer.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.sun.xml.internal.ws.api.pipe.Tube;


/**
* @author GMell
* @version 创建时间：2020年6月26日 下午4:25:25
* @describe
*/
public class A32_2_PrintFromZ {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<>(); 
    	if (pRoot == null) {
			return res;
		}
    	
    	Queue<TreeNode> qu = new LinkedList<TreeNode>();
    	qu.add(pRoot);
    	Boolean isReverse = false;
    	while (!qu.isEmpty()) {
    		int curLen = qu.size();
    		ArrayList<Integer> layerRes = new ArrayList<>();
    		while (curLen > 0) {
				curLen--;
				TreeNode curNode = qu.poll();
				layerRes.add(curNode.val);
				if (curNode.right != null) {
					qu.add(curNode.right);
				}
				if (curNode.left!= null) {
					qu.add(curNode.left);
				}
			}
    		isReverse = !isReverse;
    		if (isReverse) {
				java.util.Collections.reverse(layerRes);
			}
    		res.add(layerRes);
		}
    	return res;
    }
}
