package Loose_Coupling;

public class App
{
    public static void main(String[] args)
    {
        Car car1 = new Car(new DieselEngine());
        Car car2 = new Car(new PetrolEngine());
        Car car3 = new Car(new CNGEngine());

        car1.turnEngineOn();
        car1.turnEngineOff();

        car2.turnEngineOn();
        car2.turnEngineOff();

        car3.turnEngineOn();
        car3.turnEngineOff();
    }
}
