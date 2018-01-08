
/**
 * Write a description of class MyCounter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCounter extends JFrame implements ActionListener
{
    // instance variables - replace the example below with your own
    private JLabel label;
    private JButton button;
    int counter;
    /**
     * Main method
     */

    public static void main(String[] args)
    {
        // initialise instance variables
        MyCounter frame = new MyCounter();
        frame.setVisible(true);
    } // End main method

    /**
     * Constructor for objects of class MyCounter
     */
    public MyCounter()
    {
        counter = 0;
        
        this.setSize(100, 200);
        this.setTitle("My Counter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();        
        contentPane.setLayout(new BorderLayout());

        label = new JLabel("0", SwingConstants.CENTER);
        label.setFont(new Font("serif", Font.PLAIN, 24));
        add(label, BorderLayout.CENTER);

        button = new JButton("Click");
        contentPane.add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    } // End constructor
    
    public void actionPerformed(ActionEvent event)
    {
        counter++;
        label.setText(Integer.toString(counter));
    } // End actionPerformed    
} // End class

/*
LayoutManager layout = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
contentPane.setLayout(layout);

label = new JLabel("0");
label.setAlignmentX(Component.CENTER_ALIGNMENT);
contentPane.add(label);
button = new JButton("Click");
button.setAlignmentX(Component.CENTER_ALIGNMENT);
contentPane.add(button);
 */
/*        LayoutManager layout = new BoxLayout(panel, BoxLayout.X_AXIS);
panel.setLayout(layout);

panel.add(new JLabel("a"));
panel.add(new JLabel("b"));
panel.add(new JLabel("c"));
panel.add(new JLabel("d"));
panel.add(new JLabel("e"));
panel.add(new JLabel("f"));

frame.add(panel);*/

