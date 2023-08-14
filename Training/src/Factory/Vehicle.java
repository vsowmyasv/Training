package Factory;

public class Vehicle {
    public static void main(String[] args){
        FordEcosport feco = new FordEcosport();
        FordMustang fmus = new FordMustang();
        FordTransitBus ftran = new FordTransitBus();

        feco.getCarName();
        feco.brake();
        feco.openWindow();
        feco.closeWindow();
        feco.startEngine();
        feco.playMusic();
        System.out.println("Price of car : "+feco.getCarPrice(10));
        System.out.println("Price of car after discount : "+feco.discountOnFestival());

        fmus.getElectricCarName();
        fmus.brake();
        fmus.openWindow();
        fmus.closeWindow();
        fmus.startEngine();
        fmus.showBatteryLevel();
        System.out.println("Price of Electric car : "+fmus.getElectricCarPrice(20));
        System.out.println("Price of Electric car after discount :"+fmus.discountOnFestival());

        ftran.getBusName();
        ftran.brake();
        ftran.openWindow();
        ftran.closeWindow();
        ftran.startEngine();
        ftran.hydraulicBrake();
        ftran.emergencyExit();
        System.out.println("Price of Bus : "+ftran.getBusPrice(20));
        System.out.println("Price of Bus after discount : "+fmus.discountOnFestival());
    }
}
