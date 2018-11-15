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
public class Vehicle {
    private String manufacturerName ;
    private int numberOfCylinders ;
    private String dateOfManufacturing ;
    private double price ;
    private Person owner ;

    public Vehicle(String manufacturerName, int numberOfCylinders, String dateOfManufacturing, double price, Person owner) {
        this.manufacturerName = manufacturerName;
        this.numberOfCylinders = numberOfCylinders;
        this.dateOfManufacturing = dateOfManufacturing;
        this.price = price;
        this.owner = owner;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setDateOfManufacturing(String dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    
    
}
