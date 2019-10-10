import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
class GUI{
    public static void main(String args[]){
        Frame frame = new Frame("My dad is a computer");
        frame.setVisible(true);
        frame.setSize(400,400);
        Label title = new Label("This label says things");
        frame.add(title, BorderLayout.CENTER);
    }

}