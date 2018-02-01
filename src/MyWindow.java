
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MyWindow extends JFrame {
    
    private Canvas canvas;
    private JRadioButton blueButton;
    private JRadioButton redButton;
    private JRadioButton smallButton;
    private JRadioButton bigButton;
    private ArrayList<MyRectangle> boxes = new ArrayList<>();
    
    public void configure() {
        Container contentPane = getContentPane();
        canvas = new Canvas(boxes);
        contentPane.add(canvas, BorderLayout.CENTER);
        canvas.addMouseListener(new MousePressListener());
        
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 1));
        contentPane.add(northPanel, BorderLayout.NORTH);
        
        JPanel colorPanel = new JPanel();
        JPanel sizePanel = new JPanel();
        northPanel.add(colorPanel);
        northPanel.add(sizePanel);
        
        blueButton = new JRadioButton("blue");
        blueButton.setSelected(true);
        redButton = new JRadioButton("red");
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(blueButton);
        colorGroup.add(redButton);
        
        colorPanel.add(blueButton);
        colorPanel.add(redButton);
        colorPanel.setBorder(new TitledBorder(new EtchedBorder(), "Color"));
        
        smallButton = new JRadioButton("small");
        smallButton.setSelected(true);
        bigButton = new JRadioButton("big");
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallButton);
        sizeGroup.add(bigButton);
        sizePanel.add(smallButton);
        sizePanel.add(bigButton);
        sizePanel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
        
        JPanel southPanel = new JPanel();
        contentPane.add(southPanel, BorderLayout.SOUTH);
        JButton clearButton = new JButton("Clear");
        southPanel.add(clearButton);
        clearButton.addActionListener(event -> {
            boxes.clear();
            canvas.repaint();
        }); 
    }
        
    
    private class MousePressListener extends MouseAdapter {
        
        @Override
        public void mousePressed(MouseEvent e) {
            Color color = Color.BLUE;
            if (redButton.isSelected()) {
                color = Color.RED;
            }
            int size = MyRectangle.SMALL;
            if (bigButton.isSelected()) {
                size = MyRectangle.BIG;
            }
            boxes.add(new MyRectangle(e.getX(), e.getY(), size, color));
            canvas.repaint();
        }
        
    }
    
}
