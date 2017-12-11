package Rover;

/**
 * Created by yvettepinder on 11/12/2017.
 */
public class TurnRover {

    public String turn(String startingPosition, String command) {
        char startingDirection = startingPosition.charAt(4);
        String newDirection = "";

        // add to or subtract from the x and y coordinates according to the command
        if (command == "L") {
            switch (startingDirection) {
                case 'N':
                    newDirection = "W";
                    break;
                case 'E':
                    newDirection = "N";
                    break;
                case 'S':
                    newDirection = "E";
                    break;
                case 'W':
                    newDirection = "S";
                    break;
            }
        } else if (command == "R") {
            switch (startingDirection) {
                case 'N':
                    newDirection = "E";
                    break;
                case 'E':
                    newDirection = "S";
                    break;
                case 'S':
                    newDirection = "W";
                    break;
                case 'W':
                    newDirection = "N";
                    break;
            }
        }

        return newDirection;
    }
}
