package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Sampleexecuteupdate {

	public static void main(String[] args) throws SQLException {

		
		Driver driveref=new Driver();
		//step1:Regester the driver
		
		DriverManager.registerDriver(driveref);
		//step2:Get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bangalore","root", "root");
		//step3:issue create statement
		Statement state = con.createStatement();
		//step4:execute a query
		String query="insert into candidateinfo values('scott','72','dutch');";
		int result = state.executeUpdate(query);
		if(result>=1) {
			System.out.println("data  added");
			
			ResultSet resul = state.executeQuery("select * from candidateinfo");
			
			while(resul.next()) {
				
				System.out.println(resul.getString(1));
			}
		
		//step5:close the database
		
		con.close();
		
		
	System.out.println("db closed");
		}
	}

}
