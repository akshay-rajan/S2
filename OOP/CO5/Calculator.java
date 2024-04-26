import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class Calculator extends Frame {
    
    Calculator() {

        // Display
        TextField t = new TextField();
        t.setBounds(20, 40, 240, 70); // (x, y, width, height)
        add(t);

        // Plus button
        Button plus = new Button("+");
        plus.setBounds(t.getLocation().x, t.getLocation().y + t.getSize().height + 10, 50, 50);
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("+", t);
            }
        });
        add(plus);

        // Minus button
        Button minus = new Button("-");
        minus.setBounds(plus.getLocation().x + 60, plus.getLocation().y, 50, 50);
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("-", t);
            }
        });
        add(minus);

        // Multiplication button
        Button multiply = new Button("*");
        multiply.setBounds(minus.getLocation().x + 60, minus.getLocation().y, 50, 50);
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("*", t);
            }
        });
        add(multiply);

        // Division button
        Button divide = new Button("/");
        divide.setBounds(multiply.getLocation().x + 60, multiply.getLocation().y, 50, 50);
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("/", t);
            }
        });
        add(divide);

        // Clear button
        Button clear = new Button("C");
        clear.setBounds(20, plus.getLocation().y + 60, 115, 50);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText("");
                t.requestFocus();
            }
        });
        add(clear);

        // Equals Button
        Button calculate = new Button("=");
        calculate.setBounds(140, plus.getLocation().y + 60, 115, 50);
        // ! Calculation
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = t.getText();
                int res = calculateResult(input);
                t.setText(String.valueOf(res));
                t.requestFocus();
            }
        });
        add(calculate);

        // * Layout
        setSize(280, 400);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);

    }

    // ! Perform the Calculation
    static int calculateResult(String input) {
        // Match [digit][space][op][space][digit]
        Pattern pattern = Pattern.compile("(\\d+)\\s*([+\\-*/])\\s*(\\d+)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            int num1 = Integer.parseInt(matcher.group(1));
            String operator = matcher.group(2);
            int num2 = Integer.parseInt(matcher.group(3));

            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 == 0) return -1;
                    else return num1 / num2;
                default:
                    break;
            }
            System.out.println("Operator: " + operator);
        }
        return -1;
    }

    // * Update display when a key is pressed
    static void updateDisplay(String op, TextField t) {
        String newText = t.getText() + " " + op + " ";
        t.setText("");
        t.requestFocus();
        t.setText(newText);
    }

    public static void main(String[] args) {
        
        Calculator c = new Calculator();

    }

}
