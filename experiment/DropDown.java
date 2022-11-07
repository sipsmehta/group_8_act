import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropDown {
    public static void main(String[] args) {
        String[] optionsToChoose = {"Trainee", "ATC"};
        

        JFrame jFrame = new JFrame();

        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(80, 50, 140, 20);

        JButton jButton = new JButton("Done");
        jButton.setBounds(1000, 1000, 90, 20);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(90, 100, 400, 100);

        jFrame.add(jButton);
        jFrame.add(jComboBox);
        jFrame.add(jLabel);
        
        jFrame.setLayout(null);
        jFrame.setSize(400, 275);
        jFrame.setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFruit = "You selected " + jComboBox.getItemAt(jComboBox.getSelectedIndex());
                jLabel.setText(selectedFruit);
            }
        });

    }
}