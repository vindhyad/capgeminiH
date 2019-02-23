package Inhertan;

public class Child extends Parent {
	String name = "Alice";

	public Child() {
		System.out.println(name);
		System.out.println(super.name);
		super.display();
	}

	public static void main(String[] args) {
		new Child();
	}
}
