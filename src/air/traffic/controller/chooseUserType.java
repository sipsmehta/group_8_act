package air.traffic.controller;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chooseUserType extends JFrame implements ActionListener {

    JComboBox comboid;

    chooseUserType(){
        setBounds(600,200,400,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        comboid = new JComboBox(new String[] {"TRAINEE", "ATC STAFF"});
        comboid.setBounds(140,110,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid );

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

    }


    public static void main(String [] args){
        new chooseUserType();
    }

}


