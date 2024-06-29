class Car{
    public void start(){System.out.println("Car Started.");}
    public void accelerate(){System.out.println("Car Accelerated.");}
    public void changeGear(){System.out.println("Manually Gear Changed.");}
}
class LuxuryCar extends Car {
    @Override
    public void changeGear(){System.out.println("Automatic Gear Changed.");}
    public void openRoof(){System.out.println("Roof Opened.");}
}
public class CarMethodOverriding {
    public static void main(String[] args){
        Car c = new LuxuryCar();
        c.start();
        c.accelerate();
        c.changeGear();
    }
}
