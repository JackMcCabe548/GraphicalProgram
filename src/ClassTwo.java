import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;


public class ClassTwo extends JFrame {// Inherits JFrame properties

// Variables
    private JLabel ITEM; // A title
    private JTextField PAPER1; // Box to enter text
    private JButton PRESS; // A  button
    private JPasswordField ASTERISK; // Text hidden by asterisks
    private JList List; // List on info

    private String [] RainBow = {"Red", "Blue", "Orange"};
    //private static Color [] colours = {Color.red, Color.BLUE, Color.orange};

    ClassTwo(){ // Constructor

        super("Data"); // Title of window
        setLayout(new FlowLayout()); // Sets default layout

    // INSTANTIATE COMPONENTS
        ITEM = new JLabel("This is my GUI"); // Title
        PAPER1 = new JTextField(10);
        PRESS = new JButton("PrEsS mE");
        ASTERISK = new JPasswordField(10); // password box

        List = new JList(RainBow);
        List.setVisibleRowCount(4);
        List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // GUI FONT
        PRESS.setFont(new Font("serif", Font.PLAIN, 14));
        ITEM.setFont(new Font("serif", Font.PLAIN, 14));

    // ADDS ITEMS TO JFRAME
        add(ITEM);
        add(PAPER1);
        add(PRESS);
        add(ASTERISK);
        add(List);

    // ADD LISTENER TO COMPONENTS
        thehandler handler = new thehandler(); // object refers to class below
        PAPER1.addActionListener(handler); // Listens for event
        PRESS.addActionListener(handler);
        ASTERISK.addActionListener(handler); // Listens for event

    }

    // CLASS FOR HANDLING OUTCOMES
    private class thehandler implements ActionListener{  //event handling class

        public void actionPerformed(ActionEvent event){ // Code triggered when button pressed
            String text = "";
            if (event.getSource() == PAPER1){
                text=String.format("You wrote: %s", event.getActionCommand()); // puts what is entered in designated area on display
            }
            else if (event.getSource() == ASTERISK){
                text=String.format("You wrote: %s", event.getActionCommand());
            }
            else if (event.getSource() == PRESS){
                text=String.format("Button pressed: %s", event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, text); // prints output to popup

        } // END OF METHOD

    }//end of class

}
