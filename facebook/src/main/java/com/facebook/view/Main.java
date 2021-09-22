package com.facebook.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import com.facebook.controller.FacebookController;

//modifiers  public, private, protected, default

//public means inside the package as well as errside the package
//default means only inside the package
//private means within class
//protected means only child class whereever it is 

public class Main {

	public static void main(String[] args) throws Exception {
		//Logger log=Logger.getLogger("Main");
		
		String s="y";
		
		FacebookController fc=new FacebookController();
		
		while(s.equals("y")) {
		System.out.println("***********************Main Menu*****************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter your choice");
		String c = br.readLine();
		int choice = Integer.parseInt(c);

		switch (choice) {
		case 1:fc.createProfile();
			
			break;
		case 2:fc.viewProfile(); 
			
			break;
		default:
			System.out.println("wrong input");
		}
		System.out.println("do you want to continue press y/n");
		s=br.readLine();
		}

	}

}
