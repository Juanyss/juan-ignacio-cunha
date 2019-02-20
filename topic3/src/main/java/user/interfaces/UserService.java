package user.interfaces;

import user.domain.User;

import java.util.List;

public interface UserService {

    /**
     * Find all users.
     */
    public List<User> findAll();

    /**
     * Find user via mail.
     * @Param mail
     */
    public User findOne(String mail);

    /**
     * Creates a new user.
     * @param user
     */
    public boolean save(User user);

    /**
     * Delete a user via mail.
     * @param mail
     */
    public void deleteById(String mail);

    /**
     * Update  user data.
     * @param mail
     * @param password
     * @param name
     * @param lastName
     */
    public void updateUserData(String mail,String password, String name, String lastName);

}
