package ClassWorks;
import java.sql.*;

public class DBCon {
	static final String JDBC_connect = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://172.16.0.10:3306/test";
	static final String User = "root";
	static final String Pass = "ADMIN";
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_connect);
		Connection conn = DriverManager.getConnection(DB_URL,User,Pass);
		Statement Stm = conn.createStatement();
		String sql="insert into hosts (HO_ID,HO_NAME ) values (14355512,'Nirmal')";
		int NoOfrows = Stm.executeUpdate(sql);
		System.out.println(NoOfrows);
		String sql1= "Select * from hosts where  HO_ID = 14355512";
		
		ResultSet Rs = Stm.executeQuery(sql1);
		while(Rs.next()){
		int id  = Rs.getInt("HO_ID");
        String name = Rs.getString("HO_NAME");
        System.out.print("ID: " + id +", Name: " + name +"\n");
		}
		Rs.close();
		Stm.close();
		conn.close();

	

	}

}
