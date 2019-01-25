/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGitHub01;

/**
 *
 * @author FVanderSchueren
 */
public class Value {
    private Integer value;

    //defaut constructor

    public Value(Integer value) {
        this.value = value;
    }
    
    
    public int getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
}
