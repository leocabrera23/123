package rcpya.demo.repositories;

import org.springframework.data.jpa.repository.Query;

import rcpya.demo.models.Call;

import java.util.List;

public interface CallRepo {
    @Query(value = "SELECT * From calls", nativeQuery = true)
    List<Call> findAll();
}
