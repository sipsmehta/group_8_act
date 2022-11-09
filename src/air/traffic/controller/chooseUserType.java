package air.traffic.controller;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chooseUserType extends JFrame implements ActionListener {

    JComboBox comboId;

    JButton submit;


    chooseUserType(){
        setBounds(0,0,1900,800);
        setLayout(null);
        getContentPane().setBackground(Color.white);


        comboId = new JComboBox(new String[] {"TRAINEE", "ATC STAFF"});
        comboId.setBounds(600,250,300,50);
        comboId.setBackground(Color.cyan);
        comboId.addActionListener(this);
        add(comboId);

        submit = new JButton("SUBMIT");
        submit.setBounds(675,350,150,35);
        submit.setBackground(new Color(131,193,233));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){


        if(ae.getSource() == submit){

            String str = (String) comboId.getSelectedItem();

//            System.out.println(str);

            if (str == "TRAINEE") {
                this.setVisible(false);
                new planeDetailEntry().setVisible(true);

            } else if (str == "ATC STAFF") {


            }

        }



    }


    public static void main(String [] args){
        new chooseUserType();
    }

}


