package practice;
import java.util.Scanner;
public class Onedimen1 {

	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int num;
		int accno[] =new int[5];
	for(int i=0;i<accno.length;i++)
		{
			System.out.println("enter the number");
		 num = sc.nextInt();
			accno[i]=num;		
	}
		for(int i=0;i<accno.length;i++) {
			System.out.println(accno[i]);
		}
	}
}


