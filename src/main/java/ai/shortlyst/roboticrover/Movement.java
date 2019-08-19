package ai.shortlyst.roboticrover;

import ai.shortlyst.roboticrover.enums.DirectionEnum;
import ai.shortlyst.roboticrover.model.Rover;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ahmad Mudzakkir Amal
 */
public class Movement {

    Map<DirectionEnum, DirectionEnum> mapRightSide = new HashMap<>();
    Map<DirectionEnum, DirectionEnum> mapLeftSide = new HashMap<>();

    public Movement() {
        mapRightSide.put(DirectionEnum.E, DirectionEnum.S);
        mapRightSide.put(DirectionEnum.S, DirectionEnum.W);
        mapRightSide.put(DirectionEnum.W, DirectionEnum.N);
        mapRightSide.put(DirectionEnum.N, DirectionEnum.E);

        mapLeftSide.put(DirectionEnum.E, DirectionEnum.N);
        mapLeftSide.put(DirectionEnum.N, DirectionEnum.W);
        mapLeftSide.put(DirectionEnum.W, DirectionEnum.S);
        mapLeftSide.put(DirectionEnum.S, DirectionEnum.E);
    }

    public Rover turnRight(Rover rover) {
        rover.setDirection(mapRightSide.get(rover.getDirection()));
        return rover;
    }

    public Rover turnLeft(Rover rover) {
        rover.setDirection(mapLeftSide.get(rover.getDirection()));
        return rover;
    }

    public Rover moveForward(Rover rover) {
        if (null != rover.getDirection()) switch (rover.getDirection()) {
            case N:
                rover.setyPosition(Math.min(rover.getyPosition() + 1, rover.getyTopPosition()));
                break;
            case W:
                rover.setxPosition(Math.max(rover.getxPosition() - 1, 0));
                break;
            case E:
                rover.setxPosition(Math.min(rover.getxPosition() + 1, rover.getxTopPosition()));
                break;
            case S:
                rover.setyPosition(Math.max(rover.getyPosition() - 1, 0));
                break;
            default:
                break;
        }
        return rover;
    }
}
