package Factory;

public class FordEcosport extends CarFactory{
    int price=500000;
    int noOfCars=0;
public void getCarName()
{
    System.out.println("*** FORD ECOSPORT ***");
}

public int getCarPrice(int noOfCars) {
    this.noOfCars=noOfCars;
    return price*noOfCars;
}

public double discountOnFestival()
{
    return price*noOfCars-0.1*price;
}

}
