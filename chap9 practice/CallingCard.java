
public class CallingCard extends Card
{
    private int cardNum;
    
    private int pin;

    /**
     * Default constructor for objects of class IDCard
     */
    public CallingCard(String n, int card, int pinNum)
    {
        super(n);
        cardNum = card;
        pin = pinNum;
    }

    public String format()
    {
        String info = "";
        info += super.format();
        info += ("\nCard Number: " + cardNum);
        info += ("\nPIN: " + pin);
        
        return info;
    }

}
