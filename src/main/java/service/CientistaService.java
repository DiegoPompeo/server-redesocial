package service;

import model.Cientista;

import java.util.List;

public interface CientistaService {
    List<Cientista> listar();
    Cientista listarId(int id);
    Cientista add(Cientista p);
    Cientista edit(Cientista p);
    void delete(int id);
    Cientista findNome(String nome);
    boolean findByEmail(String email);
}
