package br.com.timesheetcollector.interfaces;

import br.com.timesheetcollector.entidades.Colaborador;
import br.com.timesheetcollector.negocio.excecoes.colaborador.ColaboradorInvalidoException;
import br.com.timesheetcollector.negocio.excecoes.colaborador.ColaboradorNaoCadastradoException;

/**
 * Created by eric.silva on 03/05/2016.
 */
public interface RepositorioColaborador {
    void inserir(Colaborador c);

    Colaborador procurar(String codigo) throws ColaboradorInvalidoException, ColaboradorNaoCadastradoException;

    void remover(String codigo) throws ColaboradorNaoCadastradoException;

    boolean existe(String codigo) throws ColaboradorNaoCadastradoException;

    void atualizar(Colaborador c) throws ColaboradorInvalidoException, ColaboradorNaoCadastradoException;
}
