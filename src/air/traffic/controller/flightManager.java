package air.traffic.controller;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class flightManager {
    public
    List<aircraft> aircraftList=new ArrayList<aircraft>();
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
}