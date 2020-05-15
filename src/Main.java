import javax.swing.*;

public class Main {

    public static void main(String [] args) {

        ClassTwo F = new ClassTwo(); // Call constructor
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allows Frame to close correctly
        F.setSize(500, 250); // Sets JFrame size
        F.setVisible(true); // Makes JFrame visible

    }
}
