import java.sql.*;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


/*
 * DatabaseController establishes a connection to the SQL database.
 * using DatabaseController.close() will close the SQL connection.
 */

public class DatabaseController {
	

	//SQL Variables	
	
	String ipaddress = "10.50.15.40";
	
	MysqlDataSource ds = new MysqlDataSource();
	Connection conn = null;
	Statement stmt = null;


	public DatabaseController(){	
		

		ds.setDatabaseName("mydb");
		ds.setUser("root");
		ds.setPassword("password");
		ds.setServerName(ipaddress);
		try{
			conn = ds.getConnection();
		}catch(SQLException se){
			  System.out.println("SQL Exception");
		      se.printStackTrace();
	    }catch(Exception e){
		      e.printStackTrace();
		}finally{
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }
		      }
		}
		
	}
	
	public void close(){
		try{
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	
	 public Connection getConn(){
		 return conn;
	 }
	 
	 public Statement getStmt(){
		 return stmt;
	 }
	
}
