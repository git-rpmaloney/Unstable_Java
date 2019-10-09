import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
class singleEventHandlerGUI implements ActionListener{
    TextField scr;
    // Label error;
    public singleEventHandlerGUI(TextField T1){
        scr = T1;
        // txt2 = T2;
        // txt3 = T3;
        // error = Err;
    }
    public void actionPerformed(ActionEvent AE){
        int A, B, C;
        C = 0;
        Button Btn;
        Btn=(Button)AE.getSource();
        String Sign = Btn.getLabel();
        try{
        A = Integer.parseInt(scr.getText());
        B = Integer.parseInt(scr.getText());
        
                if(Sign.equals("+")){
                    C = A + B;
                }
                if(Sign.equals("-")){
                    C = A - B;
                }
                if(Sign.equals("x")){
                    C = A*B;
                }
                if(Sign.equals("/")){
                    C = A / B;
                }
                // error.setText(null);
                scr.setText(Integer.toString(C));
        }
            catch(NumberFormatException Err){
            scr.setText("INVALID CHARACTER");
            // error.setText("Invalid Character Entered!");
            // System.out.println("Exception Thrown: [Invalid Digits Entered into Inputs]");
            //     Frame F2 = new Frame();
            //     Label errorlabel = new Label("YOU HAVE FAILED TO ENTER A VALUE WHICH MEETS THE CONSTRAINTS");
            //     F2.add(errorlabel);
            //     FlowLayout Flow2 = new FlowLayout();
            //     F2.setLayout(Flow2);


            }   
    }
}