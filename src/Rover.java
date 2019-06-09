import java.lang.String;
import java.util.ArrayList;
import java.util.List;

class Rover {
    private int x;
    private int y;
    private Direction direction;
    private Direction directions;

    Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.directions = Direction.DIRECTIONS;
    }

    void turnRight(){
        List allDirections = directions.getAllDirections();
        int currentFaceIndex = allDirections.indexOf(this.direction);

        currentFaceIndex = currentFaceIndex+1;
        List<INTEGER> num = new ArrayList<INTEGER>();
        for (INTEGER integer : num) {
            
        }
        if(currentFaceIndex > 3){
            currentFaceIndex = 0;
        }
        this.direction = (Direction) allDirections.get(currentFaceIndex);
    }

    void turnLeft(){
        List allDirections = directions.getAllDirections();
        int currentFaceIndex = allDirections.indexOf(this.direction);

        currentFaceIndex = currentFaceIndex-1;
        if(currentFaceIndex < 0){
            currentFaceIndex = 3;
        }

        this.direction = (Direction) allDirections.get(currentFaceIndex);
    }

    void move(){
        if(this.direction == Direction.N){
            this.y = this.y + 1;
        }
        if(this.direction == Direction.E) {
            this.x = this.x + 1;
        }
        if(this.direction == Direction.S){
            this.y = this.y - 1;
        }
        if(this.direction == Direction.W){
            this.x = this.x - 1;
        }
    }

    Direction getFace() {
        return direction;
    }

    String getLocation() {

        return this.x + " " + this.y + " " + this.direction;
    }
}
