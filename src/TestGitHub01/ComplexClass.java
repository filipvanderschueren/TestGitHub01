/*
GitHub Demo
 */
package TestGitHub01;

import java.util.ArrayList;

/**
 *
 * @author FVanderSchueren
 */
public class ComplexClass {
    
    private ArrayList<Value> list;

    public ComplexClass() {
    }
    public void addToList(Value v)
    {
        list.add(v);
    }
    public void showList()
    {
        for (Value v : list)
           System.out.println("value :" + v);
    }
    
}
