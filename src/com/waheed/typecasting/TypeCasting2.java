package com.waheed.typecasting;

public class TypeCasting2 {
	
	public static void main(String[] args) {
		
		//create int type create   ctrl + space		
		int num = 10;		
		System.out.println("The integer value :" + num);
		
		// convert int to string type value
		String data  = String.valueOf(num);		
		System.out.println("The String value :" + data);
		
		//create string value
		String str = "102";
		System.out.println("The String value :" + str);
		
		
		//convert string to int value
		int inum = Integer.parseInt(str);		
		System.out.println("The integer value :" + inum);
		
		//convert string to int value
		double dnum = Double.parseDouble(str);		
		System.out.println("The double value :" + dnum);
	}
}
