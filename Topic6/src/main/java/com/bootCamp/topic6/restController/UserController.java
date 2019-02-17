package com.bootCamp.topic6.restController;

import com.bootCamp.topic6.domain.User;
import com.bootCamp.topic6.repositories.UserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Roots
    @ApiOperation("Show all users")
    @GetMapping("")
    public List<User> showAllUsers(){
        return this.userRepository.findAll();
    }

    @ApiOperation("Show 1 user via mail")
    @GetMapping("/{mail}")
    public User showOneUser(@PathVariable("mail") String mail){
        return this.userRepository.findOne(mail);
    }

    @ApiOperation("Create a new user")
    @PostMapping("/newUser")
    public void NewUser(@RequestBody User user){
        this.userRepository.save(user);
    }

    @ApiOperation("Delete one user")
    @DeleteMapping("/deleteUser/{mail}")
    public void deleteUser(@PathVariable("mail") String mail){
        this.userRepository.deleteById(mail);
    }

    @PostMapping("/updateUser/{id}")
    public void updateUser(@PathVariable("mail") String mail,@RequestBody String password, String name,
                           String lastName){
        User updateUser = this.userRepository.findOne(mail);
        this.userRepository.updateUser(updateUser.getMail(),password,name,lastName);
    }




}
