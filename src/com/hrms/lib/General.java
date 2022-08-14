package com.hrms.lib;



import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
public void OpenApplication() {
	System.setProperty("webdriver.edge.driver", "C:\\New folder\\driver2\\edgedriver2\\msedgedriver.exe");
     driver = new EdgeDriver();
     driver.navigate().to(url);
     System.out.println("Application opened");
     Reporter.log("Application opened");
     Log.info("Application opened");
     driver.manage().window().maximize();
     System.out.println(driver.getTitle());
}
public void CloseApplication() {
	driver.close();
	System.out.println("Application closed");
	Reporter.log("Application closed");
	Log.info("Application closed");
}
public void Login() throws Exception {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement( By.name(btn_submit)).click();
	System.out.println("Login Completed");
	Reporter.log("Login Completed");
	Log.info("Login completed");
	Thread.sleep(3000);
}
public void Logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	Reporter.log("Logout completed");
	Log.info("Logout Completed");
}

public void AddEmp() throws Exception {
	driver.switchTo().frame(frm_name);
	driver.findElement(By.xpath(btn_add)).click();
	driver.findElement(By.name(txt_ln)).sendKeys(ln);
	driver.findElement(By.name(txt_fn)).sendKeys(fn);
	driver.findElement(By.id(btn_save)).click();
	driver.switchTo().defaultContent();
	System.out.println("Add emp successfully");
	Reporter.log("Add emp successfully");
	Log.info("Add emp successfully");
	Thread.sleep(3000);
}
public void DeleteEmp() throws Exception {
	driver.switchTo().frame(frm_name);
	Select st = new Select(driver.findElement(By.name(dd_search)));
			st.selectByVisibleText("Emp. First Name");
	Thread.sleep(3000);
	driver.findElement(By.name(txt_search)).sendKeys(fn);
	Thread.sleep(3000);
	driver.findElement(By.xpath(btn_search)).click();
	Thread.sleep(3000);
	driver.findElement(By.name(txt_checkbox)).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(btn_delete)).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	System.out.println("Delete emp successfully");
	Reporter.log("Delete emp successfully");
	Log.info("Delete emp successfully");
}
}
