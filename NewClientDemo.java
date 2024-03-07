import java.net.*;
import java.io.*;
import java.util.*;
public class NewClientDemo {

	public static void main(String[] args) {
		try {
			Socket cs = new Socket("localhost",7381);
			Scanner sc = new Scanner(System.in);
			DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
			DataInputStream dis = new DataInputStream(cs.getInputStream());
			String req = "";
			String res = "";
			do {
				System.out.print("Enter the message to sent server : ");
				req = sc.nextLine();
				dos.writeUTF(req);
				res = dis.readUTF();
				System.out.println("Server say : "+res);
			}while(!req.equalsIgnoreCase("stop"));
			sc.close();
			cs.close();
		}
		catch(IOException w) {
			System.out.println(w);
		}
	}

}
