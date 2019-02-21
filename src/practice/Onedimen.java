package practice;

import java.util.Scanner;

public class Onedimen {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	int accno[] =new int[5];
	accno[2]=345;
	accno[3]=452;
	for(int i=0;i<accno.length;i++) {
		System.out.println(accno[i]);
	}
}
}