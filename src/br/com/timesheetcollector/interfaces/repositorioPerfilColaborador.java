package br.com.timesheetcollector.interfaces;

import br.com.timesheetcollector.entidades.PerfilColaborador;
import br.com.timesheetcollector.negocio.excecoes.perfilColaborador.PerfilColaboradorInvalidoException;
import br.com.timesheetcollector.negocio.excecoes.perfilColaborador.PerfilColaboradorNaoCadastradoException;

/**
 * Created by eric.silva on 03/05/2016.
 */
public interface RepositorioPerfilColaborador {
    void inserir(PerfilColaborador pc);

    PerfilColaborador procurar(String codigo) throws PerfilColaboradorInvalidoException, PerfilColaboradorNaoCadastradoException;

    void remover(String codigo) throws PerfilColaboradorNaoCadastradoException;

    boolean existe(String codigo) throws PerfilColaboradorNaoCadastradoException;

    void atualizar(PerfilColaborador pc) throws PerfilColaboradorInvalidoException, PerfilColaboradorNaoCadastradoException;
}
