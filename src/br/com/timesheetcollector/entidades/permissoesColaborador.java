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
@Table(name = "tb_permissoes_colaborador", schema = "public")
public class permissoesColaborador implements Serializable {

    @Id
    @Column(name = "CODIGO", unique = true)
    private String codigo;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "CRIAR")
    private boolean criar;

    @Column(name = "LER")
    private boolean ler;

    @Column(name = "ATUALIZAR")
    private boolean atualizar;

    @Column(name = "DELETAR")
    private boolean deletar;

    public permissoesColaborador(){
    }

    public permissoesColaborador(String codigo, String descricao, boolean criar, boolean ler, boolean atualizar, boolean deletar){
        this.codigo = codigo;
        this.descricao = descricao;
        this.criar = criar;
        this.ler = ler;
        this.atualizar = atualizar;
        this.deletar = deletar;
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

    public boolean isCriar() {
        return criar;
    }

    public void setCriar(boolean criar) {
        this.criar = criar;
    }

    public boolean isLer() {
        return ler;
    }

    public void setLer(boolean ler) {
        this.ler = ler;
    }

    public boolean isAtualizar() {
        return atualizar;
    }

    public void setAtualizar(boolean atualizar) {
        this.atualizar = atualizar;
    }

    public boolean isDeletar() {
        return deletar;
    }

    public void setDeletar(boolean deletar) {
        this.deletar = deletar;
    }

    @Override
    public String toString(){
        return "Permissão do colaborador: código "+this.codigo+ ", descrição "+this.descricao+ ", criar "+this.criar+ ", ler "+this.ler+ ", atualizar "+this.atualizar+ ", deletar " +this.deletar+ " ]";
    }
}
