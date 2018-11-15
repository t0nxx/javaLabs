/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

/**
 *
 * @author t0ni
 */
public class Truck extends Vehicle{
    private double loadCapacity ;
    private int towingCapacity ;

    public Truck(String manufacturerName, int numberOfCylinders, String dateOfManufacturing, double price, Person owner ,double loadCapacity, int towingCapacity) {
        super(manufacturerName, numberOfCylinders, dateOfManufacturing, price, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
    @Override
    public String toString(){
        return String.format("*******car details******* \n "
                + "manufacturerName : %s \n numberOfCylinders : %d \n "
                + "dateOfManufacturing : %s \n price : %f $ \n owner : %s \n "
                + "loadCapacity : %f tons \n towingCapacity : %d tons", 
                getManufacturerName(),getNumberOfCylinders(),getDateOfManufacturing(),getPrice(),getOwner().getName(),
                getLoadCapacity(),getTowingCapacity());
    }
    
}
