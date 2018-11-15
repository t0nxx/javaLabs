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
public class Student {
    private int id ;
    private String name ;
    private String dep ;

    public Student(int id, String name, String dep) {
        this.id = id;
        this.name = name;
        this.dep = dep;
    }

    public Student() {
        this.id = 0;
        this.name = "no name";
        this.dep = "no dep";
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDep() {
        return dep;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    
}
