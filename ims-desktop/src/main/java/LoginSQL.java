import java.sql.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Employee;
import com.netbuilder.entityrepositories.EmployeeRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.EmployeeRepositorySQL;


public class LoginSQL {
	//employee variables- attributes
	private String username;
	private String password;
	public DatabaseController db;
	public boolean loggedIn;
	String[] usernameArray;
 	String[] passwordArray;

 	
 	static int count = 0;
 	
	public LoginSQL(){
		username = null;
		password = null;
		loggedIn = false;
		db = new DatabaseController();
		passwordArray = new String[100];
		usernameArray = new String[100];
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
				 	db.stmt = db.getConn().createStatement();
				 	String sql1 = "SELECT employeeusername, employeepassword FROM Employee";
				 	ResultSet rs = db.stmt.executeQuery(sql1);
			
				 	int i = 0;
				 	
				 	/**
				 	 * TODO calculate length of listNamesArray
				 	 */
				 	
				 	
				 	while(rs.next())
				 	{		
				 		usernameArray[i] = rs.getString("employeeusername");
				 		passwordArray[i] = rs.getString("employeepassword");
				 		i++;
				 	}
				 		
				 		if(login(username, password))
				 		{
				 			// set logged in flag to true
				 			loggedIn = true;
				 			System.out.println("Welcome to NBgardens :"+ username);
				 			return true;
				 		} 
				 		else
				 		{ 
				 			return false;
				 		}
				 		
		 		} 
			 catch (SQLException ex) 
			 {
			 	System.out.println(ex);
		 			// Database error handling
		 			System.out.println("Failed to connect to Database...");
		 			System.out.println("hello m8");
			 }
			 
			 return false;
		}
		
		public boolean login(String username, String password){
			for (int i = 0; i < usernameArray.length; i++)
			{
				if (username.equalsIgnoreCase(usernameArray[i])){
					if(password.equals(passwordArray[i])){
						count = i;
						db.close();
						return true;
					} 
				} 
			} return false;
		
		}
		
		
	
}