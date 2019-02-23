package collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		ArrayList al1=new ArrayList();
		al1.add(23);
		al1.add(33);
		al1.addAll(al);
		System.out.println(al1);
	}

}
