package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereader2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputstream=new FileInputStream("D:\\programming\\demo.txt");
			//reads from file
			int i;
			while((i=fileInputstream.read())!=-1) {
				System.out.print((char)i);
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
