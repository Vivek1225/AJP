import java.util.*;
public class iterator_demo {
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator<Integer> it=l.iterator();
		while(it.hasNext()) {
			Integer n=(Integer)it.next();
			if(n%2==0) {
				System.out.println(n);
			}
			else {
				it.remove();
			}
		}
		System.out.println("After evenification linked list is: "+l);
	}
}