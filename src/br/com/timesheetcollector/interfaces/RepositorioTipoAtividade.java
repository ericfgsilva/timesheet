package br.com.timesheetcollector.interfaces;

import br.com.timesheetcollector.entidades.TipoAtividade;
import br.com.timesheetcollector.negocio.excecoes.tipoAtividade.TipoAtividadeInvalidoException;
import br.com.timesheetcollector.negocio.excecoes.tipoAtividade.TipoAtividadeNaoCadastradoException;

/**
 * Created by eric.silva on 03/05/2016.
 */
public interface RepositorioTipoAtividade {
    void inserir(TipoAtividade ta);

    TipoAtividade procurar(String codigo) throws TipoAtividadeInvalidoException, TipoAtividadeNaoCadastradoException;

    void remover(String codigo) throws TipoAtividadeNaoCadastradoException;

    boolean existe(String codigo) throws TipoAtividadeNaoCadastradoException;

    void atualizar(TipoAtividade ta) throws TipoAtividadeInvalidoException, TipoAtividadeNaoCadastradoException;
}
