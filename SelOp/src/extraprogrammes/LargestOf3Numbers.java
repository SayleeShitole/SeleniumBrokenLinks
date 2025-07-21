package extraprogrammes;

import java.util.Scanner;

public class LargestOf3Numbers {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter the 1st ele");
//		int a=sc.nextInt();
//		
//		System.out.println("enter the 2nd ele");
//		int b=sc.nextInt();
//		
//		System.out.println("enter the 3rd ele");
//		int c=sc.nextInt();
//		
//		if(a>b && a>c)
//		{
//			System.out.println("element "+a+" is largest");
//		}
//
//		else if(b>a && b>c)
//		{
//			System.out.println("element "+b+" is largest");
//		}
//		
//		else
//		{
//			System.out.println("element "+c+" is largest");
//		}
//	}

	//find the largest no using ternary operator
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st ele");
		int a=sc.nextInt();
		
		System.out.println("enter the 2nd ele");
		int b=sc.nextInt();
		
		System.out.println("enter the 3rd ele");
		int c=sc.nextInt();
		int largest1=a>b?a:b;
		
		int largest2=c>largest1?c:largest1;
		
		System.out.println("The largest number from all "+largest2);
	}
	
}
