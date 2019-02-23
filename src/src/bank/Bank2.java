package bank;

public class Bank2 {
	int accNo;int balance;
	Bank2(){
		System.out.println("constructor called");
	   //new Bank2();it provides infinite loop
	}

	public Bank2(int accno,int  balance) {
		this();// used to call default constructor
		this.accNo=accno;
		this.balance= balance;
				System.out.println(accNo+" "+balance);
				new Bank2();
	}
	
	public static void main(String[] args) {
		
		Bank2 b2=new Bank2(12,23);
	
	}
}