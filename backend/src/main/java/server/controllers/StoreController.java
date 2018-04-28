package server.controllers;

import javax.validation.Valid;
import server.models.Store;
import server.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class StoreController{
    @Autowired
    StoreRepository storeRepository;

    @GetMapping("/store")
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @PostMapping("/store")
    public Store createStore(@Valid @RequestBody Store store) {
        return storeRepository.save(store);
    }

    @GetMapping(value="/store/{id}")
    public Store getStoreById(@PathVariable("id") Integer id) {
        return storeRepository.findByStoreId(id);
    }

    @PutMapping(value="/store/{id}")
    public Store updateStore(@PathVariable("id") Integer id,
                                           @Valid @RequestBody Store store) {
        Store storeData = storeRepository.findByStoreId(id);

        storeData.setStudent_id(store.getStudent_id());
        storeData.setItem1_purchased(store.getItem1_purchased());

        Store updatedStore = storeRepository.save(storeData);
        return updatedStore;
    }

    @DeleteMapping(value="/store/{id}")
    public Store deleteStore(@PathVariable("id") Integer id) {
        return storeRepository.deleteByStoreId(id);
    }
}
