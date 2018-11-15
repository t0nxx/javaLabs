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
public class SportCar extends Vehicle{
    
    private double speed ;
    private double weight ;

    public SportCar( String manufacturerName, int numberOfCylinders, String dateOfManufacturing, double price, Person owner ,double speed, double weight) {
        super(manufacturerName, numberOfCylinders, dateOfManufacturing, price, owner );
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return String.format("*******car details******* \n "
                + "manufacturerName : %s \n numberOfCylinders : %d \n "
                + "dateOfManufacturing : %s \n price : %f $ \n owner : %s \n "
                + "speed : %f km/s \n weight : %f ton", 
                getManufacturerName(),getNumberOfCylinders(),getDateOfManufacturing(),getPrice(),getOwner().getName(),
                getSpeed(),getWeight());
    }
    
   
    
}
