package files;
import project.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student11   {
	

	public static void main(String[] args) {
		Student student =new Student();
		student.setName("bob");
		student.setRoll(123);
		student.setFees(1234);
		try {
			FileOutputStream file=new FileOutputStream("D:\\programming\\studentdetails.txt");
			ObjectOutputStream out=new ObjectOutputStream(file);
		out.writeObject(student);
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
