import java.util.*;

public class Enumeration_demo {
	 public static void main(String[] args) {
	        Vector<Integer> v=new  Vector<Integer>();
	        v.add(10);
	        v.add(20);
	        v.add(null);
	        System.out.println(v);
	        Enumeration<Integer> e=v.elements();
	        while (e.hasMoreElements()) {
	            System.out.println(e.nextElement());
	        }
	}
}