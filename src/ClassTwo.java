import javax.swing.*;

public class ClassTwo {

    ClassTwo(){
        String FirstNum = JOptionPane.showInputDialog("Enter first number");
        String SecondNum = JOptionPane.showInputDialog("Enter second Number");
        int First = Integer.parseInt(FirstNum); // Convert user input to int
        int Second = Integer.parseInt(SecondNum); // convert user intput to int
        int Total = First + Second;

        JOptionPane.showMessageDialog(null, "The output is " + Total);
    }

}
