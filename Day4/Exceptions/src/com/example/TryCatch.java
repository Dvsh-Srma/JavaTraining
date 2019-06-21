package com.example;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int a = 5/0;
			throw new Exception("Hello");
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
