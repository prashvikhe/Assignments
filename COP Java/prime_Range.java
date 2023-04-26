package day1_1;

import java.util.Scanner;

public class prime_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Number ");
		n = sc.nextInt();
		for(int i=2;i<n;i++) {
			for(int j=2;j<i;j++) {
				if(i%j!=0)
					System.out.print(" "+i);
				   break;
			}
		}

	}

}
