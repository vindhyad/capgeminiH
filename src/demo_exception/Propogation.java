package demo_exception;

public class Propogation {
	void m() {
		int data=10/0;
	}
	void n() {
		m();
	catch(ArithmeticException e) {
		System.out.println();
	}
	}

	public static void main(String[] args) {
		
	}

}
