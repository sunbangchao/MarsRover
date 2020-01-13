import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {

    private MarsRover marsRover = new MarsRover();



    @Test
    void test_init(){
        marsRover.init(0,1,Direction.E);
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.E,marsRover.getDirection());
    }

    @Test
    void test_moveE(){
        marsRover.init(0,1,Direction.E);
        marsRover.move();
        Assertions.assertEquals(1,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.E,marsRover.getDirection());
    }

    @Test
    void test_moveW(){
        marsRover.init(0,1,Direction.W);
        marsRover.move();
        Assertions.assertEquals(-1,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.W,marsRover.getDirection());
    }

    @Test
    void test_moveN(){
        marsRover.init(0,1,Direction.N);
        marsRover.move();
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(2,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.N,marsRover.getDirection());
    }

    @Test
    void test_moveS(){
        marsRover.init(0,1,Direction.S);
        marsRover.doCommand("M");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(0,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.S,marsRover.getDirection());
    }

    @Test
    void test_turn_left_from_S(){
        marsRover.init(0,1,Direction.S);
        marsRover.doCommand("L");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.E,marsRover.getDirection());
    }

    @Test
    void test_turn_right_from_S(){
        marsRover.init(0,1,Direction.S);
        marsRover.doCommand("R");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.W,marsRover.getDirection());
    }

    @Test
    void test_turn_left_from_N(){
        marsRover.init(0,1,Direction.N);
        marsRover.doCommand("L");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.W,marsRover.getDirection());
    }

    @Test
    void test_turn_right_from_N(){
        marsRover.init(0,1,Direction.N);
        marsRover.doCommand("R");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.E,marsRover.getDirection());
    }

    @Test
    void test_turn_left_from_E(){
        marsRover.init(0,1,Direction.E);
        marsRover.doCommand("L");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.N,marsRover.getDirection());
    }

    @Test
    void test_turn_right_from_E(){
        marsRover.init(0,1,Direction.E);
        marsRover.doCommand("R");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.S,marsRover.getDirection());
    }

    @Test
    void test_turn_left_from_W(){
        marsRover.init(0,1,Direction.W);
        marsRover.doCommand("L");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.S,marsRover.getDirection());
    }

    @Test
    void test_turn_right_from_W(){
        marsRover.init(0,1,Direction.W);
        marsRover.doCommand("R");
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.N,marsRover.getDirection());
    }





}
