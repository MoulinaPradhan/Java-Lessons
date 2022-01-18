class Vehicle{
String model;
int price;
int number;
Vehicle(String m,int p,int num){
model=m;
price=p;
number=num;

}
void display(){
    System.out.println("model "+model+"model number "+number+" price "+price);
}
}    
class Car extends Vehicle{
    int noWheel;
   Car(String m, int p , int num, int w){
       super(m,p,num);
       noWheel=w;
   }
   void display(){
       super.display();
       System.out.println("no. of wheel"+noWheel);
   }
 
}
class Bus extends Vehicle{
    int noWheels;
    Bus(String m, int p, int num, int w){
        super(m,p,num);
        noWheels=w;
    }
    void display(){
        super.display();
        System.out.println("no. of wheel"+noWheels);
    }
}

public class qs3 {
    public static void main(String[] args) {
        Car c1 = new Car("audi", 12, 7855,4);
        c1.display();
        Bus b1 = new Bus("bus", 15, 563, 8);
        b1.display();
    }
}
