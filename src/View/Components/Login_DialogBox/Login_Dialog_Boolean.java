package View.Components.Login_DialogBox;

import View.Components.SideMenu.EventMenuSelected;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class Login_Dialog_Boolean extends JDialog {
    private boolean loginSuccess = false;

    // Declare UI components
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JButton exitButton;

    public Login_Dialog_Boolean(JFrame parent, EventMenuSelected eventMenuSelected) {
        super(parent, "Login", true); // Use parent JFrame
        initializeComponents(); // Initialize UI components
        setLayout(new MigLayout("wrap 2", "[right][grow,fill]", "[][]20[]"));
        setSize(300, 200);
        this.setLocationRelativeTo(parent); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Add components to dialog
        add(new JLabel("Username:"));
        add(userField);
        add(new JLabel("Password:"));
        add(passField);
        add(loginButton, "span, split 2, center");
        add(exitButton);

        // Button actions
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            // Replace with actual validation logic
            if ("aaa".equals(username) && "1234".equals(password)) {
                loginSuccess = true; // Set login success
                dispose(); // Close the dialog
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials, try again!");
            }
        });

        exitButton.addActionListener(e -> {
            loginSuccess = false; // Set login as failed
            dispose(); // Close the dialog
        });
    }

    private void initializeComponents() {
        // Initialize UI components
        userField = new JTextField(20);
        passField = new JPasswordField(20);
        loginButton = new JButton("Login");
        exitButton = new JButton("Exit");
    }

    public boolean validateLogin() {
        return loginSuccess;
    }
}

