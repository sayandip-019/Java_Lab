import java.awt.*;
import java.awt.event.*;

public class TextAWT extends Frame {

    TextAWT() {
        setTitle("AWT Text Display");
        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Hello from AWT", 100, 150);
    }

    public static void main(String[] args) {
        new TextAWT();
    }
}