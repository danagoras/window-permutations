class Spirtokouto extends Box
{
  //Instance Variable 
  double weight;
  
  // Constructors 
  Spirtokouto (double x,double y,double z,double a)
  {
      super(x,y,z);
      weight=a;
  }
  public String tostring () 
  {
  return "calculation=" +this.calculate() + "volume=" +this.volume() + "weight=" + this.weight;
  }
}

