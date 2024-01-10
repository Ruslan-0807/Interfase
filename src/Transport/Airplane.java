package Transport;

public class Airplane implements Transport{
    public double distance;
    public double fuel;

    public Airplane(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    @Override
    public double calculateFuel() {
        return this.fuel / this.distance;
    }
}
