

class RangeSumBST {

    public static void main(String[] args) {
    
       
    }

    public int rangeSumBST(TreeNode root, int L, int R) {

        return helper(root, L, R);

    }

    public int helper(TreeNode root, int R, int L) {
        if (root == null)
            return 0;
        int sum = 0;
        int data = root.val;

        if (data < L)
            sum += helper(root.right, R, L);

        else if (data < R)
            sum += helper(root.left, R, L);

        else

            sum += helper(root.left, R, L) + helper(root.right, R, L);

        return sum; 

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }
}

// do tree treversal of the BST
// use a helper function to pass the root and the range
// check to see if the current node val is in range
// if less than L -- traverse right
// if less than R -- traverse left
// else traverse left+right
// return sum
