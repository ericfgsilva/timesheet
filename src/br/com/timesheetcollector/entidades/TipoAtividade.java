package br.com.timesheetcollector.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by eric.silva on 02/05/2016.
 */

@Entity
@Table(name = "tb_tipo_atividade", schema = "public")
public class tipoAtividade implements Serializable {

    @Id
    @Column(name = "CODIGO", unique = true)
    private String codigo;

    @Column(name = "DESCRICAO")
    private String descricao;

    public tipoAtividade() {
    }

    public tipoAtividade(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "Tipo atividade: [codigo " + this.codigo + ", descri��o " + this.descricao + "]";
    }
}
