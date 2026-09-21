package day55;

import java.util.Scanner;

public class BinarySeacrhTreeDemo {

	public static void main(String[] args) {
		Node root=null;
		root=createBST(root);
		System.out.println("INORDER " );
		inOrderTraversal(root);
		
		System.out.println("PREORDER " );
		preOrderTraversal(root);
		
		System.out.println("POSTORDER " );
		postOrderTraversal(root);
	}


	private static void inOrderTraversal(Node root) {
		if(root!=null)
		{
			inOrderTraversal(root.getLeft());
			System.out.print(root.getData()+",");
			inOrderTraversal(root.getRight());
		}
		
	}

	private static void preOrderTraversal(Node root) {
		if(root!=null)
		{
			System.out.print(root.getData()+",");
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
		
	}
	
	private static void postOrderTraversal(Node root) {
		if(root!=null)
		{
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.print(root.getData()+",");
			
		}
		
	}


	private static Node createBST(Node root) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			System.out.println("Enter data for the node");
			int data=sc.nextInt();  //data=100
			Node nn=new Node(data);
			
			if(root==null)
			{
				root=nn;
			}
			else
			{     //200            100                   true
				if(nn.getData() >= root.getData())
				{
						if(root.getRight()==null)
						{
							root.setRight(nn);
						}
						else
						{
							insertNode(root.getRight(),nn);    //(2000,5000)
						}
				}
				else
				{
					if(root.getLeft()==null)
					{
						root.setLeft(nn);
					}
					else
					{
						insertNode(root.getLeft(),nn);
					}
				}
			}
			
			System.out.println("Do you wish to add another node 1-Yes 0-No");
			choice=sc.nextInt();
		}while(choice==1);
		
		return root;
	}								//150         200
									//  2000,     5000
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
}
