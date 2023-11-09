package practice;

import org.testng.annotations.Test;

public class Testngpractice {

@Test(priority=1)
	
	
	public void	 case1(){
		
		System.out.println("printtestng");
	}
	@Test(priority=3)
public void case2() {
	
	System.out.println("print2");
}

	@Test(priority=2)
public void case3() {
	
	System.out.println("print3");
}
	}
	
	

