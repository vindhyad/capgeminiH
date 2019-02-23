package example;

import java.util.Arrays;
import java.util.Scanner;


public class Merging {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of first array");
		int size= s.nextInt();
		int arr1[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<arr1.length;i++)
		{
		arr1[i]=s.nextInt();
	    }
		int n1=arr1.length;
		Arrays.sort(arr1);
		System.out.println("enter the size of second array");
		int size1= s.nextInt();
		int arr2[]=new int[size1];
		System.out.println("enter the elements");
		for(int i=0;i<arr2.length;i++)
		{
		arr2[i]=s.nextInt();
	    }
		int n2=arr2.length;
		Arrays.sort(arr2);
		int arr3[]=new int[n1+n2];
		merge(arr1,arr2,n1,n2,arr3);
		for(int i=0;i<n1+n2;i++)
		System.out.print(arr3[i]+" ");
	}

	private static void merge(int arr1[],int arr2[],int n1,int n2,int arr3[]) {
		int i=0,j=0;
		if( arr1[i]<arr2[j]) {
			arr3[i]=arr1[i];
		}
		else
		{
			arr3[i]=arr2[j];
		}
	}

}
