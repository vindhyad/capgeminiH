package demo_exception;

public class App1 {

	public static void main(String[] args) {
		int a=10;
		int arr[]= {1,2,3,4,5};
		System.out.println("start");
		try {
			System.out.println(arr[7]);
			System.out.println(a/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Mother Exception");
		}
		finally {
		System.out.println("stop");
		}
		System.out.println("end");
	}

}
