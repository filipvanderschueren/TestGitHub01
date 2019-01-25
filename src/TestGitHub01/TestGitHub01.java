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
public class TestGitHub01 {
    
    public static void main(String[] args)
    {
        SomeText s = new SomeText("hello");
        System.out.println("Show text :" + s.getText());
        Value v = new Value();
        v.setValue(8);
        System.out.println("Show value :" + v.getValue());
    }
    
}
