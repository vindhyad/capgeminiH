package collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList animals=new ArrayList();
		animals.add("Harry");
		animals.add(100);
		animals.add(10.1);
		animals.add("Potter");
		System.out.println(animals);
System.out.println(animals.get(2));
animals.add(2,"elephant");

System.out.println(animals.get(2));
System.out.println(animals);
	}

}
