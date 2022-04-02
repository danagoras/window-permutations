
class Box  
{  
  // Instance Variables  
  double length ; 
  double width  ; 
  double height ;
  
  // Constructors  
  
  Box ( double side )  
  {  
    width  = side ; 
    height = side ; 
    length = side ; 
  }
  Box(double x,double y,double z)
  { 
    width=x;
    height=y;
    length=z;
  }
  // Methods  
  
   double calculate()  
  { 
    return 2 * ( width *  height +    
                 width * length +    
                 height * length ) ;  
  } 
  double volume()
  {
    return (width*height*length);
  }

  
  
  public String tostring () 
  {
  return "calculation=" +this.calculate() + "volume=" +this.volume();
  }
}
 
