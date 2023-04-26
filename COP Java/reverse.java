package day1_1;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,a=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number 1 ");
        num=sc.nextInt();
       /*
        while(num!=0)
        {
        	a=num%10;
        	num=num/10;      	
        	System.out.print(a);
        }
        */
        int temp=1;
        while(num!=0)
        {
           temp=num%10;
           sum=(sum*10)+temp;
           num=num/10;
        }
       System.out.println(sum); 
	}

}
