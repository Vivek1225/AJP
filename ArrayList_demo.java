import java.util.*;
public class ArrayList_demo {
		public static void main(String[] args) {
			ArrayList<String> a = new ArrayList<String>();//here <string> is used to mention the type of data that is going to be stored in it
			a.add("Hello");
			a.add("yes");
			a.add("Happy");
			System.out.println(a);
			a.remove(1);
			System.out.println(a);
			a.remove("Hello");
			System.out.println(a);
			//a.add(1);
			//System.out.println(a);
			a.removeFirst();
			System.out.println(a);
		}

}
