package bank;

public class Bankclass {

	int accNo;int balance;
	Bankclass(){
		System.out.println("constructor called");
	   
	}
	public Bankclass(int accNo,int  balance) {
		
		this.accNo=accNo;
		this.balance= balance;
				System.out.println(accNo+" "+balance);
	}
	
	public static void main(String[] args) {
		Bankclass b1=new Bankclass();
		Bankclass b2=new Bankclass(12,23);
		Bankclass b3=new Bankclass();
		
	
	
	}
}
