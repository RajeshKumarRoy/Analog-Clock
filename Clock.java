import processing.core.PApplet;

public class Clock
{
  private PApplet p;
  private int x, y, s;
  private float secondHand, minuteHand, hourHand;
  
  public Clock(PApplet P, int X, int Y, int S)
  {
    p = P;
    x = X;
    y = Y;
    s = S;
  }
  
  private void update()
  {
    secondHand = PApplet.map(PApplet.second(), 0, 60, 0, TWO_PI) - HALF_PI;
    minuteHand = PApplet.map(PApplet.minute(), 0, 60, 0, TWO_PI) - HALF_PI;
    hourHand = PApplet.map(PApplet.hour(), 0, 24, 0, TWO_PI) - HALF_PI;
  }
  
  private void display()
  {
    p.stroke(#ffffff);
    p.noFill();
    p.stroke(#ffffff);
    p.strokeWeight(3);
    p.ellipse(x, y, s, s);
    p.strokeWeight(2);
    p.line(x, y, x+s/2*PApplet.cos(secondHand), y+s/2*PApplet.sin(secondHand)); //seconds hand
    p.strokeWeight(4);
    p.line(x, y, x+(s/2 - 50)*PApplet.cos(minuteHand), y+(s/2 - 50)*PApplet.sin(minuteHand)); //minute hand
    p.strokeWeight(6);
    p.line(x, y, x+(s/2 - 100)*PApplet.cos(hourHand), y+(s/2 - 100)*PApplet.sin(hourHand)); //hour hand
  }
  
  public void act()
  {
    update();
    display();
  }
}
