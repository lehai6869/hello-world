package kcsj;
//
/* 样例来源，GUI问题，
 * https://www.cnblogs.com/zhanzhuang/p/9993673.html
 * 中文乱码问题：setting-》Editor》File Encoding 》 Globals encoding ==》GBK
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class JFrameTest {

    private JFrame frame;
    private JPasswordField passwordField;
    private boolean isLogin = false;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrameTest window = new JFrameTest();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public JFrameTest() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        String userName = "111";
        String userPwd = "111";

        frame = new JFrame();
        frame.setBounds(100, 100, 667, 453);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        Label label = new Label("账号：");
        label.setAlignment(Label.CENTER);
        label.setBounds(116, 49, 50, 23);
        frame.getContentPane().add(label);

        Label label_1 = new Label("密码：");
        label_1.setAlignment(Label.CENTER);
        label_1.setBounds(116, 85, 50, 23);
        frame.getContentPane().add(label_1);

        Label label_2 = new Label("用户状态：");
        label_2.setBounds(433, 49, 60, 23);
        frame.getContentPane().add(label_2);

        Label label_3 = new Label("未登录");
        label_3.setForeground(new Color(255, 0, 0));
        label_3.setBounds(499, 49, 40, 23);
        frame.getContentPane().add(label_3);

        JFormattedTextField formattedTextField = new JFormattedTextField();
        formattedTextField.setBounds(172, 49, 166, 23);
        frame.getContentPane().add(formattedTextField);

        passwordField = new JPasswordField();
        passwordField.setBounds(172, 85, 166, 23);
        frame.getContentPane().add(passwordField);

        JButton button = new JButton("login");
        button.setBackground(new Color(255, 255, 255));
        button.setBounds(126, 121, 212, 23);
        frame.getContentPane().add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getUserName = formattedTextField.getText();
                String getUserPwd = passwordField.getText();
                if (userName.equals(getUserName) && userPwd.equals(getUserPwd)) {
                    isLogin = true;
                } else {
                    isLogin = false;
                }
                if (isLogin) {
                    JOptionPane.showMessageDialog(null, "登录成功!", "消息", JOptionPane.PLAIN_MESSAGE);
                    label_3.setText("已登录");
                    label_3.setForeground(Color.BLUE);
                } else {
                    JOptionPane.showMessageDialog(null, "登录失败!", "消息", JOptionPane.WARNING_MESSAGE);
                    label_3.setText("未登录");
                    label_3.setForeground(Color.RED);
                }
            }
        });
    }
}