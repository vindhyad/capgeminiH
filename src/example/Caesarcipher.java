package example;

import java.util.Scanner;

public class Caesarcipher {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
String text=sc.next();
int rotate=4;
System.out.println(encrypt(text,rotate)) ;
	}

	private static StringBuffer encrypt(String text, int rotate) {
		StringBuffer result =new StringBuffer();
	
		for(int i=0;i<text.length();i++) {
			char ch=(char)((int) text.charAt(i) + rotate);
			result.append(ch);
		}
		return result;
		
		
	}

}
