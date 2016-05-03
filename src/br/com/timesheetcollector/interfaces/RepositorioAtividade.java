package br.com.timesheetcollector.interfaces;

import br.com.timesheetcollector.entidades.Atividade;
import br.com.timesheetcollector.negocio.excecoes.atividade.AtividadeInvalidaException;
import br.com.timesheetcollector.negocio.excecoes.atividade.AtividadeNaoCadastradaException;

/**
 * Created by eric.silva on 30/04/2016.
 */
public interface RepositorioAtividade {
    void inserir(Atividade a);
    Atividade procurar(String codigo) throws AtividadeInvalidaException, AtividadeNaoCadastradaException;
    void remover(String codigo) throws AtividadeNaoCadastradaException;
    boolean existe(String codigo) throws AtividadeNaoCadastradaException;
    void atualizar(Atividade a) throws AtividadeInvalidaException, AtividadeNaoCadastradaException;
}
