package day1_1;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,pow=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base value ");
		m = sc.nextInt();
		System.out.println("Enter Power value ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			pow *= m;
		}
		System.out.println(" Power = "+pow);
	}

}
