package com.bootCamp.topic6.restController;

import com.bootCamp.topic6.domain.User;
import com.bootCamp.topic6.implementations.UserService;
import com.bootCamp.topic6.repositories.UserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Roots
    @ApiOperation("Show all users")
    @GetMapping("/")
    public List<User> showAllUsers(){
        return this.userService.findAll();
    }

    @ApiOperation("Show 1 user via mail")
    @GetMapping("/{mail}")
    public User showOneUser(@PathVariable("mail") String mail){
        return this.userService.findOne(mail);
    }

    @ApiOperation("Create a new user")
    @PostMapping("/newUser")
    public void NewUser(@RequestBody User user){
        this.userService.save(user);
    }

    @ApiOperation("Delete one user")
    @DeleteMapping("/deleteUser/{mail}")
    public void deleteUser(@PathVariable("mail") String mail){
        this.userService.deleteById(mail);
    }

    @ApiOperation("Update user data")
    @PostMapping("/updateUserData/{mail}")
    public void updateUser(@PathVariable("mail") String mail,@RequestBody User user){
        this.userService.updateUserData(mail,user.getPassword(),user.getName(),user.getLastName());
    }




}
