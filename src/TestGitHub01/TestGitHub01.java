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
        Value v = new Value(5); //constructor changed 
        v.setValue(8);
        System.out.println("Show value :" + v.getValue());
        
        //now branching in Git
        ComplexClass cC = new ComplexClass();
        
//        Value v1 = new Value(22);
//        cC.addToList(v1);
        
        cC.addToList(new Value(2));
        cC.addToList(new Value(3));
        cC.addToList(new Value(4));
        cC.showList();
        //end using cC
 
    }
    
}
