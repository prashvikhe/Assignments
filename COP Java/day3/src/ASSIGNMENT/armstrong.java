package ASSIGNMENT;
import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int n , b, r, res= 0;
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter No. ");
		n=sc.nextInt();

        b = n;

        while (b != 0)
        {
            r = b % 10;
           res += n*n*n;
            b /= 10;
        }

        if(res == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
	}
	

}
