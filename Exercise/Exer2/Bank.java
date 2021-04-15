public class Bank{
	int getBalance() {
		return 0;
	}

public static void main(String[] args) {
	Bank ob=new Bank();
	BankA ob1=new BankA();
	BankB ob2=new BankB();
	BankC ob3=new BankC();
	System.out.println("Deposits:"+ob.getBalance());
	System.out.println("Deposits in A:"+ob1.getBalance());
	System.out.println("Deposits in B:"+ob2.getBalance());
	System.out.println("Deposits in C:"+ob3.getBalance());
}
}