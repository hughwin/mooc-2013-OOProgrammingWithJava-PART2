package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    UserInterface(Calculator calculator){
        this.calculator = new PersonalCalculator();
    }
    
    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        
        JLabel count = new JLabel("0");
        
        JButton increment = new JButton("Click!");
        ClickListener listener = new ClickListener(this.calculator, count);
        
        increment.addActionListener(listener);
        
        container.add(count);
        container.add(increment);
        
        
        
        
    }


}
