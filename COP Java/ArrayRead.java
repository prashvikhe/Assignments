package day1_1;
import java.util.Scanner;
public class ArrayRead {

	public static void main(String[] args) {
		int a[]= new int[5];
		int b[]= new int[5];
		int c[],m=0;
		Scanner sc =new Scanner(System.in);
		//to accept the array1
		System.out.println("enter 1st array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		System.out.println("Your first array is :");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");}
		System.out.println("enter 2nd array");

		for (int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("Your 2nd array is");
		for(int i=0;i<b.length;i++) {
					
			System.out.println(" "+b[i]);
		}
		c= new int[a.length +b.length];
		int j=0;
		for (int i=0;i<a.length;i++) {
			c[j]=a[i];
			j++;
		}
		
		for (int k=0;k<b.length;k++) {
			c[j]=b[k];
			j++;			
		}
		
		System.out.println("third array is :");
		for(int d=0;d<c.length;d++) {
		System.out.print(c[d]+" ");
	
						}
		
		
		
		
		
		
	}

}
