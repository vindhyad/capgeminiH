package collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Arrayfileoutputstream {

	
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				FileOutputStream fileoutputstream;
				try {
					fileoutputstream=new FileOutputStream("D:\\programming\\demo1.txt");
					//reads from file
					System.out.println("enter integer");
					int n=sc.nextInt();
					for(int i=0;i<n;i++)
					{
						int n1=sc.nextInt();
					
					fileoutputstream.write(n);
					}
					fileoutputstream.close();
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
					}
				catch(IOException  e)
				{
					e.printStackTrace();
				}
				}

		

	}


