package day54;

import java.util.Scanner;

public class BinarySeacrhTreeDemo2 {

	public static void main(String[] args) {
		Node root=null;
		root=createBST(root);
		inorder(root);
		System.out.println(findLCA(root,125, 200).getData());
	}

//	private static void inorder(Node root) {
//	    
//	    if (root == null)
//	        return;
//
//	    inorder(root.getLeft());       // LEFT
//
//	    System.out.print(root.getData() + " ");  // ROOT
//
//	    inorder(root.getRight());      // RIGHT
//	}
	
	private static void inorder(Node root) {
	    
	    if (root != null)
	    {

	    inorder(root.getLeft());       // LEFT

	    System.out.print(root.getData() + " ");  // ROOT

	    inorder(root.getRight());      // RIGHT
	    }
	}

	private static Node createBST(Node root) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("Enter data for the node");
			int data=sc.nextInt();  //data=125
			Node nn=new Node(data);
			
			if(root==null)
			{
				root=nn;
			}
			else
			{   insertNode(root,nn);
			}
			
			System.out.println("Do you wish to add another node 1-Yes 0-No");
			choice=sc.nextInt();
		}while(choice==1);
		
		return root;
	}								//150         125
									//  2000,     3000
	private static void insertNode(Node root, Node nn) {
		if(nn.getData()>=root.getData())
		{
			if(root.getRight()==null)
				root.setRight(nn);
			else
				insertNode(root.getRight(), nn);
		}
		else
		{
			if(root.getLeft()==null)
				root.setLeft(nn);
			else
				insertNode(root.getLeft(), nn);
		}
		
		
	}
	
	
	private static Node findLCA(Node root, int n1, int n2) {

	    if (root == null)
	        return null;

	    // Both nodes are on the left
	    if (n1 < root.getData() && n2 < root.getData()) {
	        return findLCA(root.getLeft(), n1, n2);
	    }

	    // Both nodes are on the right
	    if (n1 > root.getData() && n2 > root.getData()) {
	        return findLCA(root.getRight(), n1, n2);
	    }

	    // One on left and one on right
	    // OR one of them is the current node
	    return root;
	}

}
