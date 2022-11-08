package air.traffic.controller;

import javax.swing.*;
import java.awt.*;

public class trainee extends JFrame {

    JLabel runwayLabel,detailsLabel;
    JTextField t1,t2;
    JButton addMore , submit;
    trainee(){

        setBounds(400,200,1000,800);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,500,800);
        p1.setLayout(null);
        add(p1);

        detailsLabel = new JLabel("FLIGHT DETAILS");
        detailsLabel.setBounds(150,10,200,20);
        detailsLabel.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(detailsLabel);








        JPanel p2 = new JPanel();
        p2.setBackground(new Color(211,211,211));
        p2.setBounds(500,0,500,800);
        p2.setLayout(null);
        add(p2);

        runwayLabel = new JLabel("RUNWAY DETAILS");
        runwayLabel.setBounds(150,10,200,20);
        runwayLabel.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p2.add(runwayLabel);








        setVisible(true);
    }



    public static void main(String []  args){
        new trainee();
    }
}
