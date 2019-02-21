package practice;
import java.util.Scanner;
public class Customerdetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long accno;
		long adharno;
		long phoneno;
		long bal;
		long [] kotak= new long[4];
		for(int i=0;i<kotak.length;i++) {
			long[] customerdetails=new long[4];
			for(int j=0;j<customerdetails.length;j++) {
			System.out.println("enter the account number");
			long num= s.nextLong();
			System.out.println("enter the aadhar number ");
			long  num1 =s.nextLong();
			System.out.println("enter the phone number");
			long num2=s.nextLong();
			System.out.println("enter the balance");
			long num3= s.nextLong();
			customerdetails[j]=num;
			customerdetails[j]=num1;
			customerdetails[j]=num2;
			customerdetails[j]=num3;
		}
	
		int j=0;
		kotak[i]=customerdetails[j];
	}

}
}