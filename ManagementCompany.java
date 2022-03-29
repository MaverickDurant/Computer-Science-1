public class ManagementCompany 
{    
   double tax;
   double managementFee; 
   String name;
   Property[] properties;
   Plot plot;
   int count = 0;
   double MAX_WIDTH = 10;
   double MAX_DEPTH = 10;
   int MAX_PROPERY = 5;
    
   public ManagementCompany(String name, double tax, double managementFee, Plot plot) 
   {
       super();
       this.name = name;
       this.tax = tax;
       this.managementFee = managementFee;
       this.properties = new Property[MAX_PROPERY];
       this.plot = plot;
   }    
   public double getTax() 
   {
       return tax;
   }
   public void setTax(double tax) 
   {
       this.tax = tax;
   }
   
   public String getName() 
   {
       return name;
   }
   public void setName(String name) 
   {
       this.name = name;
   }
 
   public Property[] getProperties() 
   {
       return properties;
   }
   public void setProperties(Property[] properties) 
   {
       this.properties = properties;
   }
   
   public double getManagementFee() 
   {
       return managementFee;
   }
   public void setManagementFee(double managementFee) 
   {
       this.managementFee = managementFee;
   }
   
   public Plot getPlot() 
   {
       return plot;
   }
   public void setPlot(Plot plot) 
   {
       this.plot = plot;
   }
  
public int addProperty(Property property) 
{  
   if(count>=5)
       return -1;
   
else if(property==null)
       return -2;
   
if(this.plot.encompasses(property.plot)) 
{
     
   if(this.plot.overlaps(property.plot))
return -4;
   
   else {
       properties[count]=property;
       count++;
   }
}

else
   return -3;  
   return count-1;
}
  
public int addProperty(String propertyName, String city, double rentalAmount, String owner) 
{  
   Property property = new Property(propertyName, city, rentalAmount, owner,0,0,MAX_WIDTH,MAX_DEPTH);
   
   if(count>=5)
       return -1;
   
else if(property==null)
       return -2;
   
if(this.plot.encompasses(property.plot)) 
{     
   if(this.plot.overlaps(property.plot))
return -4;
   
   else {
       properties[count]=property;
       count++;
   }
}

else
   return -3;  
   return count-1;  
}

public int addPropery(String propertyName, String city, double rentalAmount, String owner,double x, double y, double width, double depth) 
{   
   Property property = new Property(propertyName, city, rentalAmount, owner, x, y, width, depth);
     
   if(count>=5)
        return -1;
   
else if(property==null)
        return -2;
   
if(this.plot.encompasses(property.plot)) 
{      
    if(this.plot.overlaps(property.plot))
return -4;
    
    else {
        properties[count]=property;
        count++;
    }
}

else
    return -3;   
    return count-1;
}

public double totalRent() 
{
   double totalRent =0;
   for(int i=0;i<count;i++) 
   {
       totalRent = totalRent+properties[i].getRentalAmount();
   }   
   return totalRent;
}

public int maxRentPropertyIndex() 
{
   int max=0;
   double temp = properties[0].getRentalAmount();
   for(int i=1;i<count;i++) 
   {
       if(temp<properties[i].getRentalAmount()) 
       {
       max =i;
       temp = properties[i].getRentalAmount();
       }
   }     
   return max;
}

public Property maxRentProp() 
{     
   return properties[maxRentPropertyIndex()];
}

@Override
public String toString() 
{
   String result ="";
   for(int i=0;i<count;i++) 
   {
       result = result + properties[i].toString();
   }     
   return result;
}
}