import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25,25,80,30);
    }
}
