package ai.shortlyst.roboticrover;

import ai.shortlyst.roboticrover.enums.DirectionEnum;
import ai.shortlyst.roboticrover.model.Rover;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Ahmad Mudzakkir Amal
 */
public class MainTest {

    @Test
    public void testFullFirstSample() {
        String sampleData = "5 5\n"
                + "1 2 N\n"
                + "LMLMLMLMM";
        String[] commands = sampleData.split("\\r?\\n");
        String[] initialPosition = commands[0].split("\\s+");
        int xTopPosition = Integer.valueOf(initialPosition[0]);
        int yTopPosition = Integer.valueOf(initialPosition[1]);
        Movement movement = new Movement();
        String[] initialState = commands[1].split("\\s+");
        int initialXPos = Integer.valueOf(initialState[0]);
        int initialYPos = Integer.valueOf(initialState[1]);
        DirectionEnum initialDirection = DirectionEnum.valueOf(initialState[2]);
        Rover rover = new Rover(initialXPos, initialYPos, xTopPosition,
                yTopPosition, initialDirection);
        
        char[] movementsSequence = commands[2].toCharArray();
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
        
        Assert.assertEquals(DirectionEnum.N, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(3, rover.getyPosition().longValue());
    }

    @Test
    public void testFullSecondSample() {
        String sampleData = "5 5\n"
                + "3 3 E\n"
                + "MMRMMRMRRM";
        
        String[] commands = sampleData.split("\\r?\\n");
        String[] initialPosition = commands[0].split("\\s+");
        int xTopPosition = Integer.valueOf(initialPosition[0]);
        int yTopPosition = Integer.valueOf(initialPosition[1]);
        Movement movement = new Movement();
        String[] initialState = commands[1].split("\\s+");
        int initialXPos = Integer.valueOf(initialState[0]);
        int initialYPos = Integer.valueOf(initialState[1]);
        DirectionEnum initialDirection = DirectionEnum.valueOf(initialState[2]);
        Rover rover = new Rover(initialXPos, initialYPos, xTopPosition,
                yTopPosition, initialDirection);
        
        char[] movementsSequence = commands[2].toCharArray();
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
        
        Assert.assertEquals(DirectionEnum.E, rover.getDirection());
        Assert.assertEquals(5, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());

    }
}
