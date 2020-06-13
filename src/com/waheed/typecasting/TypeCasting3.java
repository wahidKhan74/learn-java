package com.waheed.typecasting;

public class TypeCasting3 {

	public static void main(String[] args) {
		
		double d = 100.4;
		long l = (long) d;
		int i = (int) l;		
		float f = i;
		short s  = (short)f;
		
		System.out.println("Double value :" +d);
		System.out.println("Long value :" +l);
		System.out.println("Integer value :" +i);
		System.out.println("Float value :" +f);
		System.out.println("Short value :" +s);

	}

}
