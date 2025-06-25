import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame {

    private JTextField emailField;
    private JPasswordField passField;
    private JButton loginButton;
    private JButton showHideButton;
    private JLabel forgotPasswordLabel;
    private boolean passwordVisible = false;

    public LoginFrame() {
        initComponents();
    }

    private void initComponents() {
        // Frame settings
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setMinimumSize(new Dimension(400, 300));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(false); // Prevent window resizing

        // Background panel with gradient
        JPanel backgroundPanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(26, 188, 156), 0, getHeight(), new Color(41, 128, 185));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        // Title panel
        JPanel titlePanel = new JPanel(new GridLayout(2, 1));
        titlePanel.setOpaque(false);

        JLabel titleLabel = new JLabel("Login Form", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titleLabel.setForeground(Color.WHITE);

        JLabel subtitleLabel = new JLabel("Enter your credentials to login", SwingConstants.CENTER);
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        subtitleLabel.setForeground(Color.LIGHT_GRAY);

        titlePanel.add(titleLabel);
        titlePanel.add(subtitleLabel);
        backgroundPanel.add(titlePanel, BorderLayout.NORTH);

        // Form panel with padding and alignment
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Email label
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Email:", SwingConstants.RIGHT), gbc);

        // Email field
        gbc.gridx = 1;
        emailField = new JTextField(20);
        styleTextField(emailField);
        formPanel.add(emailField, gbc);

        // Password label
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Password:", SwingConstants.RIGHT), gbc);

        // Password field
        gbc.gridx = 1;
        passField = new JPasswordField(20);
        styleTextField(passField);
        formPanel.add(passField, gbc);

        // Show/Hide button
        gbc.gridx = 2;
        gbc.weightx = 0;
        showHideButton = new JButton("Show");
        styleButton(showHideButton);
        showHideButton.setFocusable(false);
        showHideButton.addActionListener(e -> togglePasswordVisibility());
        formPanel.add(showHideButton, gbc);

        // Forgot password label
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        forgotPasswordLabel = new JLabel("Forgot Password?");
        forgotPasswordLabel.setForeground(new Color(41, 128, 185));
        forgotPasswordLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        forgotPasswordLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        formPanel.add(forgotPasswordLabel, gbc);

        // Login button
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginButton = new JButton("Login");
        styleButton(loginButton);
        formPanel.add(loginButton, gbc);

        backgroundPanel.add(formPanel, BorderLayout.CENTER);
        add(backgroundPanel);

        passField.setEchoChar('•');
    }

    private void togglePasswordVisibility() {
        if (passwordVisible) {
            passField.setEchoChar('•');
            showHideButton.setText("Show");
        } else {
            passField.setEchoChar((char) 0);
            showHideButton.setText("Hide");
        }
        passwordVisible = !passwordVisible;
    }

    private void styleButton(JButton button) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        button.setBackground(new Color(26, 188, 156));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addHoverEffect(button);
    }

    private void styleTextField(JTextField textField) {
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        textField.setBackground(new Color(240, 240, 240));
        textField.setForeground(new Color(52, 73, 94));
        textField.setBorder(BorderFactory.createLineBorder(new Color(189, 195, 199)));
        textField.setCaretColor(new Color(26, 188, 156)); // Green caret color
    }

    private void addHoverEffect(JButton button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(21, 147, 128)); // Darker color on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(26, 188, 156)); // Original color
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
}
