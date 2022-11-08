package air.traffic.controller;
<<<<<<< HEAD
import java.util.Scanner;
public class trainee 
{
    void traineeSimulation()
    {
        runway runway1 = new runway(true);
        flightManager flightManage = new flightManager();
        flightManage.addRunway(runway1);
        Scanner sc = new Scanner(System.in);
        boolean choice = true;
        System.out.println("Add new aircraft?");
        while(choice)
        {
            flightManage.addAircraft(new aircraft(false, "Boeing", 67, 45.9, 23));
            choice = sc.nextBoolean();
        }
        choice = true;
        System.out.println("Add new runway?");
        while(choice)
        {
        flightManage.addRunway(new runway(false));
        choice = sc.nextBoolean();
    }    
=======

public class trainee {

>>>>>>> 2adb7431c8f2c8111eb7e3e94809e7829c4c8eda
}
