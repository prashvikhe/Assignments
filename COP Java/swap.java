package day1_1;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers:-");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Before Swap Num1 = "+num1+" Num2 = "+num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap Num1 = "+num1+" Num2 = "+num2);
		sc.close();
	}

}
