package gui;

import constants.CommonConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginGUI extends JFrame {
    public LoginGUI (){
        super(CommonConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);
        
        addGUIComponents();
    }

    public void addGUIComponents(){
        SpringLayout springLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(springLayout);

        // username
        JLabel usernameLabel = new JLabel(" Username:");
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));


        JTextField usernameField = new JTextField(CommonConstants.TEXTFIELD_SIZE);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 18));
        
        
        springLayout.putConstraint(SpringLayout.WEST, usernameLabel, 35, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameLabel, 85, SpringLayout.NORTH, loginPanel);

        springLayout.putConstraint(SpringLayout.WEST, usernameField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameField, 85, SpringLayout.NORTH, loginPanel);
        
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        // password
        JLabel passwordLabel = new JLabel(" Password");
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JTextField passwordField = new JTextField(CommonConstants.TEXTFIELD_SIZE);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));

        springLayout.putConstraint(SpringLayout.WEST, passwordLabel, 35, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordLabel, 135, SpringLayout.NORTH, loginPanel);

        springLayout.putConstraint(SpringLayout.WEST, passwordField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordField, 135, SpringLayout.NORTH, loginPanel);


        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        // login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Dialog", Font.BOLD, 18));
        
        springLayout.putConstraint(SpringLayout.WEST, loginButton, 155, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, loginButton, 185, SpringLayout.NORTH, loginPanel);
    

        loginButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (username.equals("username") && password.equals("password")){
                    JOptionPane.showMessageDialog(loginPanel, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(loginPanel, "Login Failed!");
                }
            }
        });

        loginPanel.add(loginButton);
        this.getContentPane().add(loginPanel);
    }
}
