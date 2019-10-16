import java.awt.*;
import java.awt.event.*;
class Form{
    Frame Window;
    Button Button1;
    TextField No1, No2, Result;
    public Form(){
        
        Window = new Frame();
        Button1 = new Button();
        No1 = new TextField();
        No2 = new TextField();
        Result = new TextField();
        Window.setLayout(new GridLayout(4,2));
        Window.add(new Label("First Number"));
        Window.add(No1);
        Window.add(new Label("Second Number"));
        Window.add(No2);
        Window.add(new Label("Result"));
        Window.add(Result);
        Window.add(Button1,NORTH);
        Window.setSize(400,400);

        Button1.addActionListener(
            new ActionListener(){
            public void actionPerformed(ActionEvent X){
                int Num1 = Integer.parseInt(No1.getText());
                int Num2 = Integer.parseInt(No2.getText());
                int Result1 = 0;
                String sign = Button1.getLabel();

                if(sign.equals("Add")){
                    Result1 = Num1+Num2;
                    String Resultpr = Integer.toString(Result1);
                    Result.setText(Resultpr);
                }
                else if(sign.equals("Subtract")){
                    Result1 = Num1-Num2;
                    String Resultpr = Integer.toString(Result1);
                    Result.setText(Resultpr);
                }
                else if(sign.equals("Divide")){
                    Result1 = Num1/Num2;
                    String Resultpr = Integer.toString(Result1);
                    Result.setText(Resultpr);
                }
                else if(sign.equals("Multiply")){
                    Result1 = Num1*Num2;
                    String Resultpr = Integer.toString(Result1);
                    Result.setText(Resultpr);
                }
                else{
                    Result.setText("Exception Parsed.");
                }
            }
        }
     );
 }



    }
