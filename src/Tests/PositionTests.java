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

    @Test
    public void testPosition(){
        String newPosition = rover.findNewPosition("0,0,N", "F");
        Assert.assertTrue(newPosition.equals("0,1,N"));
        System.out.print(newPosition);
    }
}
