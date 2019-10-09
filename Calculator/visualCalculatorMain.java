import java.awt.*;
class visualCalculatorMain{
    public static void main(String args[]){

        float Version = 1.0f;
        Frame F = new Frame("The Visual Calculator"+" V"+Version);
        GridLayout GR = new GridLayout(4,4);
        GridLayout GR2 = new GridLayout(4,1);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        p2.setLayout(GR);
        p3.setLayout(GR2);
        TextField screen = new TextField(10);
        numberSetter number = new numberSetter(screen);

        //* Label label1 = new Label("Input here:");
        //* Label label2 = new Label("Input here:");
        //* Label label3 = new Label("Result:");
        //* Label error = new Label();

        Button Addition = new Button("+");
        Button Subtraction = new Button("-");
        Button Multiplication = new Button ("x");
        Button Division = new Button("/");
        Button Clear = new Button("Clear");
        Button Equal = new Button("=");

        Button B0, B1, B2, B3, B4, B5, B6, B7, B8, B9;
        B0 = new Button("0");
        B1 = new Button("1");
        B2 = new Button("2");
        B3 = new Button("3");
        B4 = new Button("4");
        B5 = new Button("5");
        B6 = new Button("6");
        B7 = new Button("7");
        B8 = new Button("8");
        B9 = new Button("9");
        B0.addActionListener(number);
        B1.addActionListener(number);
        B2.addActionListener(number);
        B3.addActionListener(number);
        B4.addActionListener(number);
        B5.addActionListener(number);
        B6.addActionListener(number);
        B7.addActionListener(number);
        B8.addActionListener(number);
        B9.addActionListener(number);
        Addition.addActionListener(number);
        Equal.addActionListener(number);



        p1.add(screen);
       // p2.add(Addition);
        p2.add(B0);
        p2.add(B1);
        p2.add(B2);
        p2.add(B3);
        p2.add(B4);
        p2.add(B5);
        p2.add(B6);
        p2.add(B7);
        p2.add(B8);
        p2.add(B9);
        p3.add(Addition);
        p3.add(Subtraction);
        p3.add(Multiplication);
        p3.add(Division);
        p3.add(Equal);
        
        F.add(p1,BorderLayout.NORTH);
        F.add(p2, BorderLayout.CENTER);
        F.add(p3, BorderLayout.WEST);
        F.setSize(400,400);
        F.setVisible(true);

        singleEventHandlerGUI event = new singleEventHandlerGUI(screen);

       
       //  multiplyEventHandler Mult = new multiplyEventHandler(input1, input2, output1, error);

       

    }
}