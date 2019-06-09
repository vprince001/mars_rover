import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Plateau {

    private List<Rover> rovers;
    private int topX;
    private int topY;

    Plateau(int topX, int topY) {
        this.rovers = new ArrayList<>();
        this.topX = topX;
        this.topY = topY;
    }

    void addRover(Rover rover){
        this.rovers.add(rover);
    }

    List<Rover> getRovers() {
        return rovers;
    }

    void intructRover(Rover rover, String program) {
        String[] instructions = program.split("");
        for (String instruction : instructions) {

            if(instruction.equals("L")){
                rover.turnLeft();
            }
            if(instruction.equals("R")){
                rover.turnRight();
            }
            if(instruction.equals("M")){
                rover.move();
            }
        }
    }
}
