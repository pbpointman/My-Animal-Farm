import java.awt.Color;

public class Cow extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Cow(World wref)
  { 
    super(wref);
    //this.getShellColor(0,0,0)
    Color shellColor = new Color(0,0,0);
    this.setShellColor(shellColor);
    Color bodyColor = new Color(165,42,42);
    this.setBodyColor(bodyColor);
    this.setWidth(100);
    this.setHeight(100);

   
   
   
  }
  public void animateforward(int x)
  {
    for(int i=0; i<10; i++);
    this.forward();
      try
    {
      Thread.sleep(150);
    }catch(InterruptedException ex) { }
  }
  public void animateturn(int x)
  {
    for(int i=0; i<10; i++);
    this.turn(x);
    try
    { 
      Thread.sleep(150);
    }catch(InterruptedException ex) { }
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Cow(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}