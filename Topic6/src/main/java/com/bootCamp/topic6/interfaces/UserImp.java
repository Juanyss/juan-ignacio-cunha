package com.bootCamp.topic6.interfaces;

import com.bootCamp.topic6.domain.User;

import java.util.List;

public interface UserImp {
    public List<User> findAll();
    public User findOne(String mail);
    public boolean save(User user);
    public void deleteById(String mail);
    public void updateUser(String mail,String password, String name, String lastName);

}
