class MyBox extends Box
{
  // Constructors
  MyBox (double x ,double y ,double z)
  {
      super(x, y, z);
        {
          if (width!=height && width!=length)
          {
            System.out.println("Wrong inputs. please give values to create cube");
          }
        }
  }
  //Methods
  double calculate()  
    { 
     return super.calculate();
    } 
  double volume()
    {
      return super.volume();
    }
  public String tostring () 
    {
      return "calculation=" +this.calculate() + "volume=" +this.volume();
    }
}


  
