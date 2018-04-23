package server.controllers;

import javax.validation.Valid;
import server.models.Coins;
import server.repositories.CoinsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CoinsController{
    @Autowired
    CoinsRepository coinsRepository;

    @GetMapping("/coins")
    public List<Coins> getAllCoins() {
        return coinsRepository.findAll();
    }

    @PostMapping("/coins")
    public Coins createCoins(@Valid @RequestBody Coins coins) {
        return coinsRepository.save(coins);
    }

    @GetMapping(value="/coins/{id}")
    public Coins getCoinsById(@PathVariable("id") Integer id) {
        return coinsRepository.findByCoinsId(id);
    }

    @PutMapping(value="/coins/{id}")
    public Coins updateCoins(@PathVariable("id") Integer id,
                                           @Valid @RequestBody Coins coins) {
        Coins coinsData = coinsRepository.findByCoinsId(id);

        coinsData.setStudent_id(coins.getStudent_id());
        coinsData.setTotal_coins(coins.getTotal_coins());

        Coins updatedCoins = coinsRepository.save(coinsData);
        return updatedCoins;
    }

    @DeleteMapping(value="/coins/{id}")
    public Coins deleteCoins(@PathVariable("id") Integer id) {
        return coinsRepository.deleteByCoinsId(id);
    }
}
