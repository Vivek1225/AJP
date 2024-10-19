import java.util.*;
public class Linked_List_demo {
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.addFirst(10);
		System.out.print(l);
		l.add(1515);
		System.out.println("Enter a number: ");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		l.add(a);
		System.out.println(l);
	}
}