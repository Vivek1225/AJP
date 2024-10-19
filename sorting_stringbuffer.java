import java.util.*;
public class sorting_stringbuffer {
	public static void main(String args[]) {
		TreeSet<StringBuffer> t=new TreeSet<StringBuffer>(new comparator1());
		t.add(new StringBuffer("Hello"));
		t.add(new StringBuffer("Amazing"));
		t.add(new StringBuffer("VVIT"));
		t.add(new StringBuffer("INF"));
//		t.add(8);
//		t.add(10);
//		t.add(11);
//		t.add(12);
//		t.add(16);
//		t.add("25");
		//System.out.println(uniCode(10));
		
		System.out.println(t);
	}
}
class comparator1 implements Comparator<Object>{
	public int compare(Object b1, Object b2) {
		String s1 = b1.toString();
		String s2 = b2.toString();
		return -s1.compareTo(s2);
	}
}