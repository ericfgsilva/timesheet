package br.com.timesheetcollector.entidades;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by eric.silva on 30/04/2016.
 */

@Entity
@Table(name="tb_atividade", schema="public")
public class Atividade implements Serializable{

    @Id
    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "TIPO")
    private String tipo;

    public Atividade(){
    }

    public Atividade(String codigo, String nome, String tipo){
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Atividade: [Código " +this.codigo + ", Nome " +this.nome + " Tipo " +this.tipo + "]";
    }
}
