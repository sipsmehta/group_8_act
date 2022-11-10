package air.traffic.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;

    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/atc ","root","root"); // Need to add own detail of sql
            s= c.createStatement();


        }catch (Exception e){

        }
    }
}
