import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class Calculator0 extends Frame {
    
    Calculator0() {

        // * Input Area
        TextField t = new TextField();
        t.setBounds(20, 40, 260, 70); // (x, y, width, height)
        add(t);

        // * Equals Button
        Button calculate = new Button("=");
        calculate.setBounds(125, 225, 50, 50);
        // ! Calculation
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = t.getText();
                int res = calculateResult(input);
                t.setText(String.valueOf(res));
            }
        });
        add(calculate);

        // * Layout
        setSize(300, 500);
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

    public static void main(String[] args) {
        
        Calculator0 c = new Calculator0();

    }

}
