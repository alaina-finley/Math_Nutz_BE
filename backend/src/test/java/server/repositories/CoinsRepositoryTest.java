package server.repositories;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import server.controllers.CoinsController;
import server.models.Coins;
import server.repositories.CoinsRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CoinsRepositoryTest {

    @Mock
    private CoinsRepository coinRepo;

    @InjectMocks
    private CoinsController sut;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCoinGetTotal() {
        int coinId = 5;
        when(coinRepo.findByCoinsId(5)).thenReturn(new Coins(5, 20));
        Coins test = sut.getCoinsById(coinId);
        int coins = test.getTotal_coins();
        assertEquals(20, coins);
    }

    @Test
    public void deleteCoinEnsureItsNull() {
        int coinId = 25;
        when(coinRepo.deleteByCoinsId(5)).thenReturn(null);
        Coins test = sut.getCoinsById(coinId);
        assertEquals(null, test);
    }
}