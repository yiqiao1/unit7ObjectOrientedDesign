
public class IDCard extends Card
{
    private int idNum;

    /**
     * Default constructor for objects of class IDCard
     */
    public IDCard(String n, int id)
    {
        super(n);
        idNum = id;
    }

    public String format()
    {
        String info = "";
        info += super.format();
        info += ("\nCard ID Number: " + idNum);
        
        return info;
    }
    
    public boolean equals(Object otherObject)
    {
        if (this.getClass() == otherObject.getClass())
        {
            IDCard other = (IDCard) otherObject;
            return this.getName().equals(other.getName()) && this.idNum.equals(other.idNum);
        }
        
        return false;
    }
    
    public boolean equals(Object otherObject)
    {
        if (this.getClass() == otherObject.getClass())
        {
            CallingCard other = (CallingCard) otherObject;
            return this.getName().equals(other.getName()) 
                && this.idNum.equals(other.idNum) 
                && this.pin == other.pin;
        }
        
        return false;
    }
}
