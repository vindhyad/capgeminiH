package collection;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import project.Student;
public class Ex {
	static int count=1;
	public static Student getInfo() implement seriliazible {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details of student"+count);
		Student student=new Student();
		student.setName(sc.next());
		student.setRoll(sc.nextInt());
		student.setFees(sc.nextDouble());
		count++;
		return student;
		
	}
	public static void main(String[] args) {
		ArrayList<Student> sa=new ArrayList<>();
		sa.add(getInfo());
		sa.add(getInfo());
		System.out.println(sa);
		try {
			FileOutputStream fileoutputstream=new FileOutputStream("D:\\programming\\demo1.txt");
			ObjectOutputStream objectoutputstream=new ObjectOutputStream(fileoutputstream);
			
			objectoutputstream.writeObject(sa);
			
			
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


