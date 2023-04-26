package day1_1;
import java.util.Scanner;
public class arropr {

	public static void main(String[] args) {
//		15:Create Menu driven program for array operations.
//		1:Read Array 2:Print Array 3:Search element in array
//		4:Reverse Array 5:Even number from array6:sum of array element

		int a[] = null,b[]=null,c[]=null,key=0,ch,flag=0;
		Scanner sc =new Scanner(System.in);
		
		do {

			System.out.println("enter choice : ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println( "enter length of arr1");
				a=new int[sc.nextInt()];
				System.out.println("Enter 1st Array Elements");
				for (int i=0;i<a.length;i++) {
					a[i]=sc.nextInt();
											 }
				System.out.println( "enter length of arr2");
				b=new int[sc.nextInt()];
				System.out.println("Enter 2nd Array Elements");
				for (int i=0;i<b.length;i++) {
					b[i]=sc.nextInt();
											 }
							
							break;
		
			case 2: //to search elements in arr
				System.out.println("enter key");
				key=sc.nextInt();
				for (int i=0;i<a.length;i++) {
					
					if(a[i]==key) {
						flag=1;
						break;
					}//if1
					
				}//for1
				if(flag==1) {
					System.out.println("key found in arr 1");
				}
				else {System.out.println("key not found in arr 1");}//if2
				flag=0;
				for (int i=0;i<b.length;i++) {
					
					if(b[i]==key) {
						flag=1;
						break;
					}//if1
					
		
				}//for2
				if(flag==1) {
					System.out.println("key found in arr 2");
				}//if2
				else {System.out.println("key not found in arr 2");}//if2
			
			}
		}while(ch<5);//dowhile
		
			
			
			
		
		
		
		
		
		}

}//arropr