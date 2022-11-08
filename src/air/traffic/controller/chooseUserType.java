package air.traffic.controller;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chooseUserType extends JFrame implements ActionListener {

    JComboBox comboId;

    JButton submit;


    chooseUserType(){
        setBounds(600,200,400,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        comboId = new JComboBox(new String[] {"TRAINEE", "ATC STAFF"});
        comboId.setBounds(140,110,150,25);
        comboId.setBackground(Color.WHITE);
        comboId.addActionListener(this);
        add(comboId);

        submit = new JButton("SUBMIT");
        submit.setBounds(160,160,100,25);
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


