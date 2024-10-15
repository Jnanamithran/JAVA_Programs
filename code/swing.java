import javax.swing.*;
import java.awt.event.*;

class SwingExample extends JFrame implements ActionListener {
    private JButton b;
    private JRadioButton r1, r2;
    
    public static void main(String[] args) {
        new SwingExample();
    }

    SwingExample() {
        JFrame f = new JFrame("Choose");
        
        // Initialize radio buttons
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        
        // Set bounds for radio buttons
        r1.setBounds(80, 50, 100, 30);
        r2.setBounds(80, 100, 100, 30);
        
        // Group the radio buttons so only one can be selected at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        // Initialize the button
        b = new JButton("Submit");
        b.setBounds(90, 150, 100, 30);
        
        // Add action listener for the button
        b.addActionListener(this);
        
        // Add components to the frame
        f.add(r1);
        f.add(r2);
        f.add(b);
        
        // Frame settings
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Action when the button is clicked
        if (e.getSource() == b) {
            if (r1.isSelected()) {
                JOptionPane.showMessageDialog(this, "Male selected");
            } else if (r2.isSelected()) {
                JOptionPane.showMessageDialog(this, "Female selected");
            } else {
                JOptionPane.showMessageDialog(this, "No selection made");
            }
        }
    }
}

