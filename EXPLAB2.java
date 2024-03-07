import java.io.*;
import java.util.*;
public class EXPLAB2 {

	public static void main(String[] args) throws Exception{
			FileInputStream fis = new FileInputStream("phone_num.txt");
		
			Scanner sc = new Scanner(fis);
			Hashtable<String,String> h = new Hashtable<String,String>();
			String[] array;
			String a,str;
			while(sc.hasNext()) {
				str=sc.nextLine();
				array =str.split("\t");
				h.put(array[0],array[1]);
			}
			System.out.println("Hash table : "+h);
			System.out.print("Enter the name : ");
			Scanner s = new Scanner(System.in);
			a=s.nextLine();
			boolean containsKey = h.containsKey(a);
			if(containsKey) {
				System.out.println("Phone Number : "+h.get(a));
			}
			else {
				System.out.println("Not in the list");
			}

	}

}