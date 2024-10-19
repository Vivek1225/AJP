import java.util.*;
public class Tree_Set_demo {
	public static void main(String args[]) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(13);
		t.add(45);
		t.add(69);
		System.out.println(t);
	}

}
class MyComparator implements Comparator<Object>{
	public int compare(Object obj1,Object obj2){ 
	  Integer l1=(Integer)obj1; 
	  Integer l2=(Integer)obj2; 
	  if(l1<l2) { 
		  return +1;
	  }
	  else if(l1 > l2) {
		  return -1; 
	  }
	  else 
		 return 0; 
	 } 
}