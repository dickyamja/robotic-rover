package ai.shortlyst.roboticrover;

import ai.shortlyst.roboticrover.enums.DirectionEnum;
import ai.shortlyst.roboticrover.model.Rover;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Ahmad Mudzakkir Amal
 */
public class MovementTest {
    
    @Test
    public void testTurnLeftFromEast(){
        Rover rover = new Rover(1, 1, 6, 6, DirectionEnum.E);
        Movement movement = new Movement();
        rover = movement.turnLeft(rover);
        Assert.assertEquals(DirectionEnum.N, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testTurnLeftFromNorth(){
        Rover rover = new Rover(1, 1, 6, 6, DirectionEnum.N);
        Movement movement = new Movement();
        rover = movement.turnLeft(rover);
        Assert.assertEquals(DirectionEnum.W, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testTurnLeftFromWest(){
        Rover rover = new Rover(1, 1, 6, 6, DirectionEnum.W);
        Movement movement = new Movement();
        rover = movement.turnLeft(rover);
        Assert.assertEquals(DirectionEnum.S, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testTurnLeftFromSouth(){
        Rover rover = new Rover(1, 1, 6, 6, DirectionEnum.S);
        Movement movement = new Movement();
        rover = movement.turnLeft(rover);
        Assert.assertEquals(DirectionEnum.E, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testTurnRightFromEast(){
        Rover rover = new Rover(1, 1, 6, 6, DirectionEnum.E);
        Movement movement = new Movement();
        rover = movement.turnRight(rover);
        Assert.assertEquals(DirectionEnum.S, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testTurnRightFromSouth(){
        Rover rover = new Rover(1, 1, 6, 6, DirectionEnum.S);
        Movement movement = new Movement();
        rover = movement.turnRight(rover);
        Assert.assertEquals(DirectionEnum.W, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testTurnRightFromWest(){
        Rover rover = new Rover(1, 1, 6, 6, DirectionEnum.W);
        Movement movement = new Movement();
        rover = movement.turnRight(rover);
        Assert.assertEquals(DirectionEnum.N, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testTurnRightFromNorth(){
        Rover rover = new Rover(1, 1, 6, 6, DirectionEnum.N);
        Movement movement = new Movement();
        rover = movement.turnRight(rover);
        Assert.assertEquals(DirectionEnum.E, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testMoveForwardFromNorth(){
        Rover rover = new Rover(2, 2, 6, 6, DirectionEnum.N);
        Movement movement = new Movement();
        rover = movement.moveForward(rover);
        Assert.assertEquals(DirectionEnum.N, rover.getDirection());
        Assert.assertEquals(2, rover.getxPosition().longValue());
        Assert.assertEquals(3, rover.getyPosition().longValue());
    }
    
    @Test
    public void testMoveForwardFromEast(){
        Rover rover = new Rover(2, 2, 6, 6, DirectionEnum.E);
        Movement movement = new Movement();
        rover = movement.moveForward(rover);
        Assert.assertEquals(DirectionEnum.E, rover.getDirection());
        Assert.assertEquals(3, rover.getxPosition().longValue());
        Assert.assertEquals(2, rover.getyPosition().longValue());
    }
    
    @Test
    public void testMoveForwardFromSouth(){
        Rover rover = new Rover(2, 2, 6, 6, DirectionEnum.S);
        Movement movement = new Movement();
        rover = movement.moveForward(rover);
        Assert.assertEquals(DirectionEnum.S, rover.getDirection());
        Assert.assertEquals(2, rover.getxPosition().longValue());
        Assert.assertEquals(1, rover.getyPosition().longValue());
    }
    
    @Test
    public void testMoveForwardFromWest(){
        Rover rover = new Rover(2, 2, 6, 6, DirectionEnum.W);
        Movement movement = new Movement();
        rover = movement.moveForward(rover);
        Assert.assertEquals(DirectionEnum.W, rover.getDirection());
        Assert.assertEquals(1, rover.getxPosition().longValue());
        Assert.assertEquals(2, rover.getyPosition().longValue());
    }
}
