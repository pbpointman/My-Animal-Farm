public class Shark extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Shark(World wref)
  {
    super(wref);
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Shark(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}