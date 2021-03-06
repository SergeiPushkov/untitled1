package app.Dao;

import app.Model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void createUsers(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u",User.class).getResultList();
    }

    @Override
    public User getUsers(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUsers(Long id) {
        entityManager.remove(getUsers(id));

    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }
}
