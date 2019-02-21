package interfce;

public class Son implements Father, Mother {
	public void name() {
		System.out.println("hello");
	}
	
public static void main(String[] args)
{
	Son s=new Son();
s.name();
}
	
}
