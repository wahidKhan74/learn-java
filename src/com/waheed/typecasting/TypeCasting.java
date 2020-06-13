package com.waheed.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		//create int type create   ctrl + space		
		int num = 10;		
		System.out.println("The integer value :" + num);
		
		//convert into double type  : Widening or implicit type casting
		double data  = num;		
		System.out.println("The double value :" + data);
		
		//create a double type variable
		double dnum = 10.99;
		
		System.out.println("The double value :" + dnum);
		
		// convert double  into int : Narrowing or explicit type converstion.
		int inum = (int) dnum;
		
		System.out.println("The int value :" + inum);
		

	}

}
