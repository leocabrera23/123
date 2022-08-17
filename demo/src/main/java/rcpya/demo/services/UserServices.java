package rcpya.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rcpya.demo.models.User;
import rcpya.demo.repositories.UserRepo;

import java.util.List;


@Service
public class UserServices implements Base<User>{
    @Autowired(required = false)
    private UserRepo repositorio;

    @Override
    @Transactional
    public List<User> findAll() throws Exception {
        try {
            List<User> entities = this.repositorio.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public User findById(long id) throws Exception {
        return null;
    }

    @Override
    public User saveOne(User entity) throws Exception {
        return null;
    }

    @Override
    public User updateOne(User entity, long id) throws Exception {
        return null;
    }

    @Override
    public boolean deleteById(long id) throws Exception {
        return false;
    }
}
