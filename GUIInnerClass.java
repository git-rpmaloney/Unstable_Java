import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;
class GUIInnerClass{
    public static void main(String XYZ[]){
    Frame Window = new Frame("DataPoint Connect");
    Button Add = new Button("Add");
    Button Subtract = new Button("Subtract");
    Button Multiply = new Button("Multiply");
    Button Divide = new Button("Divide");
    Label Answer = new Label();
    TextField Capture = new TextField(10);
    TextField Capture2 = new TextField(10);
    String CapturedData = "";
    
    Window.setLayout(new GridLayout(1,2));
    
        //ADD Button
    Subtract.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent J){
            System.out.println("You have selected the Subtraction Function:");
            int CapturedData = Integer.parseInt(Capture.getText());
            int CapturedData2 = Integer.parseInt(Capture2.getText());
            int result = CapturedData - CapturedData2;
            String prResult = Integer.toString(result);
            System.out.println(result);
            Capture.setText("");
            Capture2.setText("");
            Answer.setText(prResult);
        }
    }
    );
       //ADD Button End 

       //NEW Button
    Add.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent X){
                System.out.println("You have selected the Addition function:");
                int CapturedData = Integer.parseInt(Capture.getText());
                int CapturedData2 = Integer.parseInt(Capture2.getText());
                int result = CapturedData + CapturedData2;
                String prResult = Integer.toString(result);
                System.out.println(result);
                Capture.setText("");
                Capture2.setText("");
                Answer.setText(prResult);
            }
        }
    );

        //NEW Button End

        Multiply.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent X){
                    System.out.println("You have selected the Multiply function:");
                    int CapturedData = Integer.parseInt(Capture.getText());
                    int CapturedData2 = Integer.parseInt(Capture2.getText());
                    int result = CapturedData * CapturedData2;
                    String prResult = Integer.toString(result);
                    System.out.println(result);
                    Capture.setText("");
                    Capture2.setText("");
                    Answer.setText(prResult);
                }
            }
        );
    
        Divide.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent X){
                    System.out.println("You have selected the Divide function:");
                    int CapturedData = Integer.parseInt(Capture.getText());
                    int CapturedData2 = Integer.parseInt(Capture2.getText());
                    int result = CapturedData / CapturedData2;
                    String prResult = Integer.toString(result);
                    System.out.println(result);
                    Capture.setText("");
                    Capture2.setText("");
                    Answer.setText(prResult);
                }
            }
        );


    Window.add(Add);
    Window.add(Subtract);
    Window.add(Divide);
    Window.add(Multiply);
    Window.add(Capture);
    Window.add(Capture2);
    Window.add(Answer);
    Window.setSize(800,800);
    Window.setVisible(true);

    }
}