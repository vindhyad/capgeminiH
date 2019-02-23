import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if((c*c)==(a*a+b*b)) 
		{
			System.out.println("yes it is a right angled triangle");
		}
		else
		{
			System.out.println("no it is not a right angled triangle");
		}
	}

}
