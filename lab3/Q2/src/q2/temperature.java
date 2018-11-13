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
public class temperature {
    
    private double temp ;
    private char scale ;
    
    ///1st constructor ///
    public temperature(double temp) {
        this.temp = temp;
        scale = 'C';
    }
    ////2nd con /////////
    public temperature(char scale) {
        this.scale = scale;
        temp = 0 ;
    }
    /////3rd ////////////
    public temperature(double temp, char scale) {
        this.temp = temp;
        this.scale = scale;
    }
    ////4th /////////
    public temperature() {
        temp = 0 ;
        scale = 'C';
    }
    //// 1st accessor return Celsius ////
    public double getCelsius() {
        double t ;
        if(scale == 'C')
            t  = temp;
        else
            t = (5 * (temp - 32)) / 9 ;
        return  t ;
    }
    //// 2nd accessor return Fahrenheit ////
    public double getFahrenheit() {
        double t ;
        if(scale == 'F')
            t  = temp;
        else
            t = ((9 * temp)/5) + 32 ;
        return  t ;
    }
    //// Three mutator methods /////
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public void setScale(char scale) {
        this.scale = scale;
    }
     public void setTempAndScale(double temp , char scale) {
        this.temp = temp;
        this.scale = scale ;
    }
    ////Three comparison methods ////
     
     public boolean isEqual(temperature t){
        return getCelsius() == t.getCelsius() ;
     }
     
     public boolean isLessThan(temperature t){
        return getCelsius() < t.getCelsius() ;
     }
     
     public boolean isBiggerThan(temperature t){
        return getCelsius() > t.getCelsius() ;
     }
     /// suitable toString method /////
    @Override
     public String toString(){
         if(scale == 'C')
             return String.format("%.2f degrees C = %.2f degrees F ",getCelsius(),getFahrenheit());
         else
             return String.format("%.2f degrees F = %.2f degrees C ",getFahrenheit(),getCelsius());
     }
    
}
