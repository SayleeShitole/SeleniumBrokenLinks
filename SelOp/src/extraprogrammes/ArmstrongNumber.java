package extraprogrammes;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the input");
		int num=sc.nextInt();
		
		int originalNum=num;
		int armstrong=0;
		
		while(num!=0)
		{
			int digits=num%10;
			
			armstrong=armstrong+(digits*digits*digits);
			
			num=num/10;
			
		}
		
		if(originalNum==armstrong)
		{
			System.out.println("The given number is armstrong number as : "+originalNum);
			
		}
		else
		{
			System.out.println("The given number is not armstrong number");
		}
	}
}
