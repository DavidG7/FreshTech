import java.sql.*;


/*
 * DatabaseController establishes a connection to the SQL database.
 * using DatabaseController.close() will close the SQL connection.
 */

public class DatabaseController {
	
	//SQL Variables
	String sqlhost = "";
	String username = "";
	String password = "";
	
	static Connection conn = null;
	static Statement stmt = null;


	public DatabaseController(){	
		try{
			conn = DriverManager.getConnection(sqlhost,username,password);
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
	
}
