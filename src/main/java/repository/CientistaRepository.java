package repository;

import model.Cientista;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CientistaRepository extends Repository<Cientista, Integer> {
    List<Cientista> findAll();
    Cientista findById(int id);
    Cientista save(Cientista pessoa);
    void delete(Cientista pessoa);
    Cientista findByNome(String nome);
    boolean findByEmail(String email);
}
