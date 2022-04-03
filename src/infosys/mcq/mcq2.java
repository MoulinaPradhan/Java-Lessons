package mcq;
class Employee{
    static int empId =1000;
    String empName;
    static float working =0.0f;
    Employee(String empName, float working){
        Employee.working= working;
        this.empName= empName;
    }
    public static void display(){
        System.out.println("empId:"+ ++empId);
    }
    public static float calculateWorking(){
        int baseSalary=20000;
        float salary=0.0f;
        if(Employee.working > 9.25f){
            salary= Employee.working*200+baseSalary;
        }else{
            salary=Employee.working*100+baseSalary;
        }
        return salary;
    }
}
public class mcq2 {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Jack", 12.13f);
       Employee.display();
        System.out.println("Increatensed slaray:"+Employee.calculateWorking());
        Employee obj2 = new Employee("Jill", 15.0f);
        Employee.display();
    }
}
