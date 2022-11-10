package air.traffic.controller;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class planeDetailEntry extends JFrame implements ActionListener {
//    flightManager manager = new flightManager();
    JLabel detailsLabel,label1,label2,label3,label4,label5;
    JTextField text1,text2,text3,text4,text7;

    JButton addMorePlane , submitPlane;
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

        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        boolean emergencyFactor = false;
        int currHeight;
        int currFuel;
        int currSpeed;
        int planeNumber;

        emergencyFactor =Boolean.parseBoolean( text7.getText());


//             System.out.println(emergencyFactor);

        currFuel = Integer.parseInt(text1.getText());
//            System.out.println(currFuel);

        currHeight = Integer.parseInt((text2.getText()));
//            System.out.println(currHeight);

        currSpeed = Integer.parseInt(text3.getText());
//            System.out.println(currSpeed);

        planeNumber = Integer.parseInt((text4.getText()));
//            System.out.println(planeNumber);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/atc?characterEncoding=latin1&useConfigs=maxPerformance","root","root");//here atc is database name, root is username and password
            Statement stmt=con.createStatement();
            int ef;
            if(emergencyFactor)
                ef = 1;
            else
                ef = 0;
            String query = "insert into FlightDetails values ('"+ef+"','"+currFuel+"','"+currHeight+"','"+currSpeed+"','"+planeNumber+"')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Flight Details Added Successfully");
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }



        if (ae.getSource() == addMorePlane) {

//            new aircraft(emergencyFactor,planeNumber,currFuel,currHeight,currSpeed);

//            try{
//                Conn c = new Conn();
//                String query = "insert into FlightDetails values ('"+emergencyFactor+"','"+currFuel+"','"+currHeight+"','"+currSpeed+"','"+planeNumber+"')";
//                c.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null,"Flight Details Added Successfully");
//
//            } catch (Exception e){
//                e.printStackTrace();
//            }
            this.setVisible(false);
            new planeDetailEntry();

        }

        else if(ae.getSource() == submitPlane){


//            new aircraft(emergencyFactor,planeNumber,currFuel,currHeight,currSpeed);
            this.setVisible(false);
            new runwayDetailEntry().setVisible(true);
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
