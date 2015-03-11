public class Farm 
{
  public static void main(String[] a) 
  {
    World wref = new World();
    Cow buddy=new Cow(wref);
    Shark bruce=new Shark(wref);
    bruce.forward(100);
    bruce.turnRight();
    bruce.forward(20);
    bruce.turnRight();
    bruce.forward(25);
    bruce.turnLeft();
    bruce.forward(100);
    bruce.turnLeft();
    bruce.forward(75);
  }
}