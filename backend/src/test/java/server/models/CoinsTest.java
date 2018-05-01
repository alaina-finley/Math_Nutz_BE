package server.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import server.models.Coins;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoinsTest {

    @Test
    public void testCoinGetTotal() {
        Coins test = new Coins(5, 20);
        assertEquals((Integer) 20, test.getTotal_coins());
    }

    @Test
    public void testCoinGetStudentID() {
        Coins test = new Coins(5, 20);
        assertEquals((Integer) 5, test.getStudent_id());
    }

}
