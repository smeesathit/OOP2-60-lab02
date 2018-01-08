
/**
 * Write a description of class RandomFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomFrame extends JFrame implements ActionListener
{
    // instance variables - replace the example below with your own
    private JLabel label;
    private JButton button;
    int randomInt;
    /**
     * Main method
     */

    public static void main(String[] args)
    {
        // initialise instance variables
        RandomFrame frame = new RandomFrame();
        frame.setVisible(true);
    } // End main method

    /**
     * Constructor for objects of class RandomFrame
     */
    public RandomFrame()
    {
        randomInt = 0;

        this.setSize(100, 200);
        this.setTitle("My Counter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();        
        contentPane.setLayout(new BorderLayout());

        label = new JLabel("0", SwingConstants.CENTER);
        label.setFont(new Font("serif", Font.PLAIN, 24));
        add(label, BorderLayout.CENTER);

        button = new JButton("Random");
        contentPane.add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    } // End constructor

    public void actionPerformed(ActionEvent event)
    {
        /** Generate 100 random integers in the range 0..99. */

        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(100);
        label.setText(Integer.toString(randomInt));
    } // End actionPerformed    
} // End class
