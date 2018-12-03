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
public class Document {
    private String text ;

    public Document(String text) {
        this.text = text;
    }
    
    public Document() {
        this.text = "" ;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString (){
        return text ;
    }

    public String getText() {
        return text;
    }
    
}
