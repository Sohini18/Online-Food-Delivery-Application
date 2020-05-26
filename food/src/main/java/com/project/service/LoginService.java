package com.project.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	 private Pattern pattern;
	  private Matcher matcher;

	  private static final String PASSWORD_PATTERN = 
             "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";
	        
	  public LoginService(){
		  pattern = Pattern.compile(PASSWORD_PATTERN);
	  }
	public boolean userValidation(final String password)
	{
		matcher = pattern.matcher(password);
		  return matcher.matches();
	}
}
