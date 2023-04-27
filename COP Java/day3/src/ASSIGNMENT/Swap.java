package ASSIGNMENT;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc ;
		sc = new Scanner(System.in);
		System.out.println("enter numbers a and b to swap");
		
		a = sc.nextInt();
		b = sc.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping a:"+a+"b="+b);
		
		

	}

}
