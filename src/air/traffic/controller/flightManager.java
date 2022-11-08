package air.traffic.controller;

import java.util.*;
public class flightManager 
{
    List<aircraft> aircraftList=new ArrayList<aircraft>();
    List<runway> runwayList = new ArrayList<runway>();
    List<runway> emergencyRunwayList = new ArrayList<runway>();  
    void addAircraft(aircraft newAircraft)
    {
        aircraftList.add(newAircraft);
    }
    void addRunway(runway newRunway)
    {
        if(newRunway.isEmergency())
        emergencyRunwayList.add(newRunway);
        else
        runwayList.add(newRunway);
    }
    void manageEmergencyFlights()
    {
        for(int i=0;i<aircraftList.size();i++)
        {
            if(aircraftList.get(i).needEmergencyLanding())
            {
                for(int j=0;j<emergencyRunwayList.size();j++)
                {
                    if(emergencyRunwayList.get(j).isOccupied()==false)
                    {
                        emergencyRunwayList.get(j).allocateEmergencyRunway(aircraftList.get(i));
                    }
                    else
                    {
                        // check if landing on regular runway is possible Otherwise crash happens
                        System.out.println("Crash"); //this line for testing only
                    }
                }
            }
        }
    }
}
