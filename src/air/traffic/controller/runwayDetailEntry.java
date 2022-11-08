package air.traffic.controller;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class runwayDetailEntry extends JFrame implements ActionListener {


    JLabel runwayLabel,label6,label7,label8;
    JTextField text5,text6,text8;

    JComboBox box2;
    JButton addMoreRunway,submitRunway;
    runwayDetailEntry(){

        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

        setBounds(400,200,1000,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,500,600);
        p1.setLayout(null);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(211,211,211));
        p2.setBounds(500,0,500,600);
        p2.setLayout(null);
        add(p2);

        runwayLabel = new JLabel("RUNWAY DETAILS");
        runwayLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        runwayLabel.setBounds(100,10,350,50);
        runwayLabel.setBorder(border);
        runwayLabel.setFont(new Font("SAN_SERIF",Font.BOLD,30));
        p1.add(runwayLabel);

        label6 = new JLabel("EMERGENCY");
        label6.setBounds(20,90,200,20);
        label6.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(label6);

        text8 = new JTextField();
        text8.setBounds(250,90,200,20);
        text8.setBorder(border);
        text8.setText("false");
//        text1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text8);

        label7 = new JLabel("RUNWAY NUMBER");
        label7.setBounds(20,140,250,20);
        label7.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(label7);

        text5 = new JTextField();
        text5.setBounds(250,140,200,20);
        text5.setBorder(border);
//        text5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text5);

        label8 = new JLabel("DIRECTION");
        label8.setBounds(20,190,200,20);
        label8.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(label8);

        text6 = new JTextField();
        text6.setBounds(250,190,200,20);
        text6.setBorder(border);
//        text6.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text6);

        addMoreRunway = new JButton("ADD");
        addMoreRunway.setBounds(60,250,130,30);
        addMoreRunway.setBackground(new Color(211,211,211));
        addMoreRunway.setForeground(Color.BLACK);
//        addMorePlane.setBorder(BorderFactory.createEmptyBorder());
        addMoreRunway.addActionListener(this);
        p1.add(addMoreRunway);

        submitRunway = new JButton("SUBMIT");
        submitRunway.setBounds(250,250,130,30);
        submitRunway.setBackground(new Color(211,211,211));
        submitRunway.setForeground(Color.BLACK);
//        addMorePlane.setBorder(BorderFactory.createEmptyBorder());
        submitRunway.addActionListener(this);
        p1.add(submitRunway);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {

        boolean emergencyRunway = false;
        int runwayNumber;
        String direction;


        emergencyRunway =Boolean.parseBoolean( text8.getText());


//             System.out.println(emergencyFactor);

        runwayNumber = Integer.parseInt(text5.getText());
//            System.out.println(currFuel);

        direction  = ((text6.getText()));
//            System.out.println(currHeight);





        if(ae.getSource() == addMoreRunway){

            new runway(emergencyRunway,runwayNumber,direction);
            this.setVisible(false);
            new runwayDetailEntry();
        }

        else if(ae.getSource() == submitRunway){
            new runway(emergencyRunway,runwayNumber,direction);
            this.setVisible(false);

        }

    }


    public static void main(String []  args){
        new runwayDetailEntry();
    }
}
