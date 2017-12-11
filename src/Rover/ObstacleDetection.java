package Rover;

import java.util.List;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class ObstacleDetection {

    public boolean checkForObstacle(List<String> obstaclePositions, String positionOfRover){

        char xCoordinateNewPosition = positionOfRover.charAt(0);
        char yCoordinateNewPosition = positionOfRover.charAt(2);

        boolean flag = false;

        // compare the new position to every position in the list of obstacle positions
        for(String s : obstaclePositions){
            char stringX = s.charAt(0);
            char stringY = s.charAt(2);
            if(stringX == xCoordinateNewPosition && stringY == yCoordinateNewPosition){
                //returns true if any of the coordinates match
                flag = true;
            }
        }

        return flag;
    }
}
