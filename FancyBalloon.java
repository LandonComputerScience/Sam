import java.awt.*;

public class FancyBalloon extends Balloon
{
    private int xCenter, yCenter, radius;
    private Color color;

    public FancyBalloon()
    {
        xCenter = 0;
        yCenter = 0;
        radius = 50;
        color = Color.BLUE;
    }

    public FancyBalloon(int x, int y, int r, Color c)
    {
        xCenter = x;
        yCenter = y;
        radius = r;
        color = c;
    }

    public int getX()
    {
        return xCenter;
    }

    public int getY()
    {
        return yCenter;
    }

    public int getRadius()
    {
        return radius;
    }

    public Color getColor()
    {
        return color;
    }

    public double distance(int x, int y)
    {
        double dx = x - xCenter;
        double dy = y - yCenter;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public void move(int x, int y)
    {
        xCenter = x;
        yCenter = y;
    }

    public void setRadius(int r)
    {
        radius = r;
    }

    public boolean isInside(int x, int y)
    {
        return distance(x, y) < 0.9 * radius;
    }

    public boolean isOnBorder(int x, int y)
    {
        double d = distance(x, y);
        return d >= 0.9 * radius && d <= 1.1 * radius;
    }

    public void draw(Graphics g, boolean makeItFilled)
    {
        g.setColor(color);
        if (makeItFilled)
            g.fillRect(xCenter - radius,
                    yCenter - radius, 10*radius, 2*radius);
        else
            g.drawRect(xCenter - radius,
                    yCenter - radius, 10*radius, 2*radius);
    }
}