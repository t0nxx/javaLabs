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
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("aaa", "0135677878", 30, "deep web");
        
        Truck t1 = new Truck("byd", 2, "11/15/2018", 250000, p1, 3, 500);
        System.out.println(t1);
        
        System.out.println("*********************\n*********************");
        SportCar s1 = new SportCar("bmw", 6, "11/15/2018", 5000000, p1, 300, 1);
        System.out.println(s1);
        ////test whatever ///
        
        
    }
    
}
