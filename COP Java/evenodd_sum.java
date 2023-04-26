package day1_1;

import java.util.Scanner;

public class evenodd_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,Esum=0,Osum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number ");
		n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i%2==0)
				Esum += i;
			else
				Osum += i;
		}
		System.out.println(" Sum of Even NUmber "+Esum);
		System.out.println(" Sum of odd NUmber "+Osum);
	}

}
