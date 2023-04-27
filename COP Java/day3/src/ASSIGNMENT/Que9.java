package ASSIGNMENT;

import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		// 10: Write a program to enter a number and print its reverse.
		int a, rem=0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		a = sc.nextInt();
		while (a > 0) {
			rem = a % 10;
			sum = (sum * 10) + rem;
			a = a / 10;
		}
		System.out.println(sum);

	}

}
