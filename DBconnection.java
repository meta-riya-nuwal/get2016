package session9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBconnection {

	
	

Connection con=null;
	
	
/*
 * It loads or initialize the driver 
 */
void loadDriver()
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
	
}


/*
 * It connects driver with particular database
 */
Connection ConnectDriver() 

{
	 String host="jdbc:mysql://localhost:3306/";
		String db="library";
		String url=host+db;
		
		String userid="root";
		String pass="riya";
		try
		{
		 con=DriverManager.getConnection(url,userid,pass);
		}
		catch(SQLException e)
		{
			System.out.println("Can't connect to database");
		}
		return con;
	}
	/*
	 * Closes the connection 
	 */
	void closeConnection()
	{
      try
		{
		
		
		con.close();
		}
		catch(SQLException e)
		{
			System.out.println("Error...");
			
		}
	}
	
}
