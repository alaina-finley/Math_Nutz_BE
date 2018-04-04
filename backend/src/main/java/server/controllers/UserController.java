package server.controllers;

import javax.validation.Valid;
import server.models.User;
import server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController{
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(value="/users/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userRepository.findByUserId(id);
    }

    @PutMapping(value="/users/{id}")
    public User updateUser(@PathVariable("id") Integer id,
                                           @Valid @RequestBody User user) {
        User userData = userRepository.findByUserId(id);
        userData.setUsername(user.getUsername());
        userData.setPassword(user.getPassword());
        userData.setRole(user.getRole());
        User updatedUser = userRepository.save(userData);
        return updatedUser;
    }

    @DeleteMapping(value="/users/{id}")
    public User deleteUser(@PathVariable("id") Integer id) {
        return userRepository.deleteByUserId(id);
    }
}
