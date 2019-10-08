import java.awt.event.*;
import java.awt.TextField;
class TextBoxAction implements ActionListener{
    TextField txt;
    public TextBoxAction(TextField x){
        txt = x;
    }
    public void actionPerformed(ActionEvent E){
        txt.setText("Text Box Action Performed");
    }
}