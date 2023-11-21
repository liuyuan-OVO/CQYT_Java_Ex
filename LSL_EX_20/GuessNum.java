package LSL_EX_20;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class GuessNum extends JFrame {
    private JTextField inputField;
    private JTextArea resultArea;
    private JButton submitButton;
    private JButton addRandomNumberButton;

    private int randomNumber;

    public GuessNum() {
        setTitle("猜数字游戏");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        addRandomNumberButton = new JButton("向新增数据库中新增一个（1——100）随机数");
        inputField = new JTextField(10);
        resultArea = new JTextArea(1, 10); // 修改文本框大小
        resultArea.setEditable(false);
        submitButton = new JButton("提交");


        add(addRandomNumberButton);
        add(new JLabel("我猜的新增的随机数字："));
        add(inputField);
        add(submitButton);
        add(new JLabel("比较的结果："));
        add(resultArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guessNumber = Integer.parseInt(inputField.getText());
                compareNumbers(guessNumber);
            }
        });

        addRandomNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRandomNumberToDatabase();
            }
        });

        setVisible(true);

        generateRandomNumber();
    }

    private void generateRandomNumber() {
        randomNumber = (int) (Math.random() * 100) + 1;
    }

    private void compareNumbers(int guessNumber) {
        if (guessNumber > randomNumber) {
            resultArea.setText("猜大了");
        } else if (guessNumber < randomNumber) {
            resultArea.setText("猜小了");
        } else {
            resultArea.setText("猜对了");
        }
    }

    private void addRandomNumberToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/guessnum";
            String user = "root";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, user, password);

            int newRandomNumber = (int) (Math.random() * 100) + 1;
            String query = "INSERT INTO test2 (randomnum) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, newRandomNumber);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "添加到数据库成功");
                randomNumber = newRandomNumber;
                compareNumbers(randomNumber);
            } else {
                JOptionPane.showMessageDialog(this, "添加到数据库失败");
            }

            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "添加到数据库异常");
        }
    }


}