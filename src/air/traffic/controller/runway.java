package air.traffic.controller;

public class runway
{
    boolean occupied=false;
    boolean emergencyRunway;

    int runwayNumber;

    String direction;
    runway(boolean emergencyRunway,int runwayNumber,String direction)
    {
        this.emergencyRunway = emergencyRunway;
        this.runwayNumber = runwayNumber;
        this.direction = direction;
    }
    void allocateRegularRunway(aircraft occupyingAircraft )
    {
        occupied = true;
    }
    void deallocateRegularRunway(aircraft occupyingAircraft)
    {
        occupied = false;
    }
    void allocateEmergencyRunway(aircraft occupyingAircraft)
    {
        occupied = true;
    }
    void deallocateEmergencyRunway()
    {
        occupied = false;
    }
    boolean forEmergency()
    {
        if(emergencyRunway==true)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    boolean isOccupied()
    {
        if(occupied==true)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    void setOccupancy(boolean runwayOccupancy)
    {
        occupied = true;
    }
}
