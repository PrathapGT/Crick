package Genericutilities;

import java.util.Date;

public class Javautility {

	
	public String getsystemDate() {
		
		Date d=new  Date();
		return d.toString();
	}
		
	public String getsystemDateInFormat() {
		
		Date d=new Date();
		
		String date[]=d.toString().split(" ");
		
		String month = date[1];
		String date1 = date[2];
	    String time = date[3].replace(" : ","- ");
	    String year=date[5];
	    
	    
	    String finaldate= date1+" "+month+" "+year+" "+time;
		return finaldate;
	}
	
	
	
	
	
	
	
	
	
}
