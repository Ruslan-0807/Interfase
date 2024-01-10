package Transport;

public class Car implements Transport {
    public double distance;
    public double fuel;

    public Car(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }
    @Override
    public double calculateFuel(){
        return this.fuel/this.distance;
}

}
