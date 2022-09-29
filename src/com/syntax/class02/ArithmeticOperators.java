package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// +, -, *, /, %
		
		
		int a=90;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub=c-d;
		int remainder=c%d;   // 10/3
		int div=c/d;
		
		System.out.println("Sum is ="+sum);
		System.out.println("Sub is ="+sub);
		System.out.println(remainder);
		System.out.println("Reminder is = "+remainder);
		System.out.println("Div is = "+div);   //3
		
		
		
		int e=10;
		int f=5;
		System.out.println("division = "+e/f);  //2
		System.out.println("remainder = "+ e%f);  // 0
		
		
		//  Always use double in Math  
		//** because the result has 00.000 so if use int, the result won;t show all number after decimal 00.xxx
		double num1=10.0;
		double num2=3.0;
		System.out.println(num1/num2);
		
		System.out.println("using float data type ------");
		float number1=10.0f;
		float number2=3.0f;
		
		System.out.println("Dividion of float = "+ number1/number2);
		System.out.println(number1%number2);
		
		// Remainder -%- mod operator
		System.out.println(16%13);
		
		System.out.println("what is the output?");
		System.out.println(10+10/10);
		System.out.println((10+10)/10);
		
		
		
		
		
		
		
		
		
		
		
	}

}
