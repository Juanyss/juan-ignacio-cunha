package com.bootCamp.topic6.repositories;

import com.bootCamp.topic6.domain.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    List<User> findAll();

    @Query("select u from User u where u.mail = :mail")
    User findOne(@Param("mail") String mail);

    User save(User user);

    void deleteById(String mail);

    @Transactional
    @Modifying
    @Query("update User u set u.password = :password, u.name = :name, u.lastName = :lastName where u.mail = :mail")
    void updateUserData(@Param("mail") String mail,
                        @Param("password") String password,
                        @Param("name") String name,
                        @Param("lastName") String lastName);

}
