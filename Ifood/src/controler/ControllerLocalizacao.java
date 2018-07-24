package controler;

import java.util.ArrayList;
import DAO.DAOLocalizacao;
import model.ModelLocalizacao;

/**
 *
 * @author Renan Acosta
 */
public class ControllerLocalizacao {

	private DAOLocalizacao daoLocalizacao = new DAOLocalizacao();

	/**
	 * grava Localizacao
	 * 
	 * @param ModelLocalizacao
	 *            return int
	 */
	public int salvarLocalizacaoController(ModelLocalizacao ModelLocalizacao) {
		return this.daoLocalizacao.salvarLocalizacaoDAO(ModelLocalizacao);
	}

	/**
	 * recupera Localizacao
	 * 
	 * @param Int
	 *            return ModelLocalizacao
	 */
	public ModelLocalizacao getLocalizacaoController(int Int) {
		return this.daoLocalizacao.getLocalizacaoDAO(Int);
	}

	/**
	 * recupera uma lista deLocalizacao
	 * 
	 * @param Int
	 *            return ArrayList
	 */
	public ArrayList<ModelLocalizacao> getListaLocalizacaoController() {
		return this.daoLocalizacao.getListaLocalizacaoDAO();
	}

	/**
	 * atualiza Localizacao
	 * 
	 * @param ModelLocalizacao
	 *            return boolean
	 */
	public boolean atualizarLocalizacaoController(ModelLocalizacao pModelLocalizacao) {
		return this.daoLocalizacao.atualizarLocalizacaoDAO(pModelLocalizacao);
	}

	/**
	 * exclui Localizacao
	 * 
	 * @param Int
	 *            return boolean
	 */
	public boolean excluirLocalizacaoController(int Int) {
		return this.daoLocalizacao.excluirLocalizacaoDAO(Int);
	}
}