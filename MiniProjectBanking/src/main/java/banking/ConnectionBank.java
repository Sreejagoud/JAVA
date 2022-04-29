package banking;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBank {
static String driver="com.mysql.cj.jdbc.Driver";
static String url="jdbc:mysql://localhost:3306/bank";
static String un = "root";
static String pass= "root";
static ConnectionBank con=null;
public static Connection getConnection;
public static ConnectionBank getConnection() {
	
	try {
		Class.forName(driver);
		Connection conn= DriverManager.getConnection(url,un,pass);
		if(con==null) {
			System.out.println("Connection object is null");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	
}	
}
