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
        setTitle("��������Ϸ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        addRandomNumberButton = new JButton("���������ݿ�������һ����1����100�������");
        inputField = new JTextField(10);
        resultArea = new JTextArea(1, 10); // �޸��ı����С
        resultArea.setEditable(false);
        submitButton = new JButton("�ύ");


        add(addRandomNumberButton);
        add(new JLabel("�Ҳµ�������������֣�"));
        add(inputField);
        add(submitButton);
        add(new JLabel("�ȽϵĽ����"));
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
            resultArea.setText("�´���");
        } else if (guessNumber < randomNumber) {
            resultArea.setText("��С��");
        } else {
            resultArea.setText("�¶���");
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
                JOptionPane.showMessageDialog(this, "��ӵ����ݿ�ɹ�");
                randomNumber = newRandomNumber;
                compareNumbers(randomNumber);
            } else {
                JOptionPane.showMessageDialog(this, "��ӵ����ݿ�ʧ��");
            }

            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "��ӵ����ݿ��쳣");
        }
    }


}