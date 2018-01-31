
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MyWindow extends JFrame {
    
    private JRadioButton blueButton;
    private JRadioButton redButton;
    private JRadioButton smallButton;
    private JRadioButton bigButton;
    private ArrayList<MyRectangle> boxes = new ArrayList<>();
    
    public void configure() {
        Container contentPane = getContentPane();
        Canvas canvas = new Canvas(boxes);
        contentPane.add(canvas, BorderLayout.CENTER);
        
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 1));
        contentPane.add(northPanel, BorderLayout.NORTH);
        
        JPanel colorPanel = new JPanel();
        JPanel sizePanel = new JPanel();
        northPanel.add(colorPanel);
        northPanel.add(sizePanel);
        
        blueButton = new JRadioButton("blue");
        redButton = new JRadioButton("red");
        colorPanel.add(blueButton);
        colorPanel.add(redButton);
        colorPanel.setBorder(new TitledBorder(new EtchedBorder(), "Color"));
        
        smallButton = new JRadioButton("small");
        bigButton = new JRadioButton("big");
        sizePanel.add(smallButton);
        sizePanel.add(bigButton);
        sizePanel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
        
    }
    
}
