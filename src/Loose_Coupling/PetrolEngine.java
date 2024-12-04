package Loose_Coupling;

public class PetrolEngine implements FourWheelerEngine
{
    public void startEngine()
    {
        System.out.println("Petrol engine started...");
    }

    public void stopEngine()
    {
        System.out.println("Petrol engine stopped...");
    }
}
