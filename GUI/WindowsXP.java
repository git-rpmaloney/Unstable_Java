import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
class WindowsXP{
    public static void main(String XYZ[]){
        Button btn1 = new Button("Log In");
                LoginButtonAction LogIn = new LoginButtonAction();
                btn1.addActionListener(LogIn);
        Button btn2 = new Button("Capture Settings");
        Frame F = new Frame("Nationwide|");
        F.add(btn1, BorderLayout.NORTH);
        F.add(btn2, BorderLayout.SOUTH);
        F.setVisible(true);
        F.setSize(400,400);
    }
}