public class MarsRover {
    private Location loc;

    private Direction direction;

    public MarsRover(){

    }

    public MarsRover(Location loc, Direction direction){
        this.loc = loc;
        this.direction = direction;
    }

    public MarsRover(int x, int y, Direction direction){
        this.loc = new Location(x,y);
        this.direction = direction;
    }

    public Location getLoc() {
        return loc;
    }

    public Direction getDirection() {
        return direction;
    }

    public void move(){

    }

    public void turnLeft(){

    }

    public void turnRight(){

    }

    public void doCommand(String command){

    }


    public void init(int x,int y,Direction direction) {
        this.loc = new Location(x,y);
        this.direction = direction;
    }
}
