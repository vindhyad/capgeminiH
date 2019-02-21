package Loops;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the operater");
		String x =sc.next();
		System.out.println("enter the numbers");
		double m =sc.nextDouble();
		System.out.println("enter the number2");
		double n=sc.nextDouble();
		
		switch(x)
		{
		case "+": System.out.println((m)+(n));break;
		case "-": System.out.println(m-n);break;
		case "*": System.out.println(m*n);break;
		case "/": System.out.println(m/+n);break;
		
		}
		
	}

}
