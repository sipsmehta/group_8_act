package air.traffic.controller;


public class aircraft extends flightManager{
    boolean emergency;

    int planeNumber;
    int currFuel;
    double currHeight;
    int currSpeed;
    aircraft(boolean emergency,int planeNumber, int currFuel, double currHeight,int currSpeed)
    {
        this.emergency = emergency;
        this.planeNumber = planeNumber;
        this.currFuel = currFuel;
        this.currHeight =  currHeight;
        this.currSpeed = currSpeed;
    }
    void ascend()
    {
    
    }
    void descend()
    {

    }
    void approachToLandingRunway(runway allocatedRunway)
    {

    }
    void abortLanding(runway allocRunway)
    {

    }
    boolean needEmergencyLanding()
    {
        if(emergency)
        return true;
        else
        return false;
    }
}
