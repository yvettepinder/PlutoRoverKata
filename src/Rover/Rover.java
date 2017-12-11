package Rover;

import java.util.List;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class Rover {

    private MoveRover moveRover;
    private ObstacleDetection obstacleDetection;

    public Rover(){
        moveRover = new MoveRover();
        obstacleDetection = new ObstacleDetection();
    }

    public String findNewPosition(String startingPosition, String command, List<String> obstacles){
        String newPosition;
        for(int i=0;i<command.length();i++) {
            char currentCommand = command.charAt(i);
            newPosition = moveRover.movement(startingPosition, currentCommand);

            boolean obstaclePresent = obstacleDetection.checkForObstacle(obstacles, newPosition);
            if(obstaclePresent == true){
                System.out.println("Obstacle in the way");
                break;
            }
            else {
                startingPosition = newPosition;
            }


        }


        return startingPosition;

    }
}
