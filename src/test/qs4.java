 class qs4
{
	public static void main(String[] args) {
		Saving_Bank_Account s=new Saving_Bank_Account(123, 10600.00);
		Current_Bank_Account c=new Current_Bank_Account(456, 2300.50);
		
		s.print2();
		c.print3();
	}
}
class Account{
    private int account_number;
    public Account(int a){
        account_number=a;
    }
    public void print1(){
        System.out.println("Account number is: "+account_number);
    }
}
class Saving_Bank_Account extends Account{
    private double amount;
    public Saving_Bank_Account(int a, double amt){
        super(a);
        amount=amt;
    } 
    public void print2(){
        print1();
        System.out.println("Amount in saving bank account_number: "+amount);
    }
}
class Current_Bank_Account extends Account{
    private double amount;
    public Current_Bank_Account(int a, double amt){
        super(a);
        amount=amt;
    } 
    public void print3(){
        print1();
        System.out.println("Amount in current bank account: "+amount);
    }
}
