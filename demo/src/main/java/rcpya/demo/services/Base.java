package rcpya.demo.services;

import org.springframework.stereotype.Service;

import java.util.List;

public interface Base<E>{
    List<E> findAll() throws Exception;
    E findById(long id) throws Exception;
    E saveOne(E entity) throws Exception;
    E updateOne(E entity, long id) throws Exception;
    boolean deleteById(long id) throws Exception;
}
