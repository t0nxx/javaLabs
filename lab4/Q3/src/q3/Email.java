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
public class Email extends Document{
    private String sender ;
    private String recipient ;
    private String title ;

    public Email(String sender, String recipient, String title, String text) {
        super(text);
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
    }
    
    public Email() {
        this.sender = "";
        this.recipient = "";
        this.title = "";
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTitle() {
        return title;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString (){
        return String.format("**************"
                + "sender : %s"
                + "recipient : %s"
                + "title : %s"
                + "body : %s", getSender(),getRecipient(),getTitle(),getText());
    }
}
