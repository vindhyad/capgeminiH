package project;
import java.util.Scanner;
public class Bank{
	public void transaction(long amt) 
	{
		
	}
	public void transaction(long amt,long accno) 
	{
		
	}
	
	
	
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	
System.out.println("enter 0 for debit /n enter 1 for credit");
int x=sc.nextInt();
switch(x)
{
case 0: System.out.println("enter amount for debit");
        boolean amt=sc.hasNextLong();
        transaction(amt);
         break;

case 1: System.out.println("enter amount for credit and enter accountno");
         Long amt=sc.NextLong();
         Long accno=sc.nextLong();
           transaction(amt,accno);
          break;
default:System.out.println("plz enter a valid number");
         break;

}

}
}