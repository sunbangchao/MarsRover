import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {

    private MarsRover marsRover;


    @BeforeAll
    void init(){
        marsRover = new MarsRover();
    }

    @Test
    void test_init(){
        marsRover.init(0,1,Direction.E);
        Assertions.assertEquals(0,marsRover.getLoc().getX());
        Assertions.assertEquals(1,marsRover.getLoc().getY());
        Assertions.assertEquals(Direction.E,marsRover.getDirection());
    }





}
