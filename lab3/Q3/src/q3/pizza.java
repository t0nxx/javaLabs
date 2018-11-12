/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author t0ni
 */
public class pizza {
    private String size ;
    private int numberOfCheese ;
    private int numberOfChicken ;
    private int numberOfBeef ;

    
    //////////start constructor/////////
    public pizza(String size, int numberOfCheese, int numberOfChicken, int numberOfBeef) {
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfChicken = numberOfChicken;
        this.numberOfBeef = numberOfBeef;
    }
    /////end constructor/////////////////////////
    /////////start getter /////
       public String getSize() {
               return size;
       }

       public int getNumberOfCheese() {
           return numberOfCheese;
       }

       public int getNumberOfChicken() {
           return numberOfChicken;
       }

       public int getNumberOfBeef() {
           return numberOfBeef;
       }
    
    ////////end getter /////////
    
    ////////start setter /////////

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumberOfCheese(int numberOfCheese) {
        this.numberOfCheese = numberOfCheese;
    }

    public void setNumberOfChicken(int numberOfChicken) {
        this.numberOfChicken = numberOfChicken;
    }

    public void setNumberOfBeef(int numberOfBeef) {
        this.numberOfBeef = numberOfBeef;
    }
    ///////end setter //////////////
    
    
    ///// calCost ////

    
    public double calCost (){
        double total = 0  , totOfCheese = 0  , totOfchicken = 0,totOfBeef =0 ;
        try {
            switch(size){
                case "small" :
                totOfCheese  = numberOfCheese*10;
                totOfchicken = numberOfChicken*12;
                totOfBeef    = numberOfBeef*13;
                break;
            case "medium" :
                totOfCheese  = numberOfCheese*12;
                totOfchicken = numberOfChicken*14;
                totOfBeef    = numberOfBeef*15;
                break;
            case "large" :
                totOfCheese  = numberOfCheese*14;
                totOfchicken = numberOfChicken*16;
                totOfBeef    = numberOfBeef*17;
                break;
            default:
                totOfCheese  = numberOfCheese*0;
                totOfchicken = numberOfChicken*0;
                totOfBeef    = numberOfBeef*0;
            }
            total = totOfCheese + totOfchicken +totOfBeef ;
        } catch (Exception e) {
            System.out.println(e);
        }
        return total ;
    }
    
    
    //////display /////
    public void getDescription (){
        System.out.println("**************report************");
        
        System.out.println("pizzaSize            "+ size);
        System.out.println("numberOfCheese       "+ numberOfCheese);
        System.out.println("numberOfChicken      "+numberOfChicken);
        System.out.println("numberOfBeef         "+numberOfBeef);
        System.out.println("totalCost            "+calCost());
        
        System.out.println("********************************");
        
    }
    
        
}
