package rcpya.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="users")
public class User {
    @Id
    private int dni;

    private String email;

    @OneToMany(mappedBy = "user")
    private List<Call> calls;
}
