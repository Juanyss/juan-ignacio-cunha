package com.bootCamp.finalProyect.repositories;

import com.bootCamp.finalProyect.domain.ShoppingCart;
import com.bootCamp.finalProyect.domain.User;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();

    @Query("select u from User u where u.id = :id")
    User findOne(@Param("id") Long id);

    @Query("select u from User u where u.id = :id")
    boolean searchUser(@Param("id") Long id);

    User save(User user);

    void deleteById(Long id);

    @Transactional
    @Modifying
    @Query("update User u set u.password = :password, u.name = :name, u.lastName = :lastName where u.mail = :mail")
    void updateUserData(@Param("mail") String mail, @Param("password") String password, @Param("name") String name,
                        @Param("lastName") String lastName);

    @Transactional
    @Modifying
    @Query("update User u set u.shoppingCart = :shoppingCart where u.id = :id")
    void referenceShoppingCart(@Param("id") Long id, @Param("shoppingCart") Long shoppingCart);


    @Query("select u from User u where u.mail = :mail and u.password = :password")
    User logIn(@Param("mail") String mail, @Param("password") String password);
}
