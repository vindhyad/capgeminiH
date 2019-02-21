package demo_exception;

public class App {

	public static void main(String[] args) {
		int a=17;
		int arr[]= {1,2,3,4};
		System.out.println("start");
		try {
		
		System.out.println(arr[7]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
