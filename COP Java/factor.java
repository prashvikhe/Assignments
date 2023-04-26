package day1_1;

import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		int a;
		System.out.println(" Enter the Number ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println(" Factor of "+a);
		for(int i=1;i<=a;i++) 
		{
			if(a%i==0)
				System.out.print(" "+i);
			
		}
	}

}
