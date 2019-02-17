package com.bootCamp.topic6.implementations;

import com.bootCamp.topic6.domain.User;
import com.bootCamp.topic6.interfaces.UserImp;
import com.bootCamp.topic6.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserImp {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll(){
        return this.userRepository.findAll();
    }

    @Override
    public User findOne(String mail){
        return this.userRepository.findOne(mail);
    }

    @Override
    public boolean save(User user){
        User u = new User();
        u.setMail(user.getMail());
        u.setPassword(user.getPassword());
        u.setName(user.getName());
        u.setLastName(user.getLastName());
        this.userRepository.save(u);
        return true;
    }

    @Override
    public void deleteById(String mail){
        this.userRepository.deleteById(mail);
    }

    @Override
    public void updateUserData(String mail, String password, String name, String lastName){
        this.userRepository.updateUserData(mail, password, name, lastName);
    }


}
