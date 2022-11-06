import javax.swing.*;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class userTypeDropDownMenu {
    public static void main(String[] args) {

        GraphicsEnvironment graphics =
        GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        JFrame frame = new JFrame("Fullscreen");
        JPanel panel = new JPanel();
        // JLabel label = new JLabel("", JLabel.CENTER);
        // label.setText("This is in fullscreen mode!");
        // label.setOpaque(true);
        

        frame.add(panel);
        // frame.add(label);
        frame.setUndecorated(true);
        frame.setResizable(false);
        device.setFullScreenWindow(frame);
        
        String[] optionsToChoose = {"Trainee","ATC Controller"};
        String getUserType = (String) JOptionPane.showInputDialog(
                panel,
                "Choose Preferred Type to simulate",
                "Choose User Type",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[1]);

    
        System.out.println("Your chosen fruit: " + getUserType);
    }
}