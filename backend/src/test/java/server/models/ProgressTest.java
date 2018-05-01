package server.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import server.models.Progress;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProgressTest {

    @Test
    public void testSetGetID() {
        Progress test = new Progress(5, 5, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10);
        test.setId((12));
        assertEquals((Integer) 12, test.getId());
    }

    @Test
    public void testSetGetStudentID() {
        Progress test = new Progress(5, 10, 5, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0);
        assertEquals((Integer) 5, test.getStudent_id());
        test.setStudent_id(10);
        assertEquals((Integer) 10, test.getStudent_id());
    }

    @Test
    public void testSetGetLev11Total() {
        Progress test = new Progress(5, 10, 5, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0);
        assertEquals((Integer) 5, test.getLev11_correct());
        test.setLev11_correct(10);
        assertEquals((Integer) 10, test.getLev11_correct());
    }

    @Test
    public void testSetGetLev11Correct() {
        Progress test = new Progress(5, 10, 5, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0);
        assertEquals((Integer) 10, test.getLev11_total());
    }

}
