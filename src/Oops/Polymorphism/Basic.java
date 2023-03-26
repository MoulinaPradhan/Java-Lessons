class car{
    public void walk(){
        System.out.println("car");
    }
    public void walk(String tur){
        System.out.println(tur);
    }
}
class veh extends car{
 
    public void walk(){
        System.out.println("walk");
    }
    
}
class truck extends car{
    @Override
    public void walk(){
        System.out.println("truck");
    }
   
}
public class test{
    public static void main(String[] args) {
car c = new car();
c.walk("ssgsg");
c.walk();

    }
}
