package Tests;

import org.junit.Test;
import org.junit.Assert;
import Rover.Rover;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class PositionTests {

    private Rover rover;

    public PositionTests(){
        rover = new Rover();
    }

    // test to check initial position with one command
    @Test
    public void testPositionSingleCommand(){
        String newPosition = rover.findNewPosition("0,0,N", "F");
        Assert.assertTrue(newPosition.equals("0,1,N"));
        System.out.print(newPosition);
    }

    //test to check initial position with multiple commands
    @Test
    public void testPositionMultipleCommands(){
        String newPosition = rover.findNewPosition("0,0,N", "FRFLFRR");
        Assert.assertTrue(newPosition.equals("1,2,S"));
        System.out.print(newPosition);
    }
}
