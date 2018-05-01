package server.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import server.models.Problem;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProblemTest {

    @Test
    public void testSetGetID() {
        Problem test = new Problem(1, 2, 1, 1);
        test.setId((12));
        assertEquals((Integer) 12, test.getId());
    }

    @Test
    public void testSetGetFirst() {
        Problem test = new Problem(1, 2, 1, 1);
        assertEquals((Integer) 1, test.getFirst());
        test.setFirst((3));
        assertEquals((Integer) 3, test.getFirst());
    }

    @Test
    public void testSetGetSecond() {
        Problem test = new Problem(1, 2, 1, 1);
        assertEquals((Integer) 2, test.getSecond());
        test.setSecond((3));
        assertEquals((Integer) 3, test.getSecond());
    }

}
