import processing.core.PApplet;
import processing.core.PConstants;

public class Main extends PApplet implements PConstants
{
  public Clock c;

  public void settings()
  {
    size(800, 800);
  }

  public void setup()
  {
    surface.setTitle("CLOCK");
    c = new Clock(this, width/2, height/2, 800);
  }

  public void draw()
  {
    background(0xff012345);
    c.act();
  }

  public static void main(String[] passedArgs)
  {
    PApplet.main((passedArgs != null) ? concat(new String[] { "Main" }, passedArgs) : PApplet.main(new String[] { "Main" }));
  }
}
