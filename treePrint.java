import java.util.List;

class TreeNode {
	TreeNode left;
	TreeNode right;
	Integer val;
}

public class treePrint {
	//前序
	List<Integer> resPre;
	//中
	List<Integer> resInorder;
	//后
	List<Integer> resAfter;
	public void pre (TreeNode tree) {
		if (tree == null) {
			return;
		}
		resPre.add(tree.val);
		if (tree.left != null) pre(tree.left);
		if (tree.right != null) pre(tree.right);
	}

	public void inorder (TreeNode tree) {
		if (tree == null) {
			return;
		}
		if (tree.left != null) inorder(tree.left);
		resInorder.add(tree.val);
		if(tree.right != null) inorder(tree.right);
	}

	public void after(TreeNode tree) {
		if (tree == null) return;
		if (tree.left != null) after(tree.left);
		if (tree.right != null) after(tree.right);
		resAfter.add(tree.val);
	}
}
