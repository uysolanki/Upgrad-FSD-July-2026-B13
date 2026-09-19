package day54;

import java.util.ArrayList;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		int[] arr = {
	            1, 2, 3, 4, 5, 6, 7, 8, 9,
	            -1, -1, -1, -1, -1, -1,
	            10, -1, 11, -1, -1, -1, -1, -1
	        };
	        Node root = CreateBT(arr);
	        inorder(root);
	        System.out.println();
	        System.out.println("LCA of 8 and 9 = " + findLCA(root, 8, 9));   // 4
	        System.out.println("LCA of 8 and 9 = " + findLCA(root, 11, 6));   // 1
	}

	private static void inorder(Node root) {
	    
	    if (root == null)
	        return;

	    inorder(root.getLeft());       // LEFT

	    System.out.print(root.getData() + " ");  // ROOT

	    inorder(root.getRight());      // RIGHT
	   
	}

	 // Build tree from level-order array (-1 = null)
    public static Node CreateBT(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) {
            return null;
        }
        // Step 1: Create Node object for each non -1 value
        ArrayList<Node> list = new ArrayList<>();
        for (int value : arr) {
            if (value == -1) {
                list.add(null);   // empty place
            } else {
                list.add(new Node(value));
            }
        }
        // Step 2: Connect children using index formula
        for (int i = 0; i < list.size(); i++) {
            Node parent = list.get(i);
            if (parent == null) {
                continue; // skip empty slots
            }
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;
            if (leftIndex < list.size()) {
                parent.setLeft(list.get(leftIndex));
            }
            if (rightIndex < list.size()) {
                parent.setRight(list.get(rightIndex));
            }
        }
        return list.get(0); // root is always at index 0
    }
    
    
    // LCA using 2 ArrayLists
    public static int findLCA(Node root, int p, int q) {
        ArrayList<Integer> pathP = new ArrayList<>();
        ArrayList<Integer> pathQ = new ArrayList<>();
        getPath(root, p, pathP);
        getPath(root, q, pathQ);
        int i = 0;
        int size = Math.min(pathP.size(), pathQ.size());
        // move while values are same
        while (i < size && pathP.get(i).equals(pathQ.get(i))) {
            i++;
        }
        // last common node
        return pathP.get(i - 1);
    }

    // Find path using ArrayList (Collection)
    public static boolean getPath(Node root, int target, ArrayList<Integer> path) {
        if (root == null) {
            return false;
        }
        // add current node to path
        path.add(root.getData());
        // found target
        if (root.getData() == target) {
            return true;
        }
      
        // search in left subtree
        if (getPath(root.getLeft(), target, path)) {
            return true;
        }
        // search in  right subtree
        if (getPath(root.getRight(), target, path)) {
            return true;
        }
        // wrong path -> remove last node (backtrack)
        path.remove(path.size() - 1);
        return false;
    }
}
