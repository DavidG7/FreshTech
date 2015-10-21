import java.sql.*;


public class LoginSQL {
	//employee variables- attributes
	private String username;
	private String password;
	public DatabaseController db;
	public boolean loggedIn;

	
	public LoginSQL(){
		username = null;
		password = null;
		loggedIn = false;
		db = new DatabaseController();
	}
	//method for getting username
		public String getUsername(){
			return username;
		}
		
		//method for setting username
		public void setUsername(String username){
			this.username = username;
			return;
		}
		
		//method for getting password
		public String getPassword(){
			return password;
		}
		
		//method for setting password
		public void setPassword(String password){
			this.password = password;
			return;
		}
		
		public boolean establishlogin(String username, String password){
			
			 try { 
				 	Statement stmt = db.getConn().createStatement();
				 	String sql1 = "SELECT employeeusername, employeepassword FROM Employee";
				 			ResultSet rs = stmt.executeQuery(sql1);
				 			
				 			while(rs.next()) {
				 				
				 			if(login(username, password, rs.getString(1), rs.getString(2)))
				 			{
				 				// set logged in flag to true
				 				loggedIn = true;
				 				System.out.println("Welcome to NBgardens :"+ username);
				 				return true;
				 			} 
				 			else if (!login(getUsername(), getPassword(), rs.getString(6), rs.getString(7)) 
				 					&& !loggedIn)
				 			{ return false;
				 			}
				 		}
				 		
		 		} catch (SQLException ex) {
			 	
		 			// Database error handling
		 			System.out.println("Failed to connect to Database...");
			 	}
			 
			 return false;
		}
		
		public boolean login(String username, String password, String dbuser, String dbpassword){
			if(username.equalsIgnoreCase(dbuser) && password.equalsIgnoreCase(dbpassword)) {
				return true;
			} else
			{
				return false;
			}
		}
}
