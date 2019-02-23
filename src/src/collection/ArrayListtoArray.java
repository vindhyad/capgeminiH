package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListtoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileOutputStream fileoutputstream;
		ArrayList al=new ArrayList();
		try {
			FileInputStream fileInputstream=new FileInputStream("D:\\programming\\demo1.txt");
			//reads from file
			int i;
			while((i=fileInputstream.read())!=-1) {
				if((fileInputstream.read())!='-') {
					
				
				al.add(i);
				}
				System.out.println(al);
			}
			
			
			fileInputstream.close();
			
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
	


