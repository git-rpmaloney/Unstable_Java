import java.awt.event.*;
import java.awt.*;
class Controller{
    public static void main(String args[]){
        String connectionState = "Connected to Server";
        Frame OpsWindow = new Frame("DataPoint"+" "+"[STATUS: "+(connectionState)+"]");
        Button Add, Subtract, Multiply, Divide;
        Add = new Button("I want to Add");
        Subtract = new Button("I want to Subtract");
        Multiply = new Button("I want to Multiply");
        Divide = new Button("I want to Divide");
        OpsWindow.add(Add);
        OpsWindow.add(Subtract);
        OpsWindow.add(Divide);
        OpsWindow.add(Multiply);
        OpsWindow.setLayout(new GridLayout (4,4));
        OpsWindow.setSize(500,500);
        OpsWindow.setVisible(true);
        Form ops = new Form();
        Add.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent X){
                    ops.Window.setTitle("Addition");
                    ops.Button1.setLabel("Add");
                    ops.Window.setVisible(true);
                }
            }
        );
        Subtract.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent X){
                    ops.Window.setTitle("Subtract");
                    ops.Button1.setLabel("Subtract");
                    ops.Window.setVisible(true);
                }
            }
        );
        Multiply.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent X){
                    ops.Window.setTitle("Multiply");
                    ops.Button1.setLabel("Multiply");
                    ops.Window.setVisible(true);
                }
            }
        );
        Divide.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent X){
                    ops.Window.setTitle("Divide");
                    ops.Button1.setLabel("Divide");
                    ops.Window.setVisible(true);
                }
            }
        );
        
    }
}