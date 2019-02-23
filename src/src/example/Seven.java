package example;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		shiftright(arr);
		System.out.println("the array list is"+ arr);
	}

	private static int  shiftright(int arr[]) {
		int i=0,temp=0;
		if(arr[i]==7) {
			temp=arr[i];
			for(int j=arr.length-1;j<arr.length;j--) {
				temp=arr.length-1;
			}
		}
		return temp;
		
	}

}
