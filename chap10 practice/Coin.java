import java.util.ArrayList;
import java.util.Collections;

public class Coin implements Comparable<Coin>
{
    private double value;
    
    private String name;
    
    public Coin(double value, String name)
    {
        this.value = value;
        this.name = name;
    }
    
    public String toString()
    {
        return name + ": " + value;
    }
    
    public int compareTo(Coin other)
    {
        if (this.value < other.value)
        {
            return -1;
        }
        else if (this.value > other.value)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public static void main(String[] args)
    {
        Coin quarter = new Coin(.25, "quarter");
        Coin dime = new Coin(.10, "dime");
        ArrayList<Coin> list = new ArrayList<Coin>();
        
        list.add(quarter);
        list.add(dime);
        
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);
    }
}