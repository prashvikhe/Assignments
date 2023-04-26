package day1_1;

import java.util.Scanner;

public class seriessum {

	public static void main(String[] args) {
		
		int m,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the number ");
		m=sc.nextInt();
		for(int i=1;i<=m;i++)
			sum+=i;
		
		System.out.println(" sum of series = "+sum);
	}
}
