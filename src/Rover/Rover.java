package Rover;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class Rover {

    private MoveRover moveRover;

    public Rover(){
        moveRover = new MoveRover();
    }

    public String findNewPosition(String startingPosition, String command){
        String newPosition;
        for(int i=0;i<command.length();i++) {
            char currentCommand = command.charAt(i);
            newPosition = moveRover.movement(startingPosition, currentCommand);
            startingPosition = newPosition;
        }


        return startingPosition;

    }
}
