interface Lang{
    void getName();
}
class a implements Lang{
    public void getName(){
        System.out.println("java");
    }
}
public class test{
    public static void main(String[] args) {
        a b = new a();
        b.getName();
    }
}
