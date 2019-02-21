package example;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int n1=s1.length();
		int n2=s2.length();
		
		for(int i=0;i<n1;i++) {
char ch=s1.charAt(i);
char ch1=s2.charAt(i);
		System.out.println(ch);
System.out.println(ch1);
	}
	}
}
