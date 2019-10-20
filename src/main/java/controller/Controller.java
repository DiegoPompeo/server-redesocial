package controller;

import model.Cientista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CientistaService;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class Controller {
    @Autowired
    CientistaService service;

    @GetMapping("")
    public List<Cientista> lista(){
        return service.listar();
    }

    @PostMapping("/signup")
    public Cientista adiciona(@RequestBody Cientista cientista){
        return service.add(cientista);
    }

    @PostMapping("/login")
    public Cientista login(@RequestBody Cientista cientista){
        List<Cientista> lista = service.listar();
        String email = cientista.getEmail();
        String senha = cientista.getSenha();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getEmail().equals(email) && lista.get(i).getSenha().equals(senha)){
                cientista.setId(lista.get(i).getId());
                return cientista;
            }
        }
        return null;
    }

    @GetMapping("/email/{email}")
    public boolean verifica(@PathVariable("email") String email){
        List<Cientista> lista = service.listar();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    @GetMapping("/buscar/{email}")
    public Cientista busca(@PathVariable("email") String email){
        List<Cientista> lista = service.listar();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getEmail().equals(email)){
                return lista.get(i);
            }
        }
        return null;
    }

    @GetMapping("/{id}")
    public Cientista perfil(@PathVariable("id") int id){
        return service.listarId(id);
    }

    @PutMapping("/{id}")
    public Cientista editar(@RequestBody Cientista cientista, @PathVariable("id") int id){
        cientista.setId(id);
        return service.edit(cientista);
    }

}
