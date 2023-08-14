package Factory;

public class FordTransitBus extends BusFactory{
    int price=1000000;
    int noOfBus=0;
    public void getBusName()
    {
        System.out.println("*** FORD TRANSIT BUS ***");
    }

    public int getBusPrice(int noOfBus) {
        this.noOfBus=noOfBus;
        return price*noOfBus;
    }

    public double discountOnFestival()
    {
        return price*noOfBus-0.1*price;
    }
}
