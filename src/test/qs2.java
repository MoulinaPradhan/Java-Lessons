import java.util.*;
class account{
String name;
int Account_balance=100000;
int withdraw;
int Current_balance;
double interest;
account(){
System.out.println("Enter the Account holder Name: ");
Scanner in=new Scanner(System.in);

name=in.nextLine();

System.out.println("Enter the Withdrow Amount : ");
withdraw=in.nextInt();

if(withdraw>0 && 100000>=withdraw){
Current_balance=Account_balance-withdraw;

}
else{
System.out.println("Amount is insuficiant");
}
}
void account_details(){
System.out.println("Show the Account Holdder Name : "+name);
}

void current_balance(){
System.out.println("Show the Account Holdder Name : "+Current_balance);
}

void Rate_interest(){

interest=Current_balance * 0.05;
System.out.println("Show the Interest Rate : 5%");
System.out.println("Show the with interest Amount: "+interest);
}
}

class qs2{
public static void main(String arg[]){

account o1=new account();
o1.account_details();
o1.current_balance();
o1.Rate_interest();
}
}