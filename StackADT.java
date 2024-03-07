import java.util.Scanner;
interface stackoperation
{
	 public void push(int i);
	 public void pop();
	 public void display();
	 public void peek();
}

class Astack implements stackoperation
{
	int stack[]=new int[10];
	int top=-1;
	int i;
	public void push(int item)
	{
		
		if(top>=4)
		{
		System.out.println("Stack is full..");
		}
		else
		{
		top=top+1;
		stack[top]=item;
		System.out.println("Pushed Successfully");
		}
	}
	public void pop()
	{
		if(top<0)
		System.out.println("Stack is empty no element to delete...");
		else
		{
		System.out.println("Popped : "+stack[top]);
		top=top-1;
		}
	}
	public void display()
	{
		if(top<0)
			System.out.println("Stack is empty...");
		else
		{
			System.out.print("Elements in the stack are : ");
			for(i=0;i<=top;i++) {
				System.out.print(stack[i]+" ");
			}
			System.out.println();
		}
	}
	public void peek() {
		if(top<0) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Peek value : "+stack[top]);
		}
	}
}
class usingarray{
	public void start() {	
		int ch;
		int i;
		Astack s=new Astack();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);     
		boolean h=true;
		while(h) {
			System.out.println("1.push  2.pop  3.display  4.peek  5.exit");
			System.out.print("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("Enter the value to push:");
					i=sc.nextInt();
					s.push(i);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.display();
					break;
				case 4:
					s.peek();
					break;
				case 5:
					break;
			}
			if(ch==5) {
				h = false;
			}
		}
	}
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class ALinkedList implements stackoperation{
	Node top =null;
	public void push(int ele) {
		Node ptr = new Node(ele);
		 if(top==null){
	            top=ptr;
	            System.out.println("Pushed Successfully");
	        }
	        else{
	            ptr.next=top;
	            top=ptr;
	            System.out.println("Pushed Successfully");
	        }
	    }

	public void pop() {
		if(top == null) {
			System.out.println("Stack is empty");
			return ;
		}
		else {
			int del = top.data;
			top = top.next;
			System.out.println("Poped element is : "+del);
			return;
		}
	}
	public void peek() {
		if(top == null) {
			System.out.println("Stack is empty");
			return;
		}
		else {
			int a = top.data;
			System.out.println("Peek value is: "+a);
			return ;
		}
	}
	public void display() {
		if(top == null) {
			System.out.println("Stack is empty");
			return;
		}
		else {
			Node ptr = top;
			System.out.print("Elements in stack are : ");
			while(ptr!=null) {
				System.out.print(ptr.data+"-->");
				ptr = ptr.next;
			}
			System.out.println("NULL");
			return;
		}
	}
}
class usingLinkedList{
	public void start() {	
		int i1;
		ALinkedList q=new ALinkedList();
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);     
		boolean h1=true;
		while(h1) {
			System.out.println("1.push  2.pop  3.display  4.peek  5.exit");
			System.out.print("Enter your choice:");
			int ch1 = sc1.nextInt();
			switch(ch1)
			{
				case 1:
					System.out.print("Enter the value to push:");
					i1=sc1.nextInt();
					q.push(i1);
					break;
				case 2:
					q.pop();
					break;
				case 3:
					q.display();
					break;
				case 4:
					q.peek();
				case 5:
					break;
			}
			if(ch1==5) {
				h1 = false;
			}
		}
	}
}
class StackADT{
	public static void main(String[] args) {
		System.out.println("1.using array \n2.using Linked list");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your choice either array or Linked List: ");
		int c = s.nextInt();
		switch(c) {
			case 1:
				usingarray ua = new usingarray();
				ua.start();
				break;
			case 2:
				usingLinkedList ul = new usingLinkedList();
				ul.start();
				break;
			default:
				System.out.println("Enter correct choice");
				break;
		}
	}
}