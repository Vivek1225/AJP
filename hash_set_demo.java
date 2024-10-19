import java.util.*;
public class hash_set_demo {
	public static void main(String args[]) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(20);
		h.add(30);
		h.add(20);
		h.add(null);
		System.out.println(h);
		Iterator<Integer> it=h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Hash Code Of An Object: "+h.hashCode());
	}
	
}