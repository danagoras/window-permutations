class RunMe
{
     public static void main(String args[])
     {
         //objects
         MyBox rectangularParallelepiped= new MyBox (2.5 , 3.0 , 4.0);
         Box cube= new Box(3.0);
         Spirtokouto spOne= new Spirtokouto(2.0 , 4.0 , 3.0 , 10);
         
         //Print
         System.out.println("Calculation " + rectangularParallelepiped.calculate()+ ", " + "Volume " + rectangularParallelepiped.volume());
         System.out.println("Cube Calculation " +cube.calculate() + ", " + "Volume " + cube.volume());
         System.out.println("MatchBox Calculation " +spOne.calculate() + ", " + "Volume " + spOne.volume() + ", " + "Weight " + spOne.weight); 
        }
    }