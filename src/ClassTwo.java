import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassTwo extends JFrame { // inherits JFrame properties

    private JLabel ITEM;
    private JTextField PAPER1;
    private JTextField PAPER2;
    private JTextField PAPER3;
    private JPasswordField ASTERISK;

    ClassTwo(){ // Constructor

        //String FirstNum = JOptionPane.showInputDialog("Enter first number");
        //int First = Integer.parseInt(FirstNum); // Convert user input to int
        //JOptionPane.showMessageDialog(null, "The output is " + First);

        super("Data"); // Title of window
        setLayout(new FlowLayout()); // Sets default layout

        //String FirstNum = JOptionPane.showInputDialog("Enter some words"); // window for entering input and store it

        ITEM = new JLabel("This is my GUI"); // Title
        PAPER1 = new JTextField(10);
        PAPER2 = new JTextField("Enter text here");
        PAPER3 = new JTextField(10);
        ASTERISK = new JPasswordField(10); // password box

    // ADDS ITEMS TO JFRAME
        add(ITEM);
        add(PAPER1);
        add(PAPER2);
        add(PAPER3);
        add(ASTERISK);

        thehandler handler = new thehandler(); // object refers to class below
        PAPER1.addActionListener(handler);
        PAPER2.addActionListener(handler);
        PAPER3.addActionListener(handler);
        ASTERISK.addActionListener(handler);

    }
    private class thehandler implements ActionListener{ //event handling class

        public void actionPerformed(ActionEvent event){ // Code triggered when button pressed
            String text = "";
            if (event.getSource() == PAPER1){
                text=String.format("field 1: %s", event.getActionCommand()); // puts what is entered in designated area on display
            }
            else if (event.getSource() == PAPER2){
                text=String.format("field 1: %s", event.getActionCommand());
            }
            else if (event.getSource() == PAPER3){
                text=String.format("field 1: %s", event.getActionCommand());
            }
            else if (event.getSource() == ASTERISK){
                text=String.format("field 1: %s", event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, text); // prints output to popup

        } // END OF METHOD

    }//end of class

}
