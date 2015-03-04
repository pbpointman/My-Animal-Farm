public class Cow extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Cow(World wref)
  { 
    ex1.getDistance(100,100);
    super(wref);
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