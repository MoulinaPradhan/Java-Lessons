
    class Employee{
        String emp_name;
        int emp_id;
        String emp_dob;
        String emp_desg;
        int emp_basic_salary;
        Employee(String emp_name,int emp_id,String emp_dob,String emp_desg,int emp_basic_salary){
this.emp_name=emp_name;
this.emp_id=emp_id;
this.emp_dob=emp_dob;
this.emp_desg=emp_desg;
this.emp_basic_salary=emp_basic_salary;
        }
        void display(){
            System.out.println("Employee name: "+this.emp_name+ " net salary "+ (20%(this.emp_basic_salary)+70%(this.emp_basic_salary))+this.emp_basic_salary);
        }
    }
    public class qs1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Moulina", 1,"22/11/2020", "Writer", 100);
        emp1.display();
    }
}
