package service;

import model.Cientista;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CientistaRepository;

import java.util.List;

public class CientistaServiceImp implements CientistaService{

    @Autowired
    private CientistaRepository repository;

    @Override
    public List<Cientista> listar() {
        return repository.findAll();
    }

    @Override
    public Cientista listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public Cientista add(Cientista c) {
        return repository.save(c);
    }

    @Override
    public Cientista edit(Cientista c) {
        return repository.save(c);
    }

    @Override
    public void delete(int id) {
        Cientista cientista = repository.findById(id);
        repository.delete(cientista);
    }

    @Override
    public Cientista findNome(String nome) {
        return repository.findByNome(nome);
    }


    @Override
    public boolean findByEmail(String email) {
        return repository.findByEmail(email);
    }

}
