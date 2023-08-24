package com.actitime.testscript;




import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.actitime.generic.Baseclass;
import com.actitime.pom.HomePageEnterTimeTrack;
import com.actitime.pom.TaskListPage;




@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends Baseclass   {
	
	@Test
	public void testCreateCustomer() throws Throwable {
		Reporter.log("Create Customee",true);
		HomePageEnterTimeTrack g=new HomePageEnterTimeTrack(driver);
		g.setTaskButton();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewbtn().click();;
		t.getNewcustomerbtn().click();;
		t.getEntercustomername().sendKeys("daddy0");
		Thread.sleep(2000);
		t.getEntercustomerdescriptiontb().sendKeys("fazilas");
		t.getDropdownbt().click();
		t.getBigbankmoneybt().click();
		t.getCreatecustomerbtn().click();;
		Thread.sleep(3000);
		
	
		
	}
	
}

