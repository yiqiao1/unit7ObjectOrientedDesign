

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class TestBillfold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestBillfold
{

    /**
     * Default constructor for objects of class TestBillfold
     */
    public TestBillfold()
    {
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
    
    public String testFormatCards()
    {
        IDCard newID = new IDCard("Yi", 63261);
        CallingCard newCalling = new CallingCard("Yi", 27, 3693817);
        Billfold billfold = new Billfold(newID, newCalling);
        return billfold.formatCards();
    }

}
