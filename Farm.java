public class Farm 
{
  public static void main(String[] a) 
  {
    World wref = new World();
  Cow buddy = new Cow(wref);
  Shark bruce = new Shark(wref);
  bruce.getDistance(100,70);
  buddy.getDistance(50,50);
  
//giving commands for buddy
  buddy.forward(150);
  buddy.turn(270);
  buddy.forward(100);
  buddy.turn(270);
  buddy.forward(300);
  buddy.turnToFace(10,10);
  buddy.setWidth(100);
  }
  
}
   