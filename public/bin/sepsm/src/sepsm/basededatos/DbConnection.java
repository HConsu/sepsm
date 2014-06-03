/* *

* */
package sepsm.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnection {   
	static String bd = "diagnostico_rule";   
	static String login = "root";   
	static String password = "david";   
	static String url = "jdbc:mysql://localhost/" + bd;   
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
