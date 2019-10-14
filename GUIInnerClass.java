import java.awt.*;
import java.awt.event.*;
class GUIInnerClass{
    public static void main(String XYZ[]){
    Frame Window = new Frame("DataPoint Connect");
    Button Add = new Button("Add");
    Button New = new Button("New");
    Window.setLayout(new GridLayout(1,2));
    
        //ADD Button
    Add.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent J){
            System.out.println("Button Add is Added Button Button Added");
        }
    }
    );
       //ADD Button End 

       //NEW Button
    New.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent X){
                System.out.println("Button New is New Button Button New");
            }
        }
    );

        //NEW Button End


    Window.add(Add);
    Window.add(New);
    Window.setSize(100,100);
    Window.setVisible(true);

    }
}