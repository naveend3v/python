class CoffeeMachine{
    private float waterQty;
    private float coffeeQty;
    private float sugarQty;
    private float milkQty;

    // Static variable used to create single instance
    static private CoffeeMachine cm = null;

    private CoffeeMachine(){
        waterQty = coffeeQty = sugarQty = milkQty = 1;
    }

    public void fillWater(float waterLevel){
        waterQty = waterLevel;
    }
    public void fillSugar(float sugarLevel){
        sugarQty = sugarLevel;
    }

    public String getCoffee() {
        return "Coffee Ready!!";
    }

    // Static method to create Singleton class using getInstance() method
    static CoffeeMachine getInstance(){
        if(cm==null){
            cm = new CoffeeMachine();
        }
        return cm;
    }
}
public class SingletonClass {
    public static void main(String[] args){
        // Instantiating the Singleton class
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        CoffeeMachine c3 = CoffeeMachine.getInstance();

        // Checking the reference of the single instance
        System.out.println(c1 + "  " + c2 + "  " + c3);


    }
}
