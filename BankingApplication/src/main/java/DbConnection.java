

	import java.sql.Connection;
    import java.sql.DriverManager;

	//Database Connection information
    
    public class DbConnection {
	 static String driver="com.mysql.cj.jdbc.Driver";
	 static String url="jdbc:mysql://localhost:3306/bank";
	 static String un="root";
	 static String pass="root";
	 static Connection conn=null;
	 
	 public static Connection getConnection() {
		 try {
			 Class.forName(driver);
			 conn=DriverManager.getConnection(url, un, pass);
			 if(conn==null) {
				 System.out.println("Error in connection");
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 return conn;
}

}

   /* public class ConnectionBank {
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
    		*/