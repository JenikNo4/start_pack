package cz.simek.projectName.dao;

import cz.simek.projectName.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jenik on 31.1.17.
 */
@Transactional
public interface UserDao {

    User findById(Long id);

    User findByLogin(String login);

    void saveNew(User user);

    List<User> findAllUsers();

    void deleteUser(User user);

}
