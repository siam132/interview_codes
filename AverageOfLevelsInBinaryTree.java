import java.util.*;
public class AverageOfLevelsInBinaryTree {
    // BFS is the optimal solution
    List<Double> results = new ArrayList();
    Deque<TreeNode> queue = new LinkedList<>();
    
    public List<Double> solution(TreeNode root) {
        if (root == null) { return results; }
        
        queue.addLast(root);
        
        while(queue.size() != 0) {
            double sum = 0.0;
            int n = queue.size();
            
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.removeFirst();
                sum += node.val;
                if (node.left != null) queue.addLast(node.left);
                if (node.right != null) queue.addLast(node.right);
            }
            
            results.add(sum/n);
        }
        
        return results;
    }

    // Driver code to test solution
    public static void main(String[] args) {
        // Populate a tree with 25 random numbers
        Random rand = new Random();
        TreeNode testTree = new TreeNode(rand.nextInt(100));
        for (int i = 0; i < 5; i++) {
            testTree.insert(testTree, rand.nextInt(100));
        }

        AverageOfLevelsInBinaryTree obj = new AverageOfLevelsInBinaryTree();
        obj.solution(testTree);

        System.out.println(obj.results);
    }
}