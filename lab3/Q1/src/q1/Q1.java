/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author t0ni
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fraction f1 = new Fraction(20, 60) ;
       Fraction f2 = new Fraction(35, 49) ;
       
        System.out.format(" f1 num/dem = %f \n f1 fraction reduced = %s \n", f1.getFraction() , f1.reduceFraction());
        System.out.println("************************");
        System.out.format(" f2 num/dem = %f \n f2 fraction reduced = %s \n", f2.getFraction() , f2.reduceFraction());
    }
    
}
