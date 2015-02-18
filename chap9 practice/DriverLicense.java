
public class DriverLicense extends Card
{
    private int expDate;

    /**
     * Default constructor for objects of class IDCard
     */
    public DriverLicense(String n, int exp)
    {
        super(n);
        expDate = exp;
    }

    public String format()
    {
        String info = "";
        info += super.format();
        info += ("\nExpiration Date: " + expDate);
        
        return info;
    }

}
