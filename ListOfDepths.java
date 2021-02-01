import java.util.*;
public class ListOfDepths {

	Map<Integer, List<Integer>> depths = new HashMap<>();
	List<List<Integer>> depthsList;

	public List<List<Integer>> solution(TreeNode root) {
		traverse(root, 0);

		depthsList = new ArrayList<>();

		for (List<Integer> list : depths.values()) {
			depthsList.add(0, list);
		}
		return depthsList;
	}

	public void traverse(TreeNode root, int depth) {
		if (root == null) {
			return;
		}

		if(depths.containsKey(depth)) {
			depths.get(depth).add(root.val);
		}
		else {
			depths.put(depth, new ArrayList<Integer>());
			depths.get(depth).add(root.val);
		}
		traverse(root.left, depth+1);
		traverse(root.right, depth+1);
	}

	// Driver code to test solution
	public static void main(String[] args) {
		
		// Populate a tree with 25 random numbers
		Random rand = new Random();
		TreeNode testTree = new TreeNode(rand.nextInt(100));
		for (int i = 0; i < 20; i++) {
			testTree.insert(testTree, rand.nextInt(100));
		}

		ListOfDepths obj = new ListOfDepths();
		obj.solution(testTree);
		System.out.println(obj.depthsList);
	}
}