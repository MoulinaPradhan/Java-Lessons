// https://www.codesdope.com/discussion/create-an-abstract-class-bank-with-an-abstract-met/
abstract class Bank{
    abstract void getB();
}

class b1 extends Bank{
void getB(){
    System.out.println(100);
}

}
class b2 extends Bank{
    void getB(){
        System.out.println(500);
    }
}
public class test{
    public static void main(String[] args) {
        b1 b = new b1();
        b2 c = new b2();
       b.getB();
       c.getB();
    }
}
