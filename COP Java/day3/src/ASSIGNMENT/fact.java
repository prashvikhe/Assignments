package ASSIGNMENT;
import java.util.Scanner;
public class fact {
public static void main(String[] args) {
	
	int a,fact=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	a= sc.nextInt();
	for(int i=1;i<=a;i++) {
		fact = fact*i;
	}
	System.out.println("Factorial = "+fact);
}
}
