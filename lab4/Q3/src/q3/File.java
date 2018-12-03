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
public class File extends Document{
    private String pathname ;

    public File(String pathname, String text) {
        super(text);
        this.pathname = pathname;
    }
     public File() {
        this.pathname = "";
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }
    
    @Override
    public String toString (){
        return String.format("path : %s "
                + "text : %s ", getPathname(),getText());
    }
    
}
