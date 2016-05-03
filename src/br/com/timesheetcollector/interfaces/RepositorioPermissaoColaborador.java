package br.com.timesheetcollector.interfaces;

import br.com.timesheetcollector.entidades.PermissaoColaborador;
import br.com.timesheetcollector.negocio.excecoes.permissaoColaborador.PermissaoColaboradorInvalidaException;
import br.com.timesheetcollector.negocio.excecoes.permissaoColaborador.PermissaoColaboradorNaoCadastradaException;

/**
 * Created by eric.silva on 03/05/2016.
 */
public interface RepositorioPermissaoColaborador {
    void inserir(PermissaoColaborador prc);

    PermissaoColaborador procurar(String codigo) throws PermissaoColaboradorInvalidaException, PermissaoColaboradorNaoCadastradaException;

    void remover(String codigo) throws PermissaoColaboradorNaoCadastradaException;

    boolean existe(String codigo) throws PermissaoColaboradorNaoCadastradaException;

    void atualizar(PermissaoColaborador prc) throws PermissaoColaboradorInvalidaException, PermissaoColaboradorNaoCadastradaException;
}
