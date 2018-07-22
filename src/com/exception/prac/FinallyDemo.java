package com.exception.prac;

public class FinallyDemo {

	static int a = 10, b = 0, c = 0;

	String s = "Swapnil";

	public static void main(String[] args) {

		// Try should not be written alone , it should be written along with catch or finally
		
		try {
			System.out.println(" i am in try block  as first line");
			c = a / b;
			System.out.println(" i am in try block as alast line ");
		} /*catch (Exception e) {
			System.out.println(" i am in catch block");
			e.printStackTrace();
		}*/
		
		// Finally block always get executed
		//though execption ocuured or not
		// only single finally block is allowed in the syntax
		// if we try to write multiple finally block then , compile time error created
		
		finally {
			c=0;
			System.out.println(" i am in finally block");
		}
     
	}
}