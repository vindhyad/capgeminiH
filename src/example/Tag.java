package example;

import java.util.Scanner;

public class Tag {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		if(s1.charAt(2)=='A' ||s1.charAt(2)=='E'||s1.charAt(2)=='I'||s1.charAt(2)=='O'||s1.charAt(2)=='U'||s1.charAt(2)=='Y')
			{
				System.out.println("invalid");
			}
			else
			{
			if((s1.charAt(0)+s1.charAt(1))%2==0 && (s1.charAt(1)+ s1.charAt(3))%2==0 && (s1.charAt(3)+ s1.charAt(4))%2==0 && (s1.charAt(4)+ s1.charAt(5))%2==0 && (s1.charAt(5)+ s1.charAt(7))%2==0 && (s1.charAt(7)+ s1.charAt(8))%2==0 )
			System.out.println("valid");
			else
				System.out.println("invalid");
			}
	}
}

