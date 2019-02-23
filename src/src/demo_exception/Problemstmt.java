package demo_exception;
import java.util.Scanner;
public class Problemstmt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr1[]=new int[3];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s.nextInt();
		}
		int arr2[]=new int[3];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=s.nextInt();
		}
		power(arr1,arr2);

}
int power(int  arr1[],int  arr2[]){

	for(int i=0;i<arr1.length;i++)
	{
		
		if(arr1[i]<=0 )
		{
			System.out.println("the number cannot be negative or not equal to zero");
			
		}
		
	
	}
	for(int i=0;i<arr2.length;i++)
	{
		
		if(arr2[i]<=0 )
		{
			System.out.println("the number cannot be negative or not equal to zero");
			
		}
		
	
	}
	int temp;
	int i=0;
	temp=arr1[i]^arr2[i];
	
	return temp;
}
}