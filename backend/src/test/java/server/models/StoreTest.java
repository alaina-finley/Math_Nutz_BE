package server.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import server.models.Store;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreTest {

    @Test
    public void testStoreStudentID() {
        Store test = new Store(8, false, false, false, false, false);
        test.setId(5);
        assertEquals((Integer) 5, test.getId());
    }

    @Test
    public void testItem1() {
        Store test = new Store(5, false, false, false, false, false);
        assertFalse(test.getItem1_purchased());
        test.setItem1_purchased(true);
        assertTrue(test.getItem1_purchased());
    }

}
