package example;

import java.util.Scanner;

public class Upload {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l=s.nextInt();
		int w=s.nextInt();
		int h=s.nextInt();
		if(w< l ||  h<l) {
			System.out.println("uplaod another");
		}
		else if(w >l && h>l) {
			if(w==h) {
				System.out.println("accepted");
			}
			else {
				System.out.println("crop it");
			}
		}
		

	}

}
