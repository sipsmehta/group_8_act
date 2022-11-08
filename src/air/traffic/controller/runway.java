package air.traffic.controller;

public class runway
{
    boolean occupied=false;
    boolean emergencyRunway;
    runway(boolean emergencyRunway)
    {
        this.emergencyRunway = emergencyRunway;
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
    boolean isEmergency()
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
}
