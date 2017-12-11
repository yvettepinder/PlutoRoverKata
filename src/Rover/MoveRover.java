package Rover;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class MoveRover {

    public String movement(String startingPosition, char currentCommand){

        //retrieve x and y coordinates of the starting position
        char x = startingPosition.charAt(0);
        char y = startingPosition.charAt(2);


        //convert the x and y coordinates to numerical values
        int xcoordinate = Character.getNumericValue(x);
        int ycoordinate = Character.getNumericValue(y);

        //retrieve the direction the rover is facing
        char direction = startingPosition.charAt(4);


        // add to or subtract from the x and y coordinates according to the command
        if (currentCommand == 'F') {
            switch (direction) {
                case 'N':
                    ycoordinate ++;

                    break;
                case 'E':
                    xcoordinate ++;

                    break;
                case 'S':
                    ycoordinate --;
                    break;
                case 'W':
                    xcoordinate --;
                    break;
            }
        } else if (currentCommand == 'B') {
            switch (direction) {
                case 'N':
                    ycoordinate --;

                    break;
                case 'E':
                    xcoordinate --;

                    break;
                case 'S':
                    ycoordinate ++;
                    break;
                case 'W':
                    xcoordinate ++;
                    break;
            }
        }

        String Xvalue = Integer.toString(xcoordinate);
        String Yvalue = Integer.toString(ycoordinate);
        String newPosition = Xvalue + "," + Yvalue + "," + direction;

        return newPosition;
    }
}
