package br.com.timesheetcollector.negocio;

import br.com.timesheetcollector.entidades.Colaborador;
import br.com.timesheetcollector.interfaces.RepositorioColaborador;
import br.com.timesheetcollector.negocio.excecoes.colaborador.ColaboradorInvalidoException;
import br.com.timesheetcollector.negocio.excecoes.colaborador.ColaboradorJaCadastradoException;
import br.com.timesheetcollector.negocio.excecoes.colaborador.ColaboradorNaoCadastradoException;
import br.com.timesheetcollector.negocio.excecoes.generica.CampoNumericoPreenchidoComLetrasException;
import br.com.timesheetcollector.negocio.excecoes.generica.CampoObrigatorioNaoPreenchidoException;
import java.rmi.RemoteException;

public class CadastroColaborador {

	private RepositorioColaborador respositorioColaborador;

	public CadastroColaborador(RepositorioColaborador r) {
		this.respositorioColaborador = r;
	}
	
	public void atualizar(Colaborador c) throws ColaboradorNaoCadastradoException, CampoNumericoPreenchidoComLetrasException,
			CampoObrigatorioNaoPreenchidoException, ColaboradorInvalidoException, RemoteException {
		validar(c);
		respositorioColaborador.atualizar(c);
		
	}
	public void cadastrar(Colaborador c) throws ColaboradorJaCadastradoException, CampoNumericoPreenchidoComLetrasException,
			CampoObrigatorioNaoPreenchidoException, ColaboradorInvalidoException, ColaboradorNaoCadastradoException, RemoteException {
		if (!respositorioColaborador.existe(c.getCodigo())) {
			validar(c);
			respositorioColaborador.inserir(c);
		} else {  
			throw new ColaboradorJaCadastradoException("Colaborador já cadastrado !");
		}
	}

	public void descadastrar(String c) throws ColaboradorNaoCadastradoException, RemoteException {
		respositorioColaborador.remover(c);
	}
	public Colaborador procurar(String c) throws ColaboradorNaoCadastradoException, RemoteException, ColaboradorInvalidoException {
		return respositorioColaborador.procurar(c);
	}
	
	public void validar(Colaborador colaborador)
			throws CampoNumericoPreenchidoComLetrasException, 
				   CampoObrigatorioNaoPreenchidoException,
			ColaboradorInvalidoException {
		if (colaborador == null) {
			throw new ColaboradorInvalidoException("Colaborador não informado !");
		}
		colaborador.setNome(colaborador.getNome().toUpperCase());
		colaborador.setCodigo(colaborador.getCodigo().trim().replaceAll("[^\\d]+", ""));
		
		if (colaborador.getCodigo() == null || colaborador.getCodigo().isEmpty()) {
			throw new CampoObrigatorioNaoPreenchidoException("Favor informar o Código do Colaborador !");
		}
		if (colaborador.getCodigo().length() != 11 ) {
			throw new ColaboradorInvalidoException("Favor informar Código com 6 dígitos !");
		}
		if (colaborador.getNome() == null || colaborador.getNome().isEmpty()) {
			throw new CampoObrigatorioNaoPreenchidoException("Favor informar o nome do Colaborador !");
		}
	}
}