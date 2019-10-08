import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
class WindowsXP{
    public static void main(String XYZ[]){
        Button btn1 = new Button("Log In");
                LoginButtonAction LogIn = new LoginButtonAction();
                btn1.addActionListener(LogIn);
        Button btn2 = new Button("Capture Settings");
                CaptureSettingsButton Capture = new CaptureSettingsButton();
                btn2.addActionListener(Capture);
        Button btn3 = new Button("EMERGENCY BORROWING");
                EmergencyBorButton EmBut = new EmergencyBorButton();
                btn3.addActionListener(EmBut);
        Frame F = new Frame("NationwideNow");
        F.add(btn1, BorderLayout.NORTH);
        F.add(btn2, BorderLayout.SOUTH);
        F.add(btn3, BorderLayout.CENTER);
        F.setVisible(true);
        F.setSize(400,400);
    }
}