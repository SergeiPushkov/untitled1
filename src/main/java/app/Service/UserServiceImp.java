package app.Service;

import app.Dao.UserDaoImp;
import app.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImp implements UserService{

    private final UserDaoImp userDaoImp;
    @Autowired
    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }


    @Override
    public void createUsers(User user) {
        userDaoImp.createUsers(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoImp.getAllUsers();
    }

    @Override
    public User getUsers(Long id) {
        return userDaoImp.getUsers(id);
    }

    @Override
    public void deleteUsers(Long id) {
        userDaoImp.deleteUsers(id);
    }

    @Override
    public void updateUser(User user) {
        userDaoImp.updateUser(user);
    }
}
