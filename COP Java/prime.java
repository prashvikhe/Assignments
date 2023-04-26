package day1_1;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		p = sc.nextInt();
		for(int i=2;i<p;i++) {
			if(p%i!=0)
				System.out.println(p+" is Prime number ");
			break;
		}
		
	}

}
