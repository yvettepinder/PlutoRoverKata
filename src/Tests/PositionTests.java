package Tests;

import org.junit.Test;
import org.junit.Assert;
import Rover.Rover;
import Rover.TurnRover;
import Rover.ObstacleDetection;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class PositionTests {

    private Rover rover;
    private TurnRover turnRover;
    private ObstacleDetection obstacleDetection;
    List<String> listOfObstacles = Arrays.asList("5,7", "4,5", "7,8");

    public PositionTests(){
        rover = new Rover();
        turnRover = new TurnRover();
        obstacleDetection = new ObstacleDetection();
    }

    //test to check initial position with one command
    @Test
    public void testPositionSingleCommand(){
        String newPosition = rover.findNewPosition("0,0,N", "F", listOfObstacles);
        //Assert.assertTrue(newPosition.equals("0,1,N"));
        System.out.println(newPosition);
    }

    //test to check initial position with multiple commands
    //only testing forwards and backwards
    @Test
    public void testPositionMultipleCommands(){
        String newPosition = rover.findNewPosition("0,0,N", "FFFBFF", listOfObstacles);
        //Assert.assertTrue(newPosition.equals("0,4,N"));
        System.out.println(newPosition);
    }

    //test to check the commands L and R correctly change the direction the rover is facing
    @Test
    public void testDirection(){
        String directionAfterL = turnRover.turn("0,0,N", 'L');
        String directionAfterR = turnRover.turn("0,0,N", 'R');
        Assert.assertTrue(directionAfterL == "W");
        Assert.assertTrue(directionAfterR == "E");
        System.out.println(directionAfterL);
        System.out.println(directionAfterR);
    }

    //test to check a command containing multiple commands
    //commands including a combination of forward backward left right
    @Test
    public void testPositionAndDirection(){
        String newPositionAndDirection = rover.findNewPosition("0,0,N", "FRFLFRR", listOfObstacles);
        Assert.assertTrue(newPositionAndDirection.equals("1,2,S"));
        System.out.println(newPositionAndDirection);

    }

    //test to check that the program correctly detects/doesn't detect an obstacle
    //checks for multiple obstacles
    @Test
    public void testObstacleDetection(){
        boolean obstaclePresent = obstacleDetection.checkForObstacle(listOfObstacles, "5,7,S");
        Assert.assertTrue(obstaclePresent == true);

        boolean obstacleFalsePresent = obstacleDetection.checkForObstacle(listOfObstacles,"3,5,N");
        Assert.assertTrue(obstacleFalsePresent == false);
    }


    //test to check the rover doesn't move into a space if there is an obstacle there
    //check this by ensuring the rover stays at the same position when there is an obstacle present
    @Test
    public void testObstacleResponse(){
        String startingPosition = "5,8,S";
        String newPosition = rover.findNewPosition(startingPosition, "F", listOfObstacles);
        System.out.println(newPosition);
        Assert.assertTrue(startingPosition.equals(newPosition));
    }

    //test to ensure wrapping of 10x10 grid
    // command increases both the y and x coordinate
    @Test
    public void checkBounds(){
        String newPosition = rover.findNewPosition("9,9,N", "FRF", listOfObstacles);

        char Xcoordinate = newPosition.charAt(0);
        char Ycoordinate = newPosition.charAt(2);

        int x = Character.getNumericValue(Xcoordinate);
        int y = Character.getNumericValue(Ycoordinate);

        System.out.println(x);
        System.out.println(y);

        Assert.assertTrue(x <= 10 && y <= 10);
    }

}
