package com.facebook.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.facebook.entity.FacebookUser;

public class FacebookDAO {
	private static ArrayList<FacebookUser> aa=new ArrayList<FacebookUser>();
	public int createProfile(FacebookUser fe) {
		int i=0;
		try {
		File f=new File("d:/capgemini12.txt");
		//if want to apend data into file then pass true inside constructor
		FileOutputStream out=new FileOutputStream(f,true);
		//how to write simple data inside file start
		int c=0;
		String s="  hello i am new data";
		for(c=0;c<s.length();c++) {
			out.write(s.charAt(c));
		}
		out.close();
		
		//how to write simple data inside file end
		
		//how to write object inside file start
		
		//ObjectOutputStream oo=new ObjectOutputStream(out);
	//	oo.writeObject(fe);
		//oo.close();
		//out.close();
		
		//how to write object inside file end
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		i=1;
		return i;
	}
	public FacebookUser viewProfile() {
		FacebookUser fu=null;
		try {
			File f=new File("d:/capgemini.txt");
			FileInputStream out=new FileInputStream(f);
			ObjectInputStream oo=new ObjectInputStream(out);
			fu=(FacebookUser)oo.readObject();
			oo.close();
			out.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return fu;
		
	}
}














