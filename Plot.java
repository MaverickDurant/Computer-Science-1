public class Plot 
{	
   double x;
   double y;
   double depth;
   double width;
   
   public double getWidth() 
   {
       return width;
   }

   public void setWidth(double width) 
   {
       this.width = width;
   }

   public double getDepth() 
   {
       return depth;
   }

   public void setDepth(double depth) 
   {
       this.depth = depth;
   }

   public double getX() 
   {
       return x;
   }

   public void setX(double x) 
   {
       this.x = x;
   }

   public double getY() 
   {
       return y;
   }

   public void setY(double y) 
   {
       this.y = y;
   }


   public Plot(double x, double y, double width, double depth) 
   {
       super();
       this.x = x;
       this.y = y;
       this.width = width;
       this.depth = depth;
   }

   @Override
   public String toString() 
   {
       return "Plot [x-coordinate=" + x + ", y-coordinate=" + y + ", width=" + width + ", depth=" + depth + "]\n";
   }
  
   public boolean overlaps(Plot other) 
   {
       if(!encompasses(other)) 
       {         
           double x11,x12,x13,x14,y11,y12,y13,y14,x21,x22,x23,x24,y21,y22,y23,y24;
          
           x11 =x13 = this.x;
           x12 = x14 = x11 + this.width;
           y11 = y12 = this.y;
           y13 = y14 = y11 - this.depth;
          
           x21 = x23 = this.x;
           x22 = x24 = x21 + other.width;
           y21 = y22 = this.y;
           y23 = y24 = y21 - other.depth;
          
           if(x21<x11 && x22>x11) 
           {       
               if(y21>y11 && y23<y11)
                   return true;
               else if(y21<y11 && y21>y13)
                   return true;             
           }
          
           else if(x21>x11 && x21<x12) 
           {              
               if(y21<y11 && y21>y13)
                   return true;
               else if(y21>y11 && y23<y11)
                   return true;             
           }
       }
       return false;
   }

   public boolean encompasses(Plot other) 
   {     
       double x11,x12,x13,x14,y11,y12,y13,y14,x21,x22,x23,x24,y21,y22,y23,y24;
      
       x11 =x13 = this.x;
       x12 = x14 = x11 + this.width;
       y11 = y12 = this.y;
       y13 = y14 = y11 - this.depth;
      
       x21 = x23 = this.x;
       x22 = x24 = x21 + other.width;
       y21 = y22 = this.y;
       y23 = y24 = y21 - other.depth;
      
       if(x11<=x21 && x12<=x22) 
       {
           if(y11<=y21 && y13<=y23)
               return true;
       }
      
       else if(x21<=x11 && x22<=x12) 
       {
           if(y21<=y11 && y23<=y13)
               return true;
       }
       return false;
   }  
}
