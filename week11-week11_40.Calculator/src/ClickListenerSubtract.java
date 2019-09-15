import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ClickListenerSubtract implements ActionListener{
    private JTextField input;
    private JTextField output;
    private JButton z;
    
    public ClickListenerSubtract(JTextField input, JTextField output, JButton z){
        this.input = input;
        this.output = output;
        this.z = z;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int bufferOut = 0;
        int bufferIn = 0;
        
        try {
            bufferIn = Integer.parseInt(input.getText());
            bufferOut = Integer.parseInt(output.getText());

            bufferOut -= bufferIn;

            this.input.setText("");
            this.output.setText(""+bufferOut);

            if(Integer.parseInt(this.output.getText()) == 0){
                z.setEnabled(false);
            } else {
                z.setEnabled(true);
            }
        } catch(NumberFormatException nfe) {
            this.input.setText("");
        }
    }
}