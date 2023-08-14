package Factory;

public abstract class CarFactory implements Factories {
    public void brake()
    {
        System.out.println("Brake applied on Car");
    }
    public void closeWindow()
    {
        System.out.println("Car windows are closed");
    }
    public void openWindow()
    {
        System.out.println("Car windows are opened");
    }
    public void startEngine()
    {
        System.out.println("Car engine started");
    }
    public void playMusic()
    {
        System.out.println("Music is playing...");
    }
}
