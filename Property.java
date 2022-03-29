public class Property 
{
	String city;
    String propertyName;
    Plot plot;
    String owner;
    double rentalAmount;
     
   public Property(String propertyName, String city, double rentalAmount, String owner) 
   {
       super();
       this.propertyName = propertyName;
       this.city = city;
       this.rentalAmount = rentalAmount;
       this.owner = owner;      
   }
  
   public Property(String propertyName, String city, double rentalAmount, String owner,double x, double y, double width, double depth) 
   {
       super();
       this.propertyName = propertyName;
       this.city = city;
       this.rentalAmount = rentalAmount;
       this.owner = owner;
       this.plot = new Plot(x, y, width, depth);
   }

   @Override
   public String toString() 
   {
       return "\nProperty Name=" + propertyName + "\nLocated in " + city +
               "\nBelonging to:" + owner+"\nRent Amount:" + rentalAmount;
   }

   public String getCity() 
   {
       return city;
   }

   public void setCity(String city) 
   {
       this.city = city;
   }
   
   public String getPropertyName() 
   {
       return propertyName;
   }

   public void setPropertyName(String propertyName) 
   {
       this.propertyName = propertyName;
   }

   public String getOwner() 
   {
       return owner;
   }

   public void setOwner(String owner) 
   {
       this.owner = owner;
   }     
   
   public double getRentalAmount() 
   {
       return rentalAmount;
   }

   public void setRentalAmount(double rentalAmount) 
   {
       this.rentalAmount = rentalAmount;
   }
}
