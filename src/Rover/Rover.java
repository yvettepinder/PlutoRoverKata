package Rover;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class Rover {

    public String findNewPosition(String startingPosition, String command){
        String newPosition = "";
        if(startingPosition == "0,0,N"){
            if(command == "F"){
                newPosition = "0,1,N";
            }
        }
        return newPosition;

    }
}
