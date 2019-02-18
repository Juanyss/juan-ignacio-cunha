package com.bootCamp.finalProyect.implementations;

import com.bootCamp.finalProyect.domain.User;
import com.bootCamp.finalProyect.interfaces.UserImp;
import com.bootCamp.finalProyect.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserImp {
    @Autowired
    private UserRepository userRepository;

    public UserService() {
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User findOne(Long id) {
        return this.userRepository.findOne(id);
    }

    @Override
    public boolean save(User user) {
        User u = new User();
        u.setMail(user.getMail());
        u.setPassword(user.getPassword());
        u.setName(user.getName());
        u.setLastName(user.getLastName());
        this.userRepository.save(u);
        return true;
    }

    @Override
    public void deleteById(Long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public void updateUserData(String mail, String password, String name, String lastName) {
        this.userRepository.updateUserData(mail, password, name, lastName);
    }

    @Override
    public User logIn(String mail, String password) {
        return this.userRepository.logIn(mail, password);
    }
}
