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

  bruce.getDistance(100,70);
  buddy.getDistance(50,50);
  
//giving commands for buddy
  buddy.animateforward(150);
  buddy.animateturn(270);
  buddy.animateforward(100);
  buddy.animateturn(270);
  buddy.animateforward(300);
  buddy.turnToFace(10,10);
  buddy.setWidth(100);
  buddy.animateforward(300);
  }
  
}
