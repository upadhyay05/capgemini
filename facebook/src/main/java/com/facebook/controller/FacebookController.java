package com.facebook.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.facebook.dao.FacebookDAO;
import com.facebook.entity.FacebookUser;

public class FacebookController {
	public void createProfile() {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter Username");
		String name=br.readLine();
		
		System.out.println("enter Password");
		String password=br.readLine();
		
		System.out.println("enter Email");
		String email=br.readLine();
		
		System.out.println("enter Address");
		String address=br.readLine();
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);
		
		FacebookDAO fd=new FacebookDAO();
		int i=fd.createProfile(fu);
		
		if(i>0) {
			System.out.println("profile created successfully");
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void viewProfile() {
		FacebookDAO fd=new FacebookDAO();
		FacebookUser f=fd.viewProfile();
		
		//for(FacebookUser f:ll) {
			System.out.println("Name is : "+f.getName());
			System.out.println("Password is : "+f.getPassword());
			System.out.println("email is : "+f.getEmail());
			System.out.println("Address is : "+f.getAddress());
		//}
	}
}



















