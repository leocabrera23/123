package rcpya.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import rcpya.demo.models.Call;
import rcpya.demo.models.Call;

import rcpya.demo.repositories.CallRepo;


import java.util.List;

public class CallServices implements Base<Call>{

    @Autowired(required = false)
    private CallRepo repositorio;

    @Override
    @Transactional
    public List<Call> findAll() throws Exception {
        try {
            List<Call> entities = this.repositorio.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Call findById(long id) throws Exception {
        return null;
    }

    @Override
    public Call saveOne(Call entity) throws Exception {
        return null;
    }

    @Override
    public Call updateOne(Call entity, long id) throws Exception {
        return null;
    }

    @Override
    public boolean deleteById(long id) throws Exception {
        return false;
    }
}
