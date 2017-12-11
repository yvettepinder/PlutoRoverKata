package Rover;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class ObstacleDetection {

    public boolean checkForObstacle(String obstaclePosition, String positionOfRover){

        String coordinatesOfRoverPosition = positionOfRover.substring(0,3);
        if(obstaclePosition.equals(coordinatesOfRoverPosition)){
            return true;
        }
        else{
            return false;
        }
    }
}
