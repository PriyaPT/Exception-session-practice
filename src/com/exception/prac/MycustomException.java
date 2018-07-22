package com.exception.prac;

//Here we have created custom exception by extending exception class
// we can also create custom exception by extending RuntimeException class
//Custom execptions are runtime exceptuons so we have to explicitly need to throw it by uisng throw key word.

public class MycustomException extends Exception{

 public MycustomException(String msg){
	
	 System.out.println("This exception occured with the bex valune is invalid in the form " +msg);
	}
}
