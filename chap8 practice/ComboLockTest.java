

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class ComboLockTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLockTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class ComboLockTest
     */
    public ComboLockTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testComboLock()
    {
        ComboLock lock = new ComboLock(19, 33, 27);
        lock.turnRight(20);
        lock.turnLeft(53);
        lock.turnRight(6);
        assertTrue(lock.open());
    }
}
