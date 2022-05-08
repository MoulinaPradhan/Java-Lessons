import java.io.IOException;

class SuperClass{
    void method() throws Exception{
        System.out.println("super-class method");
    }
}
class SubClass extends SuperClass{
    void method() throws IOException{
        System.out.println("sub-class method");
    }
}
public class t{
    public static void main(String[] args)throws Exception {
        SuperClass obj =  new SuperClass();

        obj.method();
    }
}