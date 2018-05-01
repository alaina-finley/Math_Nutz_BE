package server.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import server.models.Problem;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Test
    public void testSetGetID() {
        User test = new User("matilda", "password", "student");
        test.setId((12));
        assertEquals((Integer) 12, test.getId());
    }

    @Test
    public void testSetGetUsername() {
        User test = new User("matilda", "password", "student");
        assertEquals("matilda", test.getUsername());
        test.setUsername("matilda2");
        assertEquals("matilda2", test.getUsername());
    }

    @Test
    public void testSetGetPassword() {
        User test = new User("matilda", "password", "student");
        assertEquals("password", test.getPassword());
        test.setPassword("password123");;
        assertEquals("password123", test.getPassword());
    }

}