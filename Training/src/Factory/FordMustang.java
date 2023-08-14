package Factory;

public class FordMustang extends ElectricCarFactory{
    int price=5000000;
    int noOfElectricCars=0;
    public void getElectricCarName()
    {
        System.out.println("*** FORD MUSTANG ***");
    }

    public int getElectricCarPrice(int noOfElectricCars) {
        this.noOfElectricCars=noOfElectricCars;
        return price*noOfElectricCars;
    }

    public double discountOnFestival()
    {
        return price*noOfElectricCars-0.1*price;
    }
}
