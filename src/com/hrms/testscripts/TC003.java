package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
	@Test
public void tc003() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
	obj.OpenApplication();
	obj.Login();
	obj.AddEmp();
	obj.Logout();
	obj.CloseApplication();
}
}
