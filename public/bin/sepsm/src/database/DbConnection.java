/* *

* */
package database;

import java.sql.*;

public class DbConnection {   
	
	static String login = "root";   
	static String password = "david";   
	static String url = "jdbc:mysql://localhost/diagnostico_rule"; 
	Connection conn = null;   
	public DbConnection() {      
		try {        
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);
                       
		}
		catch(SQLException e){
			System.out.println(e);
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
	public Connection getConnection(){
		return conn;
	}
	public void desconectar(){
		conn = null;
	}
}
