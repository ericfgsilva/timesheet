package br.com.timesheetcollector.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by eric.silva on 02/05/2016.
 */
@Entity
@Table(name = "tb_colaborador", schema = "public")
public class Colaborador implements Serializable {

    @Id
    @Column(name = "CODIGO", unique = true)
    private String codigo;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CD_PERFIL")
    private String cdPerfil;

    private Colaborador(){
    }

    private Colaborador(String codigo, String nome, String email, String cdPerfil){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.cdPerfil = cdPerfil;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String cdPerfil() {
        return cdPerfil;
    }

    public void cdPerfil(String cdPerfil) {
        this.cdPerfil = cdPerfil;
    }

    @Override
    public String toString(){
        return "Colaborador: [ código " +this.codigo+ ", nome " +this.nome+ ", email " +this.email+ ", especialização " +this.cdPerfil+ "]";
    }
}
