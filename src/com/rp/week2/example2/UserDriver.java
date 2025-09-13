package com.rp.week2.example2;

import java.util.Scanner;

public class UserDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter user name ..");
		String userName = scan.nextLine();
		
		System.out.println("enter password ..");
		String password = scan.nextLine();
		
		User user = new User();
		
		user.setUserName(userName);
		user.setPassWord(password);
		
		System.out.println(user.getUserName());
		System.out.println(user.getPassWord());
		
		System.out.println(user.toString());
		
		scan.close();

	}

}
