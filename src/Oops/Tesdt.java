class MyClass{
    {
        System.out.println("non-static block");
    }
    static {
        System.out.println("static block");
    }
    static void method(){
        System.out.println("static method");
    }
  
}
public class Tesdt {
    public static void main(String[] args) {
        MyClass.method();
    }
}
