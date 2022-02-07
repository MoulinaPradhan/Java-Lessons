class Person 
{ 
   public int age; 
    
   public Person() 
    { 
        age = 24; 
    } 
} 

public class Tesdt 
{ 
    public static void main(String[] args) 
    { 
        Person p = new Person(); 
        System.out.println(p.age); 
    } 
}