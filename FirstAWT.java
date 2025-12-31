
import java.awt.*;

public class FirstAWT{
    public static void main(String args[]){
        Frame f = new Frame("My First AWT Frame");
        Button b = new Button("Click Me");
        b.setBounds(50,100,80,30);
        f.add(b);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);


    }
}