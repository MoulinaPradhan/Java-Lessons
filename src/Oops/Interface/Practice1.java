interface  Bank{
void getB();
}

class b1 implements Bank{
public void getB(){
    System.out.println(100);
}

}
class b2 implements Bank{
   public void getB(){
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
