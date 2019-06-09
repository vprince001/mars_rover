import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    Rover rover;
    @BeforeEach
    void execute() {
        rover = new Rover(0, 0, Direction.N);
    }

    @org.junit.jupiter.api.Test
    void turnRight() {
        rover.turnRight();
        assertEquals(Direction.E, rover.getFace() );
    }

    @org.junit.jupiter.api.Test
    void turnLeft() {
        rover.turnLeft();
        assertEquals(Direction.W, rover.getFace() );
    }

    @org.junit.jupiter.api.Test
    void move() {
        rover.move();
        String expected = "0 1 N";
        assertEquals(expected, rover.getLocation());
    }
}