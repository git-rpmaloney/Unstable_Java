import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
class multiplyEventHandler implements ActionListener{
    TextField txt1, txt2, txt3;
    Label error; 
    public multiplyEventHandler(TextField T1, TextField T2, TextField T3, Label E){
    txt1 = T1; 
    txt2 = T2;
    txt3 = T3;
    E = error; 
    }
    public void actionPerformed(ActionEvent E){
        int No1, No2, Result; 
        try{
            Result = Integer.parseInt(txt1.getText()) * Integer.parseInt(txt2.getText());
            txt3.setText(Integer.toString(Result));
            }
        catch(NumberFormatException Error1){
            error.setText("***DIGITS ONLY***");
        }
    }
}