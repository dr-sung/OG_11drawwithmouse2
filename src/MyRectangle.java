
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


public class MyRectangle {
    
    private Color color;
    private int x;
    private int y;
    private int size;
    
    public void render(Graphics2D g) {
        g.setColor(color);
        g.draw(new Rectangle2D.Float(x, y, size, size));
    }
    
}
