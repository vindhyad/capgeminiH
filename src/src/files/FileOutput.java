package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		FileOutputStream fileOutputStream =new FileOutputStream("D:\\programming\\demo.txt");
		//reads from file
		System.out.println("enter name");
		String  n=sc.next();
		byte[] b=n.getBytes();
		fileOutputStream.write(b);
		fileOutputStream.close();
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
