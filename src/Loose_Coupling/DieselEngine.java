package Loose_Coupling;

public class DieselEngine implements FourWheelerEngine
{
    public void startEngine()
    {
        System.out.println("Diesel engine started...");
    }

    public void stopEngine()
    {
        System.out.println("Diesel engine stopped...");
    }
}
