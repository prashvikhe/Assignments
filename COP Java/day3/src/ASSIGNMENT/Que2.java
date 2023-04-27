
package ASSIGNMENT;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		int a,Flag=0;
		System.out.println("Enter No to Check Whether its Prime");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for (int i = 2; i < a; i++) {
			if (a%i == 0) {
				Flag = 1;
			    break;
				// System.out.println("its Not Prime");

			} else {
				Flag = 0;
				// System.out.println("it is Prime");
			}
		}
		if (Flag == 1) {
			System.out.println("its not prime");
		} else {
			System.out.println("its Prime");
		}

	}

}
