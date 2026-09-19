package day55;

import java.util.Scanner;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DNode head=null;
		head=createList(head);
		System.out.println("Display after creation");
		display(head);
		
	}

		private static void display(DNode head) {
		DNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println("null");
	}

	private static DNode createList(DNode head) {
		DNode temp=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of linked list");		//3
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter data for node "+i);		//3
			int data=sc.nextInt();
			DNode nn=new DNode(data);
			if(head==null)
			{
				temp=head=nn;
			}
			else
			{
				temp.setNext(nn);
				nn.setPrev(temp);
				temp=temp.getNext();
			}
		}
		return head;
	}

}
