package mcq;
// package demo1;
class Employee{
  protected  int empId;
}
class ContractEmployee extends Employee{
   protected int contractDuration;
    public void display(){
        System.out.println("empId"+empId);
    }
}

public class m1 {
  public static void main(String[] args) {
    ContractEmployee e1 = new ContractEmployee();
      e1.display();
  }  
}
