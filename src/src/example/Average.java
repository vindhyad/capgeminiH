package example;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size= s.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=s.nextInt();
	    }
		average(arr,size);
greatestnumber(arr,n);
	System.out.println("");
}
private static int greatestnumber(int arr[],int n) {
		int i=0;
		if(arr[i]>n) {
			System.out.println("the greater than average numbers are:"+arr[i]);
		}
		return 0;
	}


	private static int  average(int arr[],int size) {
		int n,i=0;
		n=arr[i]/size;
		return n;
	}
}