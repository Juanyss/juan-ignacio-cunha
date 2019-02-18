package com.bootCamp.finalProyect.restControllers;

import com.bootCamp.finalProyect.domain.User;
import com.bootCamp.finalProyect.implementations.UserService;
import com.bootCamp.finalProyect.repositories.UserRepository;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/API/user"})
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("Show all users")
    @GetMapping("")
    public List<User> showAllUsers() {
        return this.userService.findAll();
    }

    @ApiOperation("Show 1 user via id")
    @GetMapping("/{id}")
    public User showOneUser(@PathVariable("id") Long id) {
        return this.userService.findOne(id);
    }

    @ApiOperation("Create a new user")
    @PostMapping("/newUser")
    public void NewUser(@RequestBody User user) {
        this.userService.save(user);
    }

    @ApiOperation("Delete one user by id")
    @DeleteMapping({"/deleteUser/{id}"})
    public void deleteUser(@PathVariable("id") Long id) {
        this.userService.deleteById(id);
    }

    @ApiOperation("Update user data")
    @PostMapping("/updateUserData/{mail}")
    public void updateUser(@PathVariable("mail") String mail, @RequestBody User user) {
        this.userService.updateUserData(mail, user.getPassword(), user.getName(), user.getLastName());
    }

    @ApiOperation("Return User data if mail and password are correct")
    @PostMapping("/logIn")
    public User logIn(@RequestBody User user){
        return this.userService.logIn(user.getMail(), user.getPassword());
    }


}
