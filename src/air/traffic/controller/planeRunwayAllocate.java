package air.traffic.controller;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class planeRunwayAllocate extends JFrame {

    JLabel detailsLabel,runwayLabel;
    JTextField text1,text2,text3,text4,text7;
    JTextField text5,text6,text8,text9,text10;

    JButton addMorePlane , submitPlane;

    planeRunwayAllocate(){
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

        setBounds(400,200,1000,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,500,600);
        p1.setLayout(null);
        add(p1);

        detailsLabel = new JLabel("PLANES IN QUEUE");
        detailsLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        detailsLabel.setBounds(240,10,200,50);
        detailsLabel.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        p1.add(detailsLabel);


        text7 = new JTextField();
        text7.setBounds(240,90,200,20);
        text7.setBorder(border);
//        text7.setText("false");
//        text1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text7);


        text1 = new JTextField();
        text1.setBounds(240,140,200,20);
        text1.setBorder(border);
//        text1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text1);


        text2 = new JTextField();
        text2.setBounds(240,190,200,20);
        text2.setBorder(border);
//        text2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text2);

        text3 = new JTextField();
        text3.setBounds(240,240,200,20);
        text3.setBorder(border);
//        text3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text3);


        text4 = new JTextField();
        text4.setBounds(240,290,200,20);
        text4.setBorder(border);
//        text4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text4);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(211,211,211));
        p2.setBounds(500,0,500,600);
        p2.setLayout(null);
        add(p2);


        runwayLabel = new JLabel("RUNWAY ALLOCATED");
        runwayLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        runwayLabel.setForeground(new Color(0,0,0));
        runwayLabel.setBounds(60,10,230,50);
        runwayLabel.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        p2.add(runwayLabel);
        setVisible(true);

        text5 = new JTextField();
        text5.setBounds(60,90,200,20);
        text5.setBorder(border);
//        text7.setText("false");
//        text1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(text5);


        text6 = new JTextField();
        text6.setBounds(60,140,200,20);
        text6.setBorder(border);
//        text1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(text6);


        text8 = new JTextField();
        text8.setBounds(60,190,200,20);
        text8.setBorder(border);
//        text2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(text8);

        text9 = new JTextField();
        text9.setBounds(60,240,200,20);
        text9.setBorder(border);
//        text3.setBorder(BorderFactory.createEmptyBorder());
        p2.add(text9);


        text10 = new JTextField();
        text10.setBounds(60,290,200,20);
        text10.setBorder(border);
//        text4.setBorder(BorderFactory.createEmptyBorder());
        p2.add(text10);
    }


    public static void main(String [] args){
        new planeRunwayAllocate().setVisible(true);
    }
}
