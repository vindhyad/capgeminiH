package Loops;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr the number");
		int n =sc.nextInt();
		
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			
			n=n*10+rem;
			n=n/10;
		}
		System.out.println(n);
		
	}

}
