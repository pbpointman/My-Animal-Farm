public class Farm 
{
  public static void main(String[] a) 
  {
    World wref = new World();
  Cow buddy = new Cow(wref);
  Shark bruce = new Shark(wref);
  bruce.getDistance(100,70);
  buddy.getDistance(50,50);
  }
}
   