import java.util.*;
class LinkedListNode{
	int data;
	LinkedListNode next;
	LinkedListNode(int data){
		this.data=data;
		this.next=null;
	}
}
class LinkedList{
	LinkedListNode head;
	LinkedListNode tail;
	void insert(int value){
		LinkedListNode node=new LinkedListNode(value);
		if(head == null){
			head=node;
			tail=node;
		}
		else{
			tail.next=node;
			tail=node;
		}
	}
	void reverse(LinkedListNode head){
		if(head == null){
			return;
		}
		reverse(head.next);
		System.out.print(head.data+" ");
	}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	LinkedList list=new LinkedList();
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		int value=sc.nextInt();
		list.insert(value);
	}
	/*list.insert(1);
	list.insert(2);
	list.insert(3);
	list.insert(4);
	list.insert(5);*/
	list.reverse(list.head);
}
}