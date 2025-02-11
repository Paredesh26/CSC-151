
package ai_testing;
import javax.swing.*;
import java.awt.*;

public class AI_Testing {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("Custom JDialog with Colors");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a button to trigger the custom dialog
        JButton showDialogButton = new JButton("Show Custom JDialog");
        showDialogButton.setBounds(100, 100, 200, 40);
        showDialogButton.setBackground(Color.LIGHT_GRAY); // Button background color
        showDialogButton.setForeground(Color.BLACK); // Button text color
        frame.add(showDialogButton);

        // Show the frame
        frame.setVisible(true);

        // Add action listener for the button
        showDialogButton.addActionListener(e -> {
            // Create a custom dialog (JDialog)
            JDialog dialog = new JDialog(frame, "Custom Dialog", true); // Modal dialog
            dialog.setSize(300, 200);
            dialog.setLayout(new BorderLayout());
            dialog.setLocationRelativeTo(frame);  // Center the dialog

            // Set the background color of the dialog
            dialog.getContentPane().setBackground(new Color(255, 182, 193)); // Light pink

            // Create a label with custom font and color
            JLabel label = new JLabel("Welcome to the Custom Dialog!", JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));
            label.setForeground(Color.BLUE); // Blue text color

            // Add the label to the dialog
            dialog.add(label, BorderLayout.CENTER);

            // Create an OK button with blue and white color
            JButton okButton = new JButton("OK");
            okButton.setBackground(Color.BLUE); // Button background color (blue)
            okButton.setForeground(Color.WHITE); // Button text color (white)
            okButton.addActionListener(ev -> dialog.dispose()); // Close the dialog when clicked
            dialog.add(okButton, BorderLayout.SOUTH);

            // Show the custom dialog
            dialog.setVisible(true);
        });
    }
}
