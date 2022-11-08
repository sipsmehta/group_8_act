package air.traffic.controller;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chooseUserType extends JFrame implements ActionListener {

    JComboBox comboId;

    chooseUserType(){
        setBounds(600,200,400,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        comboId = new JComboBox(new String[] {"TRAINEE", "ATC STAFF"});
        comboId.setBounds(140,110,150,25);
        comboId.setBackground(Color.WHITE);
        comboId.addActionListener(this);
        add(comboId);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String str = (String) comboId.getSelectedItem();

        if(ae.getSource() == str){
            new trainee().setVisible(true);
        }
        else if(ae.getSource() == str){
            new atcStaff();
        }


    }


    public static void main(String [] args){
        new chooseUserType();
    }

}


