import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Class representing a Swing Form
class SwingForm {

    // Member variables (components)
    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton button;

    // Default constructor
    public SwingForm() {
        frame = new JFrame("Swing Form");
        label = new JLabel("Enter Name:");
        textField = new JTextField(15);
        button = new JButton("Submit");

        System.out.println("Default constructor called.");
    }

    // Method to design GUI
    public void createGUI() {

        // Set layout
        frame.setLayout(new FlowLayout());

        // Add components
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Set size and visibility
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println("GUI Created.");
    }

    // Method for event handling
    public void addEvent() {

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello " + name);
            }
        });

        System.out.println("Event added.");
    }

    // Method to update text field
    public void updateText(String text) {
        textField.setText(text);
        System.out.println("Text updated.");
    }
}

// Main class to test Swing
public class Main {
    public static void main(String[] args) {

        // a) Creating object
        SwingForm form = new SwingForm();

        // b) Calling methods
        form.createGUI();
        form.addEvent();

        // c) Updating data
        form.updateText("Type your name here");
    }
}