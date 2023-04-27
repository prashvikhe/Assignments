
package ASSIGNMENT;
import java.util.Scanner;
public class Que7 {
	//	7:Sum of series :
		//1+2+3+….+n
public static void main(String[] args)
{
	int n,c=0;
	Scanner sc = new Scanner(System.in);
	System.out.println( "Enter No ");
	n= sc.nextInt();
	for(int i=n;i>=1;i--)
	{
		c+=i;
	}
	System.out.println(c);

	
}


}
