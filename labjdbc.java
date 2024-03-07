import java.util.*;
import java.sql.*;
public class labjdbc {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","Vivek");
				Statement stmt = conn.createStatement();
				String str = "create table employee(id number(5),name char(13),salary number(5),address char(11))";
				stmt.executeUpdate(str);
				System.out.println("Table created...");
				Scanner sc = new Scanner(System.in);
				
				boolean h=true;
				while(h) {
					System.out.print("1.Insert 2.update 3.delete 4.Display 5.Exit\nEnter your choice : ");
					int n = sc.nextInt();
					switch(n) {
						case 1:
							PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
							System.out.print("Enter emp id : ");
							int id = sc.nextInt();
							System.out.print("Enter emp name : ");
							String name = sc.next();
							System.out.print("Enter emp salary : ");
							long salary = sc.nextLong();
							System.out.print("Enter emp address : ");
							String address = sc.next();
							ps.setInt(1, id);
							ps.setString(2,name);
							ps.setLong(3, salary);
							ps.setString(4, address);
							ps.executeUpdate();
							System.out.println("Successfully inserted...");
							break;
						case 2: 
							System.out.print("Enter emp id to update details : ");
							int id1 = sc.nextInt();
							ResultSet rs1 = stmt.executeQuery("select * from employee");
							int c=0;
							while(rs1.next()) {
								if(id1==rs1.getInt(1)) {
									c=1;
									break;
								}
							}
							if(c==0) {
								System.out.println("Entered id is not in table..");
							}
							else {
								System.out.print("1.name 2.salary 3.address\nEnter your choice to update : ");
								int x = sc.nextInt();
								switch(x) {
									case 1:
										System.out.print("Enter new name to update : ");
										String uname = sc.next();
										stmt.executeUpdate("update employee set name = '"+uname+"' where id = "+id1);
										break;
									case 2:
										System.out.print("Enter new salary to update : ");
										long usalary = sc.nextLong();
										stmt.executeUpdate("update employee set salary = "+usalary+"where id = "+id1);
										break;
									case 3:
										PreparedStatement ps1 = conn.prepareStatement("update employee set address = (?) where id = (?)");
										System.out.print("Enter new address to update : ");
										String uaddress = sc.next();
										String a = "'"+uaddress+"'";
										ps1.setString(1, a);
										ps1.setInt(2, id1);
										stmt.executeQuery("update employee set address = "+a+"where id = "+id1);
										break;
								}
								System.out.println("Updated Successfully....");
							}
							break;
						case 3:
							System.out.print("Enter employee id to remove from list : ");
							int id2 = sc.nextInt();
							ResultSet rs2 = stmt.executeQuery("select * from employee");
							int x=0;
							while(rs2.next()) {
								if(id2==rs2.getInt(1)) {
									x=1;
									break;
								}
							}
							if(x==0) {
								System.out.println("Entered id is not in the list..");
							}
							else {
								stmt.executeUpdate("delete from employee where id = "+id2);
								System.out.println("row deletetion Successfull...");
							}
							break;
						case 4:
							ResultSet rs = stmt.executeQuery("select * from employee");
							System.out.println("ID\tNAME\t\tSALARY\tADDRESS");
							while(rs.next()) {
								System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getLong(3)+"\t"+rs.getString(4));
							}
							break;
						default:
						
							h=false;
							break;
					}
				}
				stmt.executeQuery("drop table employee");
				System.out.println("Table is droped...");
			}
			catch(SQLException e1) {
				
				System.out.println(e1);
			}	
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}
}