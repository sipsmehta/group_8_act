package air.traffic.controller;


public class aircraft {
    boolean emergency;
    String planeType;
    int currFuel;
    double altitude;
    int speed;
    aircraft(boolean emergency,String planeType, int currFuel, double altitude,int speed)
    {
        this.emergency = emergency;
        this.planeType = planeType;
        this.currFuel = currFuel;
        this.altitude =  altitude;
        this.speed = speed;
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
