package javaproject;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		// write a program to find the largest of three numbers.
		//input = 10 20 30 output =30
	
		Scanner in = new Scanner(System.in);
		int  a = in.nextInt();
		int  b = in.nextInt();
		int  c = in.nextInt();
		
		int max1,max2;
		max1 = a>b?a:b;
		max2 = b>c?b:c;
		int max = max1>max2?max1:max2;
		System.out.println(max);
		
		// check a given number is odd or even  input = 6  output = even
		int number = in.nextInt();
		if(number %2==0) {
			System.out.println("Even");
		}
		else {
			System.err.println("odd");
		}
		
		// Determine  if a person is eligible to vote or not.
		//input  = 22 output  =Eligible to vote  17 = Not Eligible to vote
		int age  = in.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible to vote ");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
        
		
		// write a program to check the year is leap year or not
		// input 2024 output entered number is leap year
		int year  = in.nextInt();
		if((year%400==0 || year % 4==0)&& year %100!=0)
		{
			System.out.println("entered number is leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}
		
		// Smallest of four number.
		// input 2,3,4,5 output 2
		int a1 = in.nextInt();
		int b1 = in.nextInt();
		int c1 = in.nextInt();
		int d1 = in.nextInt();
		int min1,min2,min3,min4,min5,min6;
		min1 = a1<b1?a1:b1;
		min2 = b1<c1?b1:c1;
		min3 = c1<d1?c1:d1;
		min4 = min1<min2?min1:min2;
		min5 = min2<min3?min2:min3;
		min6=min4<min5?min4:min5;
		System.out.println(min6);
		
		// check n is positive ,negative or zero.  
		//input 7 output positive 
		
		int n = in.nextInt();
		
	   if(n>0)
	   {
		   System.out.println("Postive");
	   }
	   else if(n<0)
	   {
		   System.out.println("Negative");
	   }
	   else {
		   System.out.println("Number is Equal to Zero");
	   }
	    
		
	System.out.println("Day1 completed");
		
	}

}
