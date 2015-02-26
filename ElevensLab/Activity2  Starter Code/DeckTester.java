/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
	    String[] ranks1 = {"ace", "two", "three"};
	    String[] ranks2 = {"four", "five", "six"};
	    String[] ranks3 = {"seven", "eight", "nine"};
	        
	    String[] suits1 = {"spades", "hearts"};
	    String[] suits2 = {"hearts", "diamonds"};
	    String[]suits3 = {"diamonds", "clubs"};
	    
	    int[] values1 = {1, 2, 3};
	    int[] values2 = {4, 5, 6};
	    int[] values3 = {7, 8, 9};
	    
	    Deck deck1 = new Deck(ranks1, suits1, values1);
	    System.out.println("Is Empty: " + deck1.isEmpty());
	    System.out.println("Size: " + deck1.size());
	    System.out.println("Deal: " + deck1.deal());
	    System.out.println(deck1.toString());
	    
	    Deck deck2 = new Deck(ranks2, suits2, values2);
	    System.out.println("Is Empty: " + deck2.isEmpty());
	    System.out.println("Size: " + deck2.size());
	    System.out.println("Deal: " + deck2.deal());
	    System.out.println(deck2.toString());
	    
	    Deck deck3 = new Deck(ranks3, suits3, values3);
	    System.out.println("Is Empty: " + deck3.isEmpty());
	    System.out.println("Size: " + deck3.size());
	    System.out.println("Deal: " + deck3.deal());
	    System.out.println(deck3.toString());
	}
}
