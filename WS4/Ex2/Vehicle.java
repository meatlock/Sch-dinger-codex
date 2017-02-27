/**
 *  @version 2016-10-31
 *  @author Manfred Kerber 
 *
 *  A Vehicle is represented by its maximal speed and the maximal
 *  number of passengers.
 */
public class Vehicle {
    /** Field variables to represent the maximal speed and the maximal
     * number of passengers.
     */
    private double maxSpeed;
    private int maxPassengers;

    /**
     *  Constructor
     *  @param maxSpeed The maximal speed of the vehicle.
     *  @param maxPassengers The maximal number of passengers of the vehicle.
     */
    public Vehicle(double maxSpeed, int maxPassengers) {
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
    }

    /**
     *  getter for maxSpeed
     *  @return The maximal speed of the vehicle.
     */
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     *  setter for maxSpeed
     *  @param maxSpeed The new maximal speed of the vehicle.
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     *  getter for maxPassengers
     *  @return The maximal number of passengers of the vehicle.
     */
    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    /**
     *  setter for maxPassengers
     *  @param maxPassengers The new maximal number of passengers of the vehicle.
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     *  toString method 
     *  @return A readable presentation of the object.
     */
    public String toString() {
        String passengerString;
        if (getMaxPassengers() == 1) {
            passengerString = " passenger.";
        } else {
            passengerString = " passengers.";
        }
        return "The vehicle has a maximal speed of " + getMaxSpeed()  +
            " km/h. It carries " + getMaxPassengers() + passengerString;
    }
}
