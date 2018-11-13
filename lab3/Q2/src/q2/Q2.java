/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author t0ni
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Conversions from C to F");
       temperature t1 = new temperature(0, 'C');
        System.out.println(t1.toString());
        t1.setTemp(100);
        System.out.println(t1.toString());
        System.out.println("*************************");
       /////////////////
       System.out.println("Conversions from F to C");
       temperature t2 = new temperature(32, 'F');
        System.out.println(t2.toString());
        t2.setTemp(212);
        System.out.println(t2.toString());
         System.out.println("*************************");
       ////////////////
       System.out.println("comparison");
       temperature t3 = new temperature(0.0, 'C');
       temperature t4 = new temperature(32.0, 'F');
       boolean test = t3.isEqual(t4);
       System.out.println("is t3 equal    to t4 ظظظظ    ??" +"\t"+ test);
       test = t3.isBiggerThan(t4);
       System.out.println("is t3 bigger than t4 ظظظظ    ??" +"\t"+ test);
    }
    
}
