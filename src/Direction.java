import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Direction {
    N,
    E,
    S,
    W,
    DIRECTIONS;

    List<Direction> getAllDirections(){
        return new ArrayList<>(Arrays.asList(N, E, S, W));
    }
}
