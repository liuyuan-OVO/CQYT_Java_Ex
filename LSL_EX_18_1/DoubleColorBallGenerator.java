package LSL_EX_18_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DoubleColorBallGenerator extends JFrame {
    private JTextArea resultArea;
    private JTextField inputField;
    private JButton generateButton;
    private JButton clearButton;

    public DoubleColorBallGenerator() {
        setTitle("双色球生成器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        JLabel inputLabel = new JLabel("请输入号码组数: ");
        inputPanel.add(inputLabel, BorderLayout.WEST);

        inputField = new JTextField();
        inputPanel.add(inputField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        generateButton = new JButton("生成");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int groupCount = Integer.parseInt(inputField.getText());
                generateDoubleColorBalls(groupCount);
            }
        });
        buttonPanel.add(generateButton);

        clearButton = new JButton("清除");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.setText("");
            }
        });
        buttonPanel.add(clearButton);

        inputPanel.add(buttonPanel, BorderLayout.EAST);

        add(inputPanel, BorderLayout.NORTH);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
    }

    private void generateDoubleColorBalls(int groupCount) {
        resultArea.setText("");
        Random random = new Random();
        for (int i = 0; i < groupCount; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("红球");
            for (int j = 0; j < 6; j++) {
                int number = random.nextInt(33) + 1;
                sb.append(number).append(" ");

            }
            int blueNumber = random.nextInt(16) + 1;
            sb.append("蓝球：").append(blueNumber);
            resultArea.append(sb.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DoubleColorBallGenerator();
            }
        });
    }
}