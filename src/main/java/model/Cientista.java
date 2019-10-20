package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Cientista {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String senha;

    @Column
    private String nroCartao;

    @Column
    private String nomeNoCartao;

    @Column
    private String dataValidade;

    @Column
    private String codSeg;

    @Column
    private String empresa;

    @Column
    private String qualidades;

    @Column
    private boolean paga;
}
