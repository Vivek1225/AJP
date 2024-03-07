import java.util.*;
import java.io.*;
import java.sql.*;
public class metaData {
	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "Vivek");
		Statement stmt = conn.createStatement();
		String str = "create table employee(id number(5),name char(13),salary number(5),address char(11))";
		stmt.executeUpdate(str);
		System.out.println("Table created...\n");
		ResultSet rs = stmt.executeQuery("select * from employee");
		ResultSetMetaData r = rs.getMetaData();
		int x = r.getColumnCount();
		System.out.println("Number of column is in the employee table : "+x);
		System.out.println("Name\tType");
		System.out.println("-------\t----------");
		for(int i=1;i<=x;i++) {
			System.out.println(r.getColumnName(i)+"\t"+r.getColumnTypeName(i)+"("+r.getPrecision(i)+")");
		}
		stmt.executeQuery("drop table employee");
		System.out.println("\nTable is droped...");
	}

}
