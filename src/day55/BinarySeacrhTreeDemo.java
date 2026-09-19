package day55;

import java.util.Scanner;

public class BinarySeacrhTreeDemo {

	public static void main(String[] args) {
		Node root=null;
		root=createBST(root);
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
			{     //125             100                   true
				if(nn.getData() >= root.getData())
				{
						if(root.getRight()==null)
						{
							root.setRight(nn);
						}
						else
						{
							insertNode(root.getRight(),nn);
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
}
