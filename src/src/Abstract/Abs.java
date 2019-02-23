package Abstract;

public class Abs extends Flying {

	public static void main(String[] args)
	{
		Flying a=new Abs();
		a.add();
		a.x();
		a.y();
		
	}
	
	public void x()
	{ 
		System.out.println("x");
		
	
	}
	
	public void y()
	{ 
		System.out.println("y");
	}
	
}
