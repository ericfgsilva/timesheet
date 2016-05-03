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

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "CD_TIPO")
    private String cdTipo;

    @Column(name = "CD_PROJETO")
    private String cdProjeto;

    @Column(name = "CD_CLIENTE")
    private String cdCliente;

    @Column(name = "CD_CRIADOR")
    private String cdCriador;

    @Column(name = "CD_DONO")
    private String cdDono;

    public Atividade(){
    }

    public Atividade(String codigo, String titulo, String descricao, String cdTipo, String cdProjeto, String cdCliente, String cdCriador, String cdDono) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.cdTipo = cdTipo;
        this.cdProjeto = cdProjeto;
        this.cdCliente = cdCliente;
        this.cdCriador = cdCriador;
        this.cdDono = cdDono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCdTipo() {
        return cdTipo;
    }

    public void setCdTipo(String cdTipo) {
        this.cdTipo = cdTipo;
    }

    public String getCdProjeto() {
        return cdProjeto;
    }

    public void setCdProjeto(String cdProjeto) {
        this.cdProjeto = cdProjeto;
    }

    public String getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(String cdCliente) {
        this.cdCliente = cdCliente;
    }

    public String getCdCriador() {
        return cdCriador;
    }

    public void setCdCriador(String cdCriador) {
        this.cdCriador = cdCriador;
    }

    public String getCdDono() {
        return cdDono;
    }

    public void setCdDono(String cdDono) {
        this.cdDono = cdDono;
    }

    @Override
    public String toString(){
        return "Atividade: [Código " + this.codigo + ", Nome " + this.titulo + ", Descrição " + this.descricao + ", tipoAtividade " + this.cdTipo +
                ", Projeto " + this.cdProjeto + ", Cliente " + this.cdCliente + ", Criador " + this.cdCriador + ", Dono " + this.cdDono + "]";
    }
}
