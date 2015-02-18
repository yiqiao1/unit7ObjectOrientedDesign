

/**
 * The lock is constructed with a combination - three numbers between 0 and 39. The reset method resets the dial so that it points to 0. 
 * The turn left and turnRight methods turn the dial by a given number of ticks to the left or right. 
 * The open method attempts to open the lock. 
 * The lock opens if the user first turned it right to the first number in the combination, then left to the second, and then right to the third.
 * 
 */
public class ComboLock
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] combos;
    private int dial;
    private int combo1;
    private int combo2;
    private int combo3;
    private int turn;
    private boolean open;

    /**
     * Default constructor for objects of class ComboLock
     */
    public ComboLock(int secret1, int secret2, int secret3) 
    { 
        combos = new int[3];
        dial = 0;
        combo1 = secret1;
        combo2 = secret2;
        combo3 = secret3;
        turn = 0;
        open = false;
    }

    /**
     * The reset method resets the dial so that it points to 0.
     */    
    public void reset() 
    { 
        dial = 0;
        
        for (int i = 0; i < combos.length; i++)
        {
            combos[i] = 0;
        }
    }
    
    public void turnLeft( int ticks ) 
    { 
        dial += ticks;
        combos[turn] = dial;
        turn++;
    }
    
    public void turnRight( int ticks ) 
    {  
        dial -= ticks;
        
        if (dial < 0)
        {
            combos[turn] = 39 + dial;
        }
        else
        {
            combos[turn] = dial;
        }
        
        turn++;
    }
   
    public boolean open() 
    {  
        if (combos[0] == combo1 && combos[1] == combo2 && combos[2] == combo3)
        {
            open = true;
        }
        
        this.reset();
        
        return open;
    }
}
