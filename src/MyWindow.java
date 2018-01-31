
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyWindow extends JFrame {
    
    public void configure() {
        Container contentPane = getContentPane();
        Canvas canvas = new Canvas();
        contentPane.add(canvas, BorderLayout.CENTER);
        
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 1));
        contentPane.add(northPanel, BorderLayout.NORTH);
        
        JPanel colorPanel = new JPanel();
        JPanel sizePanel = new JPanel();
        northPanel.add(colorPanel);
        northPanel.add(sizePanel);
        
        
    }
    
}
