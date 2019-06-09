import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauTest {

    @Test
    void addRover() {
        Rover rover = new Rover(0, 0, Direction.N);
        Plateau plateau = new Plateau(5, 5);
        plateau.addRover(rover);
        assertEquals( 1, plateau.getRovers().size() );
    }

    @Test
    void intructRover(){
        Rover rover1 = new Rover(1, 2, Direction.N);
        Rover rover2 = new Rover(3, 3, Direction.E);
        Plateau plateau = new Plateau(5, 5);
        plateau.addRover(rover1);
        plateau.intructRover(rover1,"LMLMLMLMM");
        plateau.intructRover(rover2,"MMRMMRMRRM");
        assertEquals("1 3 N", rover1.getLocation());
        assertEquals("5 1 E", rover2.getLocation());
    }
}