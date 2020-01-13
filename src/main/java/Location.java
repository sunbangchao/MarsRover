public class Location {

    private int x;

    private int y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(Direction direction){
        switch (direction){
            case N:
                this.y ++;
                break;
            case W:
                this.x --;
                break;
            case S:
                this.y --;
                break;
            case E:
                this.x ++;
                break;
        }
    }
}
