package day55;

import java.util.Scanner;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		SNode head=null;
		head=createList(head);
		System.out.println("Display after creation");
		display(head);
		
		head=addFirst(head);
		System.out.println("Display after Adding at first position");
		display(head);
		
		addLast(head);
		System.out.println("Display after Adding at last position");
		display(head);
		
		addMid(head);
		System.out.println("Display after Adding at mid position");
		display(head);
		
		head=delFirst(head);
		System.out.println("Display after Deleting first position");
		display(head);
	}

	private static SNode delFirst(SNode head) {
		SNode temp=head;
		head=temp.getNext();
		return head;
	}

	private static void addMid(SNode head) {
		SNode temp=head;
		SNode nn=getMeNewNode();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter position of new node");		
		int position=sc.nextInt();				//position=3
		
		int i=1;
		while(i<position-1)
		{
			temp=temp.getNext();
			i++;
		}
		
		nn.setNext(temp.getNext());
		temp.setNext(nn);
	}

	private static void addLast(SNode head) {
		SNode temp=head;
		SNode nn=getMeNewNode();
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(nn);
	}

	private static SNode addFirst(SNode head) {
		SNode temp=head;
		SNode nn=getMeNewNode();
		nn.setNext(temp);
		head=nn;
		return head;
		
	}

	private static void display(SNode head) {
		SNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println("null");
	}

	private static SNode createList(SNode head) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of linked list");		//3
		int size=sc.nextInt();
		SNode temp=null;
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter data for Node "+i);		//20
			int data=sc.nextInt();		//data=20
			SNode nn=new SNode(data);
			if(head==null)  //true
			{
				temp=head=nn;
			}
			else
			{
				temp.setNext(nn);
				temp=temp.getNext();
			}
		}
		return head;
	}

	
	public static SNode getMeNewNode()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data for Node");		//40
		int data=sc.nextInt();		//data=40
		SNode nn=new SNode(data);
		return nn;
	}
}
