package user.implementation;

import user.domain.User;
import user.interfaces.UserService;

import java.util.List;


public class UserServiceImp implements UserService {

    @Override
    public List<User> findAll() {
        return this.findAll();
    }

    @Override
    public User findOne(String mail) {
        return this.findOne(mail);
    }

    @Override
    public boolean save(User user) {
        User u = new User();
        u.setMail(user.getMail());
        u.setPassword(user.getPassword());
        u.setName(user.getName());
        u.setLastName(user.getLastName());
        this.save(u);
        return true;
    }

    @Override
    public void deleteById(String mail) {
        this.deleteById(mail);
    }

    @Override
    public void updateUserData(String mail, String password, String name, String lastName) {
        this.updateUserData(mail, password, name, lastName);
    }
}
