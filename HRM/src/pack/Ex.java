package pack;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex {
@BeforeMethod
public void main1()
{
	System.out.println("main1");
	Reporter.log("main1");
}
	
@AfterMethod
public void main2()
{
	System.out.println("main2");
	Reporter.log("main2");
	
}

@Test
public void main3()
{
System.out.println("main3");
Reporter.log("main3");
}
}
