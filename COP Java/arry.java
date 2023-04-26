package day1_1;

import java.util.Scanner;

public class arry {

	public static void main(String[] args) {
		int ch, key, sum = 0;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(" 1: ReadArry 2:Display 3:SearchElement" + 
		"4: ReverseArry 5:Even no 6:SumofArry 7:Exit");
			System.out.println(" Enter the choice ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (int i = 0; i < a.length; i++)
					a[i] = sc.nextInt();
				break;
			case 2:
				for (int i : a)
					System.out.println(i);
				break;
			case 3:
				System.out.println(" enter the key element");
				key = sc.nextInt();
				for (int i = 0; i < a.length; i++) {
					if (a[i] == key)
						System.out.println(" key found at " + i + " postion ");
				}
				break;
			case 4:
				for (int j = a.length - 1; j >= 0; j--)
					System.out.println(a[j]);
				break;
			case 5:
				for (int i : a)
					if (i % 2 == 0)
						System.out.println(i);
				break;
			case 6:
				for (int i : a)
					sum += i;
				System.out.println("Sum =" + sum);
				break;
			}
		} while (ch != 7);
	}

}
