import java.util.*;
public class flightManager 
{
     

    public static void main(String[] args) {
        List<aircraft> aircraftList=new ArrayList<aircraft>();
        List<runway> runwayList = new ArrayList<runway>(); 
        String userType;
        Scanner sc = new Scanner(System.in);
        userType = sc.nextLine();
        if(userType=="Trainee")
        {
            boolean choice = true;
            System.out.println("Add new aircraft?");
            while(choice)
            {
            aircraftList.add(new aircraft(false,"Boeing", 23, 34.5, 12));
            choice = sc.nextBoolean();
            }
            choice = true;
            System.out.println("Add new runway?");
            while(choice)
            {
            runwayList.add(new runway(false));
            choice = sc.nextBoolean();
            }
        }
    }
}
