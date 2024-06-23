import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    // ActionListener is added to handle button click events

    // Instance Variables - stores components of calculator
    private TextField textField;
    private Button[] numberButtons;
    private Button[] operationButtons;
    private Button equalsButton;
    private Button clearButton;
    private double num1, num2, result;
    private char operation;

    // Constructor initializes the GUI
    public SimpleCalculator() {
        // Set the properties of the calculator
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());
        
        // Calculator Display
        textField = new TextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // A 4 x 4 Panel for buttons
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Handle clicks on each button
        numberButtons = new Button[10];
        // Create Number Buttons from 0 to 9
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            // Adds actionListener on each button
            // 'this' means that the event is handled by our class itself
            numberButtons[i].addActionListener(this);
            // Add button to panel
            buttonPanel.add(numberButtons[i]);
        }
        // Create other buttons and do the same to them
        operationButtons = new Button[4];
        operationButtons[0] = new Button("+");
        operationButtons[1] = new Button("-");
        operationButtons[2] = new Button("*");
        operationButtons[3] = new Button("/");
        for (int i = 0; i < 4; i++) {
            operationButtons[i].addActionListener(this);
            buttonPanel.add(operationButtons[i]);
        }
        
        equalsButton = new Button("=");
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);
        
        clearButton = new Button("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        // Add the buttonpanel to the center, using the BorderLayout layout manager
        // BorderLayout divides the container into 5 regions:
        // North, South, East, West, Center
        add(buttonPanel, BorderLayout.CENTER);

        // Handle window closing event
        addWindowListener(new WindowAdapter() {
            // This causes the program to stop execution (EXIT) when 'X' is pressed
            // By default the window closing action is HIDE
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        // Display everything created before
        setVisible(true);
    }

    // Method called whenever a button is clicked
    public void actionPerformed(ActionEvent ae) {
        // Retrieve the data from the event
        String command = ae.getActionCommand();
        // Identify the button and perform the operation
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            // Insert the number entered
            textField.setText(textField.getText() + command);
        } else if (command.charAt(0) == 'C') {
            // Clear the textfield
            textField.setText("");
        } else if (command.charAt(0) == '=') {
            // Perform the operation
            num2 = Double.parseDouble(textField.getText());
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textField.setText("Cannot divide by zero");
                    }
                    break;
            }
            // Display the answer
            textField.setText(String.valueOf(result));
        } else {
            // If an operation button is pressed
            // Store the number and operation, clear the field
            num1 = Double.parseDouble(textField.getText());
            operation = command.charAt(0);
            textField.setText("");
        }
    }
    public static void main(String[] args) {
        // Initialization
        new SimpleCalculator();
    }

}   
