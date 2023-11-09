package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Samplejdbcexectequery {

	
	public static void main(String[] args) throws SQLException {
		
		
		Driver driverref=new Driver();
		//step1: Register the driver
		
		DriverManager.registerDriver(driverref);
		
		
		//step2:Get the connection from database
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bangalore", "root", "root");
		//step3:issue the create statement
		
		Statement state=con.createStatement();
		//step4:execute query
		
		ResultSet result = state.executeQuery("select * from candidateinfo");
		
		while(result.next()) {
			
			System.out.println(result.getString(1));
			
		}
		//step5:close the database
		con.close();
		
		System.out.println("db closed");
	}
}
