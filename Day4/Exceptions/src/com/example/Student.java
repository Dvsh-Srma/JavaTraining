package com.example;

import java.util.Scanner;

public class Student {
	int marks[];
	private Scanner sc;
	
	void addMarks() {
		try {
		int choice;
		sc = new Scanner(System.in);
		System.out.println("Enter for 1. Maths, 2. CS, 3. English ");
		choice = sc.nextInt();
		if(choice > 3 || choice<1) {
			throw new Exception("Limit me reh chadarmod");
		}
		} catch (Exception e) {
			System.out.println("Error: " + e.getLocalizedMessage());
		} finally {
			System.out.println("Ye hamesha chalega");
		}
	}
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.addMarks();
	}

}
