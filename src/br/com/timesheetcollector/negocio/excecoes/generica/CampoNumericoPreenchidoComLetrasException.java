package br.com.timesheetcollector.negocio.excecoes.generica;

public class CampoNumericoPreenchidoComLetrasException extends Exception {

	private static final long serialVersionUID = -2532340426764743374L;

	public CampoNumericoPreenchidoComLetrasException(String mensagem) {
		super(mensagem);
	}
	
}
