import java.sql.*;


public class DatabaseController {
	
	static Connection conn = null;
	static Statement stmt = null;
	
	String host = "";
	String username = "";
	String password = "";
	
	public DatabaseController(String db){
		
		
		if(db.equals("sql")){
			try{
				conn = DriverManager.getConnection(host,username,password);
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
		}else if(db.equals("mdb")){
			
		}else{
			System.out.println("DatabaseController was passed neither 'sql' nor 'mdb'");
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
