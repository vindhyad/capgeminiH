package example;

import java.util.Scanner;

public class Concat1 {

	public static void main(String[] args) {
		StringBuilder sc=new StringBuilder();
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int n1=s1.length();
		int n2=s2.length();
		int n=n1+n2;
		if(n1>n2)
		for(int i=0;i<n1;i++) {
char ch=s1.charAt(i);
char ch1=s2.charAt(i);
		sc.append(ch);
		sc.append(ch1);
		System.out.println(ch);
System.out.println(ch1);
	}
	}
	
	}

	


