package day1_1;
import java.util.Scanner;
public class Greaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the num1 ");
        num1=sc.nextDouble();
        System.out.println(" Enter the num2 ");
        num2=sc.nextDouble();
        System.out.println(" Enter the num3 ");
        num3=sc.nextDouble();
        if(num1>num2)
        {
        	if(num1>num3)
        	{
        		System.out.println(" Greatest number is "+num1);
        	} 
        	else
        		System.out.println(" Greatest number is "+num3);
        }
        else if(num2>num3)
    		System.out.println(" Greatest number is "+num2);
        else
        	System.out.println(" Greatest number is "+num3);

	}

}
