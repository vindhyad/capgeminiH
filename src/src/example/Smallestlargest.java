package example;

import java.util.Arrays;
import java.util.Scanner;

public class Smallestlargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size= s.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
		System.out.println("enter the kth position");
		int k=s.nextInt();
		Arrays.sort(arr);
		smallest(arr,k);
		largest(arr,k);
		}
	}

	private static void largest(int arr[],int k) {
	System.out.println(arr[size-1]);
		
	}

	private static void smallest(int arr[],int k) {
		
		System.out.println(arr[k-1]);
	}

}
