/*
GitHub Demo
 */
package TestGitHub01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FVanderSchueren
 */
public class ComplexClass {
    
    private ArrayList<Value> list;

    public ComplexClass() {
        list = new ArrayList<>();
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
