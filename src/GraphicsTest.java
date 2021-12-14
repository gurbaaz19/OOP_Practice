import javax.swing.*;

public class GraphicsTest {
    public static void main(String args[]) {
        JFrame myFrame = new JFrame("This is a window");

//        JButton myButton = new JButton("Click Me");
//        myButton.setBounds(400, 300, 100, 40);
//
//        myFrame.add(myButton);

//        myFrame.setLayout(null);

        MyPanel m = new MyPanel();
        myFrame.add(m);

        myFrame.setSize(800, 600);
        myFrame.setVisible(true);
    }
}
