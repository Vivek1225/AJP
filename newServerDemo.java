import java.net.*;
import java.io.*;
import java.util.*;
public class newServerDemo {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(7381);
			Socket s = ss.accept();
			Scanner scc = new Scanner(System.in);
			DataOutputStream dos1 = new DataOutputStream(s.getOutputStream());
			DataInputStream dis1 = new DataInputStream(s.getInputStream());
			String req1 = "";
			String res1 = "";
			do {
				req1 = dis1.readUTF();
				System.out.println("Client says : "+req1);
				System.out.print("Enter response message to client : ");
				res1=scc.nextLine();
				dos1.writeUTF(res1);
			}while(!res1.equalsIgnoreCase("Stop"));
			ss.close();
			scc.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
