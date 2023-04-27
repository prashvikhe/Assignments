package ASSIGNMENT;
import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		//8:Write a  program to find sum of all even and 
		//odd numbers between 1 to n.
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check whether it is odd or even");
		a = sc.nextInt();
		if(a%2 == 1)
		{
			System.out.println("Number is odd");
			
		}
		else
		{
			System.out.println("number is even");
		}
		
		
		

	}

}
