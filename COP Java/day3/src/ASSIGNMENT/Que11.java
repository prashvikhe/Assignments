package ASSIGNMENT;

import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		// 11:Write a program to print all Prime numbers between 1 to n.
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N : ");
		n = sc.nextInt();

		for (int i = 2; i <= n; i++) 
		{ int j;
			for ( j = 2; j < i; j++) 
			{
				if (i%j == 0) {
					break;
				}
			}
			if(i==j)
			{
				System.out.println(i);
			}
		}
sc.close();
	}

}
