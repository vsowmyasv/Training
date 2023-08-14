package Factory;

public abstract class ElectricCarFactory {
    public void brake()
    {
        System.out.println("Brake applied on Electric car");
    }
    public void closeWindow()
    {
        System.out.println("Electric car windows are closed");
    }
    public void openWindow()
    {
        System.out.println("Electric car windows are opened");
    }
    public void startEngine()
    {
        System.out.println("Electric car engine started");
    }
    public void showBatteryLevel()
    {
        System.out.println("The battery is about to die !!");
    }
}
