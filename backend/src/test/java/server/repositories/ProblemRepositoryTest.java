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

import server.controllers.ProblemController;
import server.models.Problem;
import server.repositories.ProblemRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProblemRepositoryTest {

    @Mock
    private ProblemRepository problemRepo;

    @InjectMocks
    private ProblemController sut;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGet() {
        int id = 5;
        when(problemRepo.findByProblemId(5)).thenReturn(new Problem(1, 1, 1, 1));
        Problem test = sut.getProblemById(id);
        int first = test.getFirst();
        assertEquals(1, first);
    }

    @Test
    public void testNull() {
        int id = 25;
        when(problemRepo.findByProblemId(25)).thenReturn(null);
        Problem test = sut.getProblemById(id);
        assertEquals(null, test);
    }
}