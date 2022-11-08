package air.traffic.controller;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class planeDetailEntry extends JFrame implements ActionListener {





    JLabel runwayLabel,detailsLabel,label1,label2,label3,label4,label5,label6,label7,label8;
    JTextField text1,text2,text3,text4,text5,text6,text7;

    JComboBox box1,box2;
    JButton addMorePlane , submitPlane,addMoreRunway,submitRunway;
    planeDetailEntry(){

        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

        setBounds(400,200,1000,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,500,600);
        p1.setLayout(null);
        add(p1);

        detailsLabel = new JLabel("FLIGHT DETAILS");
        detailsLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        detailsLabel.setBounds(100,10,300,50);
        detailsLabel.setFont(new Font("SAN_SERIF",Font.BOLD,30));
        p1.add(detailsLabel);

        label1 = new JLabel("EMERGENCY");
        label1.setBounds(20,90,200,20);
        label1.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(label1);

        text7 = new JTextField();
        text7.setBounds(240,90,200,20);
        text7.setBorder(border);
        text7.setText("false");
//        text1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text7);

//        box1 = new JComboBox(new String[] {"NO", "YES"});
//        box1.setBounds(240,90,200,20);
//        box1.setBackground(Color.WHITE);
//        box1.setBorder(border);
////        box1.addActionListener(this);
//        p1.add(box1);


        label2 = new JLabel("FUEL LEFT");
        label2.setBounds(20,140,200,20);
        label2.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(label2);

        text1 = new JTextField();
        text1.setBounds(240,140,200,20);
        text1.setBorder(border);
//        text1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text1);

        label3 = new JLabel("CURRENT HEIGHT");
        label3.setBounds(20,190,200,20);
        label3.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(label3);

        text2 = new JTextField();
        text2.setBounds(240,190,200,20);
        text2.setBorder(border);
//        text2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text2);

        label4 = new JLabel("CURRENT SPEED");
        label4.setBounds(20,240,200,20);
        label4.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(label4);

        text3 = new JTextField();
        text3.setBounds(240,240,200,20);
        text3.setBorder(border);
//        text3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text3);

        label5 = new JLabel("PLANE NUMBER");
        label5.setBounds(20,290,200,20);
        label5.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        p1.add(label5);

        text4 = new JTextField();
        text4.setBounds(240,290,200,20);
        text4.setBorder(border);
//        text4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text4);

        addMorePlane = new JButton("ADD");
        addMorePlane.setBounds(60,400,130,30);
        addMorePlane.setBackground(new Color(211,211,211));
        addMorePlane.setForeground(Color.BLACK);
//        addMorePlane.setBorder(BorderFactory.createEmptyBorder());
        addMorePlane.addActionListener(this);
        p1.add(addMorePlane);

        submitPlane = new JButton("SUBMIT");
        submitPlane.setBounds(250,400,130,30);
        submitPlane.setBackground(new Color(211,211,211));
        submitPlane.setForeground(Color.BLACK);
//        addMorePlane.setBorder(BorderFactory.createEmptyBorder());
        submitPlane.addActionListener(this);
        p1.add(submitPlane);



        JPanel p2 = new JPanel();
        p2.setBackground(new Color(211,211,211));
        p2.setBounds(500,0,500,600);
        p2.setLayout(null);
        add(p2);

//        runwayLabel = new JLabel("RUNWAY DETAILS");
//        runwayLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
//        runwayLabel.setBounds(100,10,350,50);
//        runwayLabel.setBorder(border);
//        runwayLabel.setFont(new Font("SAN_SERIF",Font.BOLD,30));
//        p2.add(runwayLabel);
//
//        label6 = new JLabel("EMERGENCY");
//        label6.setBounds(20,90,200,20);
//        label6.setFont(new Font("SAN_SERIF",Font.BOLD,20));
//        p2.add(label6);
//
//        box2 = new JComboBox(new String[] {"NO", "YES"});
//        box2.setBounds(250,90,200,20);
//        box2.setBorder(border);
//        box2.setBackground(Color.WHITE);
////        box1.addActionListener(this);
//        p2.add(box2);
//
//        label7 = new JLabel("RUNWAY NUMBER");
//        label7.setBounds(20,140,250,20);
//        label7.setFont(new Font("SAN_SERIF",Font.BOLD,20));
//        p2.add(label7);
//
//        text5 = new JTextField();
//        text5.setBounds(250,140,200,20);
//        text5.setBorder(border);
////        text5.setBorder(BorderFactory.createEmptyBorder());
//        p2.add(text5);
//
//        label8 = new JLabel("DIRECTION");
//        label8.setBounds(20,190,200,20);
//        label8.setFont(new Font("SAN_SERIF",Font.BOLD,20));
//        p2.add(label8);
//
//        text6 = new JTextField();
//        text6.setBounds(250,190,200,20);
//        text6.setBorder(border);
////        text6.setBorder(BorderFactory.createEmptyBorder());
//        p2.add(text6);
//
//        addMoreRunway = new JButton("ADD");
//        addMoreRunway.setBounds(60,400,130,30);
//        addMoreRunway.setBackground(new Color(131,193,233));
//        addMoreRunway.setForeground(Color.WHITE);
////        addMorePlane.setBorder(BorderFactory.createEmptyBorder());
//        addMoreRunway.addActionListener(this);
//        p2.add(addMoreRunway);
//
//        submitRunway = new JButton("SUBMIT");
//        submitRunway.setBounds(250,400,130,30);
//        submitRunway.setBackground(new Color(131,193,233));
//        submitRunway.setForeground(Color.WHITE);
////        addMorePlane.setBorder(BorderFactory.createEmptyBorder());
//        submitRunway.addActionListener(this);
//        p2.add(submitRunway);

//        String emergency =(String) box1 .getSelectedItem();
//        System.out.println(emergency);
//
//        boolean emergencyFactor = false;
//        if(emergency == "YES"){
//            emergencyFactor = true;
//        }
//



        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        boolean emergencyFactor = false;
        int currHeight;
        int currFuel;
        int currSpeed;
        int planeNumber;

//        int runwayNumber;
//        String direction;

        if (ae.getSource() == addMorePlane) {
             emergencyFactor =Boolean.parseBoolean( text7.getText());


//             System.out.println(str);

            currFuel = Integer.parseInt(text1.getText());
//            System.out.println(currFuel);

            currHeight = Integer.parseInt((text2.getText()));
//            System.out.println(currHeight);

            currSpeed = Integer.parseInt(text3.getText());
//            System.out.println(currSpeed);

            planeNumber = Integer.parseInt((text4.getText()));
//            System.out.println(planeNumber);



        }

        else if(ae.getSource() == submitPlane){


        }

        else if(ae.getSource() == addMoreRunway){


        }

        else if(ae.getSource() == submitRunway){


        }

    }

    boolean emergencySetter(String str){
        if(str == "yes"|| str == "YES"){
            return true;
        }

        return false;


    }

    public static void main(String []  args){
        new planeDetailEntry();
    }
}
