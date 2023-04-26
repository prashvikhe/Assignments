package day1_1;

import java.util.Scanner;

public class Amstronge {

	public static void main(String[] args) {
        int num,a=0,count=0,sum=0,temp,check;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number ");
        num=sc.nextInt();
        check=temp=num;
        while(num!=0)
        {
        	a=num%10;
        	num=num/10;
        	count++;
        }
        while(temp!=0)
        {
        	a=temp%10;
        	temp=temp/10;
        	int pow=1;
        	for(int i=1;i<=count;i++)
        	{
        	  pow*=a;
        	}
        	sum+=pow;
        }
       
       if(check==sum)
    	   System.out.println(check+" is the Amstrong Number ");
       else
    	   System.out.println(check+" is the Not An Amstrong Number "); 

	}

}
