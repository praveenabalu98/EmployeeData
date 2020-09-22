package org.emp;

import java.util.Scanner;

public class EmployeeData {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id =s.nextInt();
		
		System.out.println("Enter the Emp name");
		String name = s.next();
		
		System.out.println("Enter the emp email");
		String email = s.next();
	
		System.out.println("Enter the emp phone number");
		long phno = s.nextLong();
		
		System.out.println("Enter the emp salary");
		float salary = s.nextFloat();
		
		System.out.println("Enter the city");
		String city = s.next();
	}

}
