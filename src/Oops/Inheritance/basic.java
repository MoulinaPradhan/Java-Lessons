class animal{
    void walk(){
        System.out.println("All animals walk ...like this!");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("all cat meow");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barkkkkkkkk");
    }
}

public class test{
    public static void main(String args[]){
animal a = new cat();
cat c = new cat();
dog d = new dog();
a.walk();
c.walk();
c.meow();
    }
}
