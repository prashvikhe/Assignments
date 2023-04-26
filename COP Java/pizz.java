package day1_1;

import java.util.Scanner;

public class pizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to pizzaHUT ");
		int ch ,amt=0;
		Scanner sc = new Scanner(System.in);
		
		int q;
		do {
			System.out.println(" 1:Veg-pizza 99Rs 2:Non-pizza 149Rs 3:paneer-pizza 129Rs"
					+" 4:Total 5:Exit");
			System.out.println(" Enter your choice ");
			ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter Qyt");
			q = sc.nextInt();
			amt += q*99;
			break;
		case 2:
			System.out.println("Enter Qyt");
			q = sc.nextInt();
			amt += q*149;
			break;
		case 3:
			System.out.println("Enter Qyt");
			q = sc.nextInt();
			amt += q*129;
			break;
		case 4:
			System.out.println(" Total amt "+amt);
			break;
		
		  }
		}while(ch!=5);

		

	}

}
