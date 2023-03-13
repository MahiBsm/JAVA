package collectionpractice;

public class Linkedlist <T> {
	
	Node head;
	Node last;
	Linkedlist(){
		head=null;
		last=null;
	}
	
	class Node {
		T value;
		Node prev;
		Node next;
		Node(T value){
			this.value = value; 
			prev=null;
			next=null;
		} 
	}
	public void addelements(T val) {
		if(head==null) {
			Node node=new Node(val);
			head = node;
			last=node;
			
		}
		else {
			Node node=new Node(val);
			last.next=node;
			node.prev=last;
			last=node;
			
		}
	}
	public void viewfront() {
		Node run=head;
		while(run!=null) {
			System.out.println(run.value);
			run=run.next;
		}
		
	}
	public void viewback() {
		Node run=last;
		while(run!=null) {
			System.out.println(run.value);
			run=run.prev;
		}
		
	}

}
