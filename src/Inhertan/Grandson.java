package Inhertan;

	
	public class Grandson extends Child
	{
		String name = "Jhon";
	
		public Grandson() {
			System.out.println(name);
			System.out.println(super.name);
			super.display();
		}
	
		public static void main(String[] args) {
			Grandson g=new Grandson();
		}
	
}
