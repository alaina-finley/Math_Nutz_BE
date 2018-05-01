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

import server.controllers.StoreController;
import server.models.Store;
import server.repositories.StoreRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreRepositoryTest {

    @Mock
    private StoreRepository StoreRepo;

    @InjectMocks
    private StoreController sut;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGet() {
        int id = 5;
        when(StoreRepo.findByStoreId(5)).thenReturn(new Store(5, true, false, false, false, false));        
        Store test = sut.getStoreById(id);
        boolean firstItem = test.getItem1_purchased();
        assertEquals(true, firstItem);
    }

    @Test
    public void testNull() {
        int id = 25;
        when(StoreRepo.findByStoreId(25)).thenReturn(null);
        Store test = sut.getStoreById(id);
        assertEquals(null, test);
    }
}