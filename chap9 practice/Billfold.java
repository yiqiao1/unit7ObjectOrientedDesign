
public class Billfold extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private Card card1;
    
    private Card card2;

    /**
     * Default constructor for objects of class Billfold
     */
    public Billfold(Card one, Card two)
    {
        card1 = one;
        card2 = two;
    }

    public void addCard(Card newCard)
    {
        if (card1 == null)
        {
            card1 = newCard;
        }
        else if (card2 == null)
        {
            card2 = newCard;
        }
    }

    public String formatCards()
    {
        String info = "[";
        info += card1.format() + "|";
        info += card2.format() + "]";
        return info;
    }
}
