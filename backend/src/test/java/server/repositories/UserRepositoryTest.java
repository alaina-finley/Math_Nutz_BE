package server.repositories;

import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import server.controllers.UserController;
import server.models.User;
import server.repositories.UserRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Mock
    private UserRepository userRepo;

    @InjectMocks
    private UserController sut;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUsername() {
        int id = 5;
        when(userRepo.findByUserId(5)).thenReturn(new User("matilda", "password", "student"));
        User test = sut.getUserById(id);
        String username = test.getUsername();
        assertEquals("matilda", username);
    }

    @Test
    public void testNullUser() {
        int id = 25;
        when(userRepo.findByUserId(25)).thenReturn(null);
        User test = sut.getUserById(id);
        assertEquals(null, test);
    }
}