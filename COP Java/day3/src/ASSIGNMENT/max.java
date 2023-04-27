package ASSIGNMENT;
import java.util.Scanner;
public class max {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers a  and b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && b>=c) {
			System.out.println("A is Max");
		}
		else if(b>a && a>=c) {
			System.out.println("b is Max");
		}
		else {
			System.out.println("c is Max");
		}
	}

}
