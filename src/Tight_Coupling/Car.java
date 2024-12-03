package Tight_Coupling;

public class Car
{
    private DieselEngine engine;

    public Car()
    {
        engine = new DieselEngine();
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
