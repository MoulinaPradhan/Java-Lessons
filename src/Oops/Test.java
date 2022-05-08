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
public class Test {
    public static void main(String[] args) {
        MyClass.method();
    }
}
