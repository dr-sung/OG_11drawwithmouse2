
import javax.swing.JFrame;


public class Main {
    
    public static void main(String[] args) {
        
        MyWindow window = new MyWindow();
        window.configure();
        window.setSize(500, 500);
        window.setTitle("Draw with Mouse 2");
        window.setLocation(200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
}
