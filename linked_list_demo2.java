import java.util.*;
public class linked_list_demo2 {
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		System.out.println(l);
		l.add(1,20);
		System.out.println(l);
		l.addFirst(30);
		l.add(null);
		System.out.println(l);
		l.remove(null);
		l.removeLastOccurrence(30);
		l.removeFirstOccurrence(10);
		System.out.println(l);
	}
}