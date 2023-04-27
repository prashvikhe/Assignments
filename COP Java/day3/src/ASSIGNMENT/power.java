package ASSIGNMENT;
import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		int m,n,res=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			res = m*res;
		}
		System.out.println("m raised to n = "+res);

	}

}
