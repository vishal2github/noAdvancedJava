package Loose_Coupling;

public class Car
{
    private FourWheelerEngine engine;

    public Car(FourWheelerEngine engine)
    {
        this.engine = engine; // Loose coupling
    }

    public void setEngine(FourWheelerEngine engine)
    {
        this.engine = engine; // Loose coupling
    }

    public void turnEngineOn()
    {
        engine.startEngine();
    }

    public void turnEngineOff()
    {
        engine.stopEngine();
    }
}
