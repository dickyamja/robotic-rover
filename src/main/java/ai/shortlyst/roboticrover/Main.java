
package ai.shortlyst.roboticrover;

import ai.shortlyst.roboticrover.enums.DirectionEnum;
import ai.shortlyst.roboticrover.model.Rover;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

/**
 *
 * @author Ahmad Mudzakkir Amal
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, URISyntaxException {
        
        System.out.print("Enter Full path file sample movements : ");
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = consoleReader.readLine();

        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(new File(inputLine)));
        String line = bufferedReader.readLine();
        String[] commands = line.split("\\s+");
        int xTopPosition = Integer.valueOf(commands[0]);
        int yTopPosition = Integer.valueOf(commands[1]);

        while ((line = bufferedReader.readLine()) != null) {
            Movement movement = new Movement();
            String[] initialState = line.split("\\s+");
            int initialXPos = Integer.valueOf(initialState[0]);
            int initialYPos = Integer.valueOf(initialState[1]);
            DirectionEnum initialDirection = DirectionEnum.valueOf(initialState[2]);
            Rover rover = new Rover(initialXPos, initialYPos, xTopPosition,
                    yTopPosition, initialDirection);
            line = bufferedReader.readLine();
            char[] movementsSequence = line.toCharArray();
            for (char c : movementsSequence) {
                switch (c) {
                    case 'L':
                        rover = movement.turnLeft(rover);
                        break;
                    case 'R':
                        rover = movement.turnRight(rover);
                        break;
                    case 'M':
                        rover = movement.moveForward(rover);
                        break;
                    default:
                        System.out.println("Unrecognize command : " + c + " !");
                        break;
                }

            }
            System.out.println("final position : " + rover.getxPosition() + " "
                    + rover.getyPosition() + " " + rover.getDirection().name());
        }

    }

}
