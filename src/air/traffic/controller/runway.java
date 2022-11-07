package air.traffic.controller;

public class runway
{
    boolean occupied;
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

    }
    void deallocateEmergencyRunway()
    {
        
    }
}
