/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.Scanner;

/**
 *
 * @author t0ni
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String size ;
       int  numOfCheese , numOfchicken , numOfBeef ;
       boolean correctSize ;
       
       
        do {            
           System.out.println("Input the pizza size small or medium or large");
            size = input.nextLine();
            if (!(size.toLowerCase().equals("small") || size.toLowerCase().equals("medium") || size.toLowerCase().equals("large"))){
                System.out.println("Invalid input use small/meduim/lare lowercase ya nooooob :3");
            correctSize = true ;
            }
            else{
                correctSize = false ;
            }
        } while (correctSize);
        System.out.println("Input the number of cheese toppings ");
        numOfCheese = input.nextInt();
        System.out.println("Input the number of chicken toppings ");
        numOfchicken = input.nextInt();
        System.out.println("Input the number of beef toppings ");
        numOfBeef = input.nextInt();
   
        pizza p = new pizza(size, numOfCheese, numOfchicken, numOfBeef);
        
        p.getDescription();
       
       
    }
    
}
