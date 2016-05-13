package br.com.timesheetcollector.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by eric.silva on 02/05/2016.
 */

@Entity
@Table(name = "tb_perfil_colaborador", schema = "public")
public class PerfilColaborador implements Serializable {

    @Id
    @Column(name = "CODIGO", unique = true)
    private String codigo;

    @Column(name = "DESCRICAO", unique = true)
    private String descricao;

    @Column(name = "CD_PERMISSOES")
    private String cdPermissoes;

    public PerfilColaborador() {
    }

    public PerfilColaborador(String codigo, String descricao, String cdPermissoes) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cdPermissoes = cdPermissoes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCdPermissoes() {
        return cdPermissoes;
    }

    public void setCdPermissoes(String cdPermissoes) {
        this.cdPermissoes = cdPermissoes;
    }

    @Override
    public String toString(){
        return "Perfil colaborador: c�digo "+this.codigo+ ", descri��o "+this.descricao+ ", c�digo de permiss�es "+this.cdPermissoes+" ]";
    }
}
