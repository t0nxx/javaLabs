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
public class Person {
    private String name ;
    private String phone ;
    private float age ;
    private String address ;

    public Person(String name, String phone, float age, String address) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public float getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString(){
        return String.format("clientName : %s  , age : %f , phone : %s , address : %s", getName(),getAge(),getPhone(),getAddress());
    }
}
