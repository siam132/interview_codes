/*
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode() {
		left = null;
		right = null;
	}

	TreeNode(int val) {
		this.val = val;
		left = null;
		right = null;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
*/
public class ConvertSortedArrayToBinarySearchTree {

	public TreeNode solution(int[] nums) {
		return solution(nums, 0, nums.length-1);
	}

	public TreeNode solution(int[] nums, int start, int end) {
		if (end < start) {
			return null;
		}

		int mid = (start+end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = solution(nums, start, mid-1);
		root.right = solution(nums, mid+1, end);
		return root;
	}

	// Test your soutions by printing your tree pre order
	public void preOrderTrav(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.val);
		preOrderTrav(root.left);
		preOrderTrav(root.right);
	}

	public static void main(String[] args) {

		int[] nums = new int[]{2,5,7,23,54,123,879};
		ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();

		TreeNode minTree = convertSortedArrayToBinarySearchTree.solution(nums);

		// Print tree to confirm correct solution
		convertSortedArrayToBinarySearchTree.preOrderTrav(minTree);
	}
}




