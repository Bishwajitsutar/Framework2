package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
	@Test
	public void tc004() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.OpenApplication();
		obj.Login();
		obj.DeleteEmp();
		obj.Logout();
		obj.CloseApplication();
	}
}
