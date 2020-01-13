public class MarsRover {
    private Location loc;

    private Direction direction;

    public MarsRover(){

    }

    public Location getLoc() {
        return loc;
    }

    public Direction getDirection() {
        return direction;
    }

    public void move(){
        if(this.direction == null){
            //TODO Exception
            return ;
        }
        this.loc.move(this.direction);
    }

    public void turnLeft(){
        if(this.direction == null){
            //TODO Exception
            return ;
        }
        switch (this.direction){
            case E:
                this.direction = Direction.N;
                break;
            case S:
                this.direction = Direction.E;
                break;
            case W:
                this.direction = Direction.S;
                break;
            case N:
                this.direction = Direction.W;
                break;
        }
    }

    public void turnRight(){
        if(this.direction == null){
            //TODO Exception
            return ;
        }
        switch (this.direction){
            case E:
                this.direction = Direction.S;
                break;
            case S:
                this.direction = Direction.W;
                break;
            case W:
                this.direction = Direction.N;
                break;
            case N:
                this.direction = Direction.E;
                break;
        }
    }

    public void doCommand(String command){
        if(command.equals("M")) move();
        else if(command.equals("L")) turnLeft();
        else if(command.equals("R")) turnRight();
    }


    public void init(int x,int y,Direction direction) {
        this.loc = new Location(x,y);
        this.direction = direction;
    }
}
