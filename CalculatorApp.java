package LSL_EX_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class CalculatorApp extends JFrame implements ActionListener {
    private JTextField displayField;

    public CalculatorApp() {
        setTitle("¼òµ¥¼ÆËãÆ÷");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        displayField = new JTextField();
        displayField.setEditable(false);
        northPanel.add(displayField, BorderLayout.CENTER);
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        northPanel.add(clearButton, BorderLayout.EAST);
        add(northPanel, BorderLayout.NORTH);


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4, 3));

        String[] buttonLabels = {"9", "8", "7", "+", "6", "5", "4", "-", "3", "2", "1", "*", "0", ".", "=", "/"};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            centerPanel.add(button);
        }

        add(centerPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Clear")) {
            displayField.setText("");
        } else if (command.equals("=")) {
            String expression = displayField.getText();
            try {
                String postfixExpression = infixToPostfix(expression);
                double result = evaluatePostfixExpression(postfixExpression);
                displayField.setText(Double.toString(result));
            } catch (Exception ex) {
                displayField.setText("Error");
            }
        } else {
            displayField.setText(displayField.getText() + command);
        }
    }

    private int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    private String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    private double evaluatePostfixExpression(String expression) {
        Stack<Double> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                stack.push((double) (c - '0'));
            } else {
                double num2 = stack.pop();
                double num1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(num1 + num2);
                        break;
                    case '-':
                        stack.push(num1 - num2);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num1 / num2);
                        break;
                }
            }
        }
        return stack.pop();
    }
}