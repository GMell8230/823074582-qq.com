package com.swordOffer.core;

/**
 * @author GMell
 * @version ����ʱ�䣺2020��7��5�� ����4:33:56
 * @describe
 */
public class A37_Serialize {
	private String deserializeStr;
	String Serialize(TreeNode root) {
		if (root == null) {
			return "#";
		}
		return root.val + " " + Serialize(root.left) + " "+Serialize(root.right);
	}

	TreeNode Deserialize(String str) {
		deserializeStr = str;
		return DeserializeImp();
	}

	private TreeNode DeserializeImp() {
		if (deserializeStr.length() == 0) {
			return null;
		}
		int idx = deserializeStr.indexOf(" ");
		String node = idx == -1 ? deserializeStr : deserializeStr.substring(0,idx);
		deserializeStr = idx == -1 ? "" : deserializeStr.substring(idx+1);
		if (node.equals("#")) {
			return null;
		}
		int val = Integer.valueOf(node);
		TreeNode t = new TreeNode(val);
		t.left = DeserializeImp();
		t.right = DeserializeImp();
		return t;
		
	}
}
