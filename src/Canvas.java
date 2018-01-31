
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;


public class Canvas extends JPanel {
    
    private ArrayList<MyRectangle> boxes;
    
    public Canvas(ArrayList<MyRectangle> boxes) {
        this.boxes = boxes;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        for (MyRectangle r: boxes) {
            r.render(g2);
        }
    }
    
}
