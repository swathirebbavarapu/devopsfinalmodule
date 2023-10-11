package com.lbrcefinalmodule;
import java.util.ResourceBundle;

public class UserVerification {
	public boolean check(String uname,String pwd){
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String username=rb.getString("username");
	String password=rb.getString("password");
	if(uname.equals(username) && password.equals(password))
			return true;
	else
			return false;
	
	
	}
	
}
