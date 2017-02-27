/**
 *  @version 2016-10-31
 *  @author Manfred Kerber 
 *
 *  The Car class is a sub-class of the Vehicle class with the
 *  additional field variable representing the fuel consumption.
 */
public class Car extends Vehicle {

    /**
     *  Field variable to represent the fuel consumption of a car.
     */
    private double fuelConsumption;

    /**
     *  Constructor
     *  @param maxSpeed The maximal speed of the car.
     *  @param maxPassengers The maximal number of passengers of the car.
     *  @param fuelConsumption The fuel consumption of the car.
     */
    public Car(double maxSpeed, int maxPassengers, double fuelConsumption) {
        super(maxSpeed, maxPassengers);
        this.fuelConsumption = fuelConsumption;
    }

    /**
     *  getter for fuelConsumption.
     *  @return The fuel consumption of the car.
     */
    public double getFuelConsumption(){
        return fuelConsumption;
    }

    /**
     *  setter for fuelConsumption.
     *  @param fuelConsumption The new fuel consumption of the car.
     */
    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    /**
     *  toString method 
     *  @return A readable presentation of the object.
     */
    public String toString() {
        return super.toString() + " Its fuel consumption is " +
            getFuelConsumption() + " l/100km.";
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(20, 1);
        System.out.println(v1);
        Vehicle v2 = new Vehicle(25, 2);
        System.out.println(v2);
        Car c1 = new Car(150, 2, 7.6);
        System.out.println(c1);
        Car c2 = new Car(170, 5, 8.2);
        System.out.println(c2);
        Car c3 = new Car(300, 1, 78.6);
        System.out.println(c3);
    }
}
