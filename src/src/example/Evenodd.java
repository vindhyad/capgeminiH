package example;

import java.util.Arrays;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("the sorted array is:");
	
		Arrays.sort(arr);
		int i=0;
		System.out.println(arr[i]);
		int b[]=new int[size];
		int c[]=new int[size];
		evenodd(arr,b,c);
		for(int j=0;j<arr.length;j++) 
		{
		System.out.println(b[i]+" ");
		System.out.println(c[i]);
		}
		Arrays.sort(b);
		Arrays.sort(c);
		merge(b,c);
	}
	private static void evenodd(int[] arr,int b[],int c[]) {
		for(int i=0;i<arr.length-1;i++ )
		{
			if(arr[0]==1) {
				b[0]=1;
			}
			else if(arr[i]%2==0)	{
				arr[i]=b[i];
			}
			else {
				arr[i]=c[i];
			}
		}
	}

}
