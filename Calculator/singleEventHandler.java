import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
class singleEventHandler implements ActionListener{
    TextField txt1, txt2, txt3;
    Label error;
    public singleEventHandler(TextField T1, TextField T2, TextField T3, Label Err){
        txt1 = T1;
        txt2 = T2;
        txt3 = T3;
        error = Err;
    }
    public void actionPerformed(ActionEvent AE){
        int A, B, C;
        C = 0;
        Button Btn;
        Btn=(Button)AE.getSource();
        String Sign = Btn.getLabel();
        try{
        A = Integer.parseInt(txt1.getText());
        B = Integer.parseInt(txt2.getText());
        
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
                error.setText(null);
                txt3.setText(Integer.toString(C));
        }
            catch(NumberFormatException Err){
            error.setText("Invalid Character Entered!");
            System.out.println("Exception Thrown: [Invalid Digits Entered into Inputs]");
            }   
    }
}