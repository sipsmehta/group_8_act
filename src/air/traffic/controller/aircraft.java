package air.traffic.controller;


public class aircraft {
    boolean emergency;

    boolean landed = false;
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
    boolean hasLanded()
    {
        return landed;
    }
    void setLanded()
    {
        landed = true;
    }
    int fuelCapacity()
    {
        return currFuel;
    }
}
