package com.bootCamp.finalProyect.interfaces;

import com.bootCamp.finalProyect.domain.User;
import java.util.List;

public interface UserImp {
    List<User> findAll();

    User findOne(Long id);

    boolean save(User user);

    void deleteById(Long id);

    void updateUserData(String mail, String password, String name, String lastName);

    User logIn(String mail,String password);
}
