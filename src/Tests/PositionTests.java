package Tests;

import org.junit.Test;
import org.junit.Assert;
import Rover.Rover;
import Rover.TurnRover;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class PositionTests {

    private Rover rover;
    private TurnRover turnRover;

    public PositionTests(){
        rover = new Rover();
        turnRover = new TurnRover();
    }

    //test to check initial position with one command
    @Test
    public void testPositionSingleCommand(){
        String newPosition = rover.findNewPosition("0,0,N", "F");
        //Assert.assertTrue(newPosition.equals("0,1,N"));
        System.out.println(newPosition);
    }

    //test to check initial position with multiple commands
    //only testing forwards and backwards
    @Test
    public void testPositionMultipleCommands(){
        String newPosition = rover.findNewPosition("0,0,N", "FFFBFF");
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
        String newPositionAndDirection = rover.findNewPosition("0,0,N", "FRFLFRR");
        Assert.assertTrue(newPositionAndDirection.equals("1,2,S"));
        System.out.println(newPositionAndDirection);

    }
}
