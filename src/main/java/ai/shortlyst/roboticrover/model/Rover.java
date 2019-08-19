package ai.shortlyst.roboticrover.model;

import ai.shortlyst.roboticrover.enums.DirectionEnum;

/**
 *
 * @author Ahmad Mudzakkir Amal 
 */
public class Rover {
    private Integer xPosition;
    private Integer yPosition;
    private Integer xTopPosition;
    private Integer yTopPosition;
    private DirectionEnum direction;

    public Rover(Integer xPosition, Integer yPosition, Integer xTopPosition, 
            Integer yTopPosition, DirectionEnum direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.xTopPosition = xTopPosition;
        this.yTopPosition = yTopPosition;
        this.direction = direction;
    }
    
    public Integer getxPosition() {
        return xPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public Integer getxTopPosition() {
        return xTopPosition;
    }

    public void setxTopPosition(Integer xTopPosition) {
        this.xTopPosition = xTopPosition;
    }

    public Integer getyTopPosition() {
        return yTopPosition;
    }

    public void setyTopPosition(Integer yTopPosition) {
        this.yTopPosition = yTopPosition;
    }
    
    
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }
    
    
}
