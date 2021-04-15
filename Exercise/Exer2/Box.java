public class Box extends Rectangle
	{
	   private double height;  
	  
	   public void setBox(double length, double width, double height)
	   {
	     
	      setRectangle(length,width); 
	      this.height = height;
	   }
	 
	   public double getVolume()
	   {
	      //Call the inherited getArea method
	      return getArea() * height;
	   }
	}
