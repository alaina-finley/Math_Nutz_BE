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

import server.controllers.ProgressController;
import server.models.Progress;
import server.repositories.ProgressRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProgressRepositoryTest {

    @Mock
    private ProgressRepository ProgressRepo;

    @InjectMocks
    private ProgressController sut;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGet() {
        int id = 5;
        when(ProgressRepo.findByProgressId(5)).thenReturn(new Progress(5, 10, 5, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0));
        Progress test = sut.getProgressById(id);
        int student = test.getLev11_correct();
        assertEquals(5, student);
    }

    @Test
    public void testNull() {
        int id = 25;
        when(ProgressRepo.findByProgressId(25)).thenReturn(null);
        Progress test = sut.getProgressById(id);
        assertEquals(null, test);
    }
}