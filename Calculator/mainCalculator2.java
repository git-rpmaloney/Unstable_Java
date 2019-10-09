import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;

class mainCalculator2{
    public static void main(String args[]){
        Frame F = new Frame("Nationwide's Super Duper Calculator Thing");
        TextField input1 = new TextField(10);
        TextField input2 = new TextField(10);
        TextField output1 =  new TextField(10);
        Label label1 = new Label("Input here:");
        Label label2 = new Label("Input here:");
        Label label3 = new Label("Result:");
        Label error = new Label();
        Button Addition = new Button("+");
        Button Subtraction = new Button("-");
        Button Multiplication = new Button ("x");
        Button Division = new Button("/");
        FlowLayout Flow = new FlowLayout();
        F.setLayout(Flow);
        singleEventHandler event = new singleEventHandler(input1, input2, output1, error);

        F.add(label1);
        F.add(input1);
        F.add(label2);
        F.add(input2);
        F.add(Addition);
        F.add(Subtraction);
        F.add(Multiplication);
        F.add(Division);
        F.add(label3);
        F.add(output1);
        F.add(error);
        F.setSize(400,400);
        F.setVisible(true);
        Addition.addActionListener(event);
        Multiplication.addActionListener(event);
        Subtraction.addActionListener(event);
        Division.addActionListener(event);
    }
}