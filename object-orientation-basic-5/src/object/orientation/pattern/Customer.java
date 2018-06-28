/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.orientation.pattern;

/**
 *
 * @author User
 */
public class Customer {

    private String name;
    private boolean woman;
    private boolean elderly;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWoman() {
        return woman;
    }

    public void setWoman(boolean woman) {
        this.woman = woman;
    }

    public boolean isElderly() {
        return elderly;
    }

    public void setElderly(boolean elderly) {
        this.elderly = elderly;
    }

}
