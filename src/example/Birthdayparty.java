package example;

import java.util.Scanner;

public class Birthdayparty {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ch=s.nextInt();
		
		if(ch%n==0) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
