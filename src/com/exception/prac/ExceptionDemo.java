package com.exception.prac;

public class ExceptionDemo {

	
	//Try should not be alone
	//It should be combination with catch or finally
	//There can be 1 to n no of catch block with single try block
	//try- with finally allowed
	
	public static void main(String[] args) throws Exception  {
		
		int a = 40;
		int b = 0;
	
		try {		
			//This line will create arithmatic exception as /zero
			int c= a/b;
		// if exception occurs at above line then below lines will not get executed and cotrol goes to the catch block
			
			String  s= null;
			// this is the nested try block
		try {
		// Here we are explicitly throwing the exception
			// here we have exeplicity created object of exception class by uisng new 
			
			throw(new MycustomException("value is blank + var"));
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
			String s2 = " swapnil";
	
			
			try {
				// here we are converting null to tostring , so null pointer exception we get created
		s.toString();
		}
		catch(Exception e) {
			System.out.println(" i am in nested try " +e);
		}
			System.out.println(" euqual");
		  }
		
		// As shown here multiple catch block is allowed with the single try block
	catch(ArithmeticException e) {
				e.printStackTrace();
			}
	catch(Exception e) {
			  
			//  System.out.println(e.getMessage());
			  e.printStackTrace();
			  System.out.println(" i am in external try " +e);
		  }
	//Here we are calling the math method
		ExceptionDemo al = new ExceptionDemo();
		al.math();
	}
	
	//Throws can be used to prapogate the exception to the calling method
	//Or else we can say when we dont want to handle exception then we can pass that exception by using Throws keyword
	
	public void math()throws ArithmeticException, NullPointerException
	{
		// As shown at method declaration  we can throws one or many exceptions.
		
		System.out.println(" i am at throws example");
		
	}
	
	
}
