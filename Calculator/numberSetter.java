import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
class numberSetter implements ActionListener{
    TextField scr;
    String NV2;
    // Label error;
    public numberSetter(TextField screen){
        scr = screen;
    }
    public void actionPerformed(ActionEvent AE){
        Button Btn;
        Btn=(Button)AE.getSource();
        String NV1 = Btn.getLabel();
        NV2=scr.getText();
        String Operator = "0";
        int ResultInt;
        String ResultPrint;
        if(NV2.equals("+")||NV2.equals("-")||NV2.equals("/")||NV2.equals("*")){
            scr.setText("");
        }
        else if(NV1.equals("=")){
            if(Operator.equals("+")){
                ResultInt = (Integer.parseInt(NV2)) + Integer.parseInt(scr.getText());
                ResultPrint = (Integer.toString(ResultInt));
                scr.setText(ResultPrint);
            }
        }
        else if(NV1.equals("+")){
            System.out.println(NV1);
            scr.setText("+");
            Operator = "+";
            System.out.println(NV2);
        }
        else if(NV1.equals("-")){
            scr.setText(null);
        }
        else if(NV1.equals("/")){
            scr.setText(null);
        }
        else if(NV1.equals("*")){
            scr.setText(null);
        }
        else{
        Integer.parseInt(NV1);
        scr.setText((scr.getText())+NV1);
        Integer.parseInt(NV2);
        System.out.println(NV2);
        }
    }
}
        
        
                // if(Sign.equals("+")){
                //     C = A + B;
                // }
                // if(Sign.equals("-")){
                //     C = A - B;
                // }
                // if(Sign.equals("x")){
                //     C = A*B;
                // }
                // if(Sign.equals("/")){
                //     C = A / B;
                // }
                // txt3.setText(Integer.toString(C));
        // }
            // catch(NumberFormatException Err){
            // txt3.setText("INVALID CHARACTER");
            // error.setText("Invalid Character Entered!");
            // System.out.println("Exception Thrown: [Invalid Digits Entered into Inputs]");
            //     Frame F2 = new Frame();
            //     Label errorlabel = new Label("YOU HAVE FAILED TO ENTER A VALUE WHICH MEETS THE CONSTRAINTS");
            //     F2.add(errorlabel);
            //     FlowLayout Flow2 = new FlowLayout();
            //     F2.setLayout(Flow2);
