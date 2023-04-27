package ASSIGNMENT;
import java.util.Scanner;
public class pizza {

	public static void main(String[] args) {
		
	
			System.out.println(" Welcome to pizza House ");
			int ch ,amt=0;
			Scanner sc = new Scanner(System.in);
			
			
			int q;
			do {
				System.out.println(" 1:Veg-pizza 100\nRs 2:Non-pizza 150Rs \n3:paneer-pizza 125Rs"
						+" 4:Total 5:Exit");
				System.out.println(" Enter your choice ");
				ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Qyt");
				q = sc.nextInt();
				amt += q*100;
				break;
			case 2:
				System.out.println("Enter Qyt");
				q = sc.nextInt();
				amt += q*150;
				break;
			case 3:
				System.out.println("Enter Qyt");
				q = sc.nextInt();
				amt += q*125;
				break;
			case 4:
				System.out.println(" Total amt "+amt);
				break;
			
			  }
			}while(ch!=5);
			sc.close();

			}
	
	}

