package Tests;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class PositionTests {

    @Test
    public void testPosition(){
        String startingPosition = "0,0,N";
        String command = "F";
        String newPosition = "";
        Assert.assertTrue(newPosition == "0,1,N");
    }
}
