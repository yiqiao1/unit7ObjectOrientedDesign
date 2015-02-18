public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   public boolean equals(Object otherObject) //has to pass object into parameter because overridding equal method in object class
   {
       if (this.getClass() == otherObject.getClass()) //only one object for card class, so both should have same reference
       {
           Card other = (Card) otherObject;
           return this.name.equals(other.name);
       }
       
       return false;
   }
}

// .equals() compares values, == compares refereces