package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
public WebDriver driver;
	//Test Data
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String fn = "Bishwajit";
	public String ln = "Sutar";
	//Test Object
	public String txt_loginname  = "txtUserName";
	public String txt_password   = "txtPassword";
	public String btn_submit     = "Submit";
	public String link_logout    = "Logout";
	public String link_pim       = "PIM";
	public String frm_name       = "rightMenu";
	public String btn_add        = "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
	public String txt_fn         = "txtEmpFirstName";
	public String txt_ln         = "txtEmpLastName";
	public String btn_save       = "btnEdit";
	public String dd_search      = "loc_code";
	public String txt_search     = "loc_name";
	public String btn_search     = "//*[@id=\"standardView\"]/div[2]/input[2]";
	public String txt_checkbox   = "chkLocID[]";
	public String btn_delete     = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
}
 