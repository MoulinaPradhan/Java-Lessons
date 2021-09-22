// package src.Oops;

class Cat {
    int legs, eyes;// features

    public void walk() {
        System.out.println("it is walking");// behaviour
    }

    public void jump() {
        System.out.println("It is jumping");
    }

    public void description() {
        System.out.println("it has " + legs + "legs and " + eyes + " eyes");
    }
}



public class CatClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.walk();
        cat1.legs = 2;
        cat2.eyes = 3;
        cat2.description();
        cat2.jump();
    }
}
