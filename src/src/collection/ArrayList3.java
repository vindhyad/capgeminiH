package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList a=new ArrayList();
		for(int i=0;i<5;i++)
		{
			int n=sc.nextInt();
		a.add(n);
		}
		
		System.out.println("enter the search element");
		int s=sc.nextInt();
		System.out.println(a.contains(s));
		
	}

}
