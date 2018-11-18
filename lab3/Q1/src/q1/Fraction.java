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
public class Fraction {
    private int numerator ;
    private int denominator ;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if(denominator !=0)
            this.denominator = denominator;
        else
            this.denominator= 1 ;
    }
    public double getFraction(){
        return (double) numerator / denominator ;
    }
    
    public String reduceFraction(){
        int n = numerator ;
        int d = denominator ;
        /////to find gcd /////
        while (n!=0) {            
            int temp = n ;
            n = d % n ;
            d = temp ;
        }
        numerator = numerator /d ;
        denominator = denominator /d ;
        
        return numerator + " / " + denominator ;
    }
    
  
}
