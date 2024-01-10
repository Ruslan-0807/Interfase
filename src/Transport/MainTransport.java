package Transport;

import java.util.concurrent.Callable;

public class MainTransport {
    public static void main(String[] args) {
        Car car = new Car(1000,100);
        System.out.println("Расход топлива автомобиля = " + car.calculateFuel() + "литров/km");
        Airplane airplane = new Airplane(1000, 1000);
        System.out.println("Расход топлива самолета = " + airplane.calculateFuel() + "литров/km");
            }
        };


