public class Main extends PApplet
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
    String[] appletArgs = new String[] { "Main" };
    if (passedArgs != null)
    {
      PApplet.main(concat(appletArgs, passedArgs));
    }
    else
    {
      PApplet.main(appletArgs);
    }
  }
}
