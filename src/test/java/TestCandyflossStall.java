import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCandyflossStall {

    CandyflossStall candyflossstall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        candyflossstall = new CandyflossStall("Famous Floss", "Andy", "12");
        visitor1 = new Visitor(12, 6.0, 20.50);
    }


    @Test
    public void getStallName() {
        assertEquals("Famous Floss", candyflossstall.getName());
    }
}
