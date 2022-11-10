package air.traffic.controller;

import javafx.util.Pair;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class planeRunwayAllocate extends JFrame {

    JLabel detailsLabel,runwayLabel;
    JTextField text1,text2,text3,text4,text7;
    JTextField text5,text6,text8,text9,text10;

    JButton addMorePlane , submitPlane;

    java.util.List<aircraft> aircraftList=new ArrayList<aircraft>();
    List<runway> runwayList = new ArrayList<runway>();

    Queue<Pair<aircraft, runway>> q = new LinkedList();


    void addAircraft(boolean emergency,int planeNumber, int currFuel, double currHeight,int currSpeed)
    {
        aircraftList.add(new aircraft( emergency, planeNumber,  currFuel,  currHeight, currSpeed));
    }
    void addRunway(boolean emergencyRunway,int runwayNumber,String direction)
    {
        runwayList.add(new runway( emergencyRunway, runwayNumber,direction));
    }


    void fetchAircraftDetails()
    {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "dbusername", "dbpassword");
            Statement mystatement = con.createStatement();
            ResultSet rs=mystatement.executeQuery("select * from FlightDetails");
            while(rs.next())
            {
//                System.out.println(codespeedy.getString("username")+"  "+codespeedy.getString("password")+"  "+codespeedy.getString("name")+" "+codespeedy.getString("email")+" "+codespeedy.getString("country")+" "+codespeedy.getString("age")+" "+codespeedy.getString("sex"));
//                boolean ef;
//
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    void emergencyLanding()
    {
        //trying to land emergency plane on emergency runway
        for (int i = 0; i < aircraftList.size(); i++) {
            if(aircraftList.get(i).needEmergencyLanding() && (aircraftList.get(i).hasLanded()==false))
            {
                for (int j = 0; j < runwayList.size(); j++) {
                    if(runwayList.get(j).forEmergency() && (runwayList.get(j).isOccupied()==false))
                    {
                        q.add(new Pair<>(aircraftList.get(i), runwayList.get(j)));
                        runwayList.get(j).setOccupancy(true);
                        aircraftList.get(i).setLanded();
                    }
                }
            }
        }

        //checking if emergency is not available trying landing on regular runway
        for (int i = 0; i < aircraftList.size(); i++) {
            if(aircraftList.get(i).needEmergencyLanding())
            {
                for (int j = 0; j < runwayList.size(); j++) {
                    if(runwayList.get(j).isOccupied()==false && (aircraftList.get(i).hasLanded()==false))
                    {
                        q.add(new Pair<>(aircraftList.get(i), runwayList.get(j)));
                        runwayList.get(j).setOccupancy(true);
                        aircraftList.get(i).setLanded();
                    }
                }
            }
        }
    }


    //helper function of regularLanding to provide minimum fuel in an aircraft
    int getMinimumFuel()
    {
        int mi = Integer.MAX_VALUE;
        for (int i = 0; i < aircraftList.size(); i++)
        {
            if(aircraftList.get(i).fuelCapacity()<mi && (aircraftList.get(i).hasLanded()==false))
            {
                mi = aircraftList.get(i).fuelCapacity();
            }
        }
        return mi;
    }
    void regularLanding()
    {

        for (int i = 0; i < aircraftList.size(); i++)
        {
            int mi = getMinimumFuel();
            if(aircraftList.get(i).fuelCapacity()==mi && (aircraftList.get(i).hasLanded()==false))
            {
                for (int j = 0; j < runwayList.size(); j++) {
                    if(runwayList.get(j).isOccupied()==false && (aircraftList.get(i).hasLanded()==false))
                    {
                        q.add(new Pair<>(aircraftList.get(i), runwayList.get(j)));
                        runwayList.get(j).setOccupancy(true);
                        aircraftList.get(i).setLanded();
                    }
                }
            }
        }
    }
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
        planeRunwayAllocate allocate = new planeRunwayAllocate();
        allocate.emergencyLanding();
        allocate.regularLanding();
    }
}
