package controler;

import model.ModelEstabelecimento;
import DAO.DAOEstabelecimento;
import java.util.ArrayList;

/**
 *
 * @author Renan Acosta
 */
public class ControllerEstabelecimento {

	private DAOEstabelecimento daoEstabelecimento = new DAOEstabelecimento();

	/**
	 * grava Estabelecimento
	 * 
	 * @param pModelEstabelecimento
	 *            return int
	 */
	public int salvarEstabelecimentoController(ModelEstabelecimento ModelEstabelecimento) {
		return this.daoEstabelecimento.salvarEstabelecimentoDAO(ModelEstabelecimento);
	}

	/**
	 * recupera Estabelecimento
	 * 
	 * @param Int
	 *            return ModelEstabelecimento
	 */
	public ModelEstabelecimento getEstabelecimentoController(int Int) {
		return this.daoEstabelecimento.getEstabelecimentoDAO(Int);
	}

	/**
	 * recupera uma lista deEstabelecimento
	 * 
	 * @param Int
	 *            return ArrayList
	 */
	public ArrayList<ModelEstabelecimento> getListaEstabelecimentoController() {
		return this.daoEstabelecimento.getListaEstabelecimentoDAO();
	}

	/**
	 * atualiza Estabelecimento
	 * 
	 * @param ModelEstabelecimento
	 *            return boolean
	 */
	public boolean atualizarEstabelecimentoController(ModelEstabelecimento ModelEstabelecimento) {
		return this.daoEstabelecimento.atualizarEstabelecimentoDAO(ModelEstabelecimento);
	}

	/**
	 * exclui Estabelecimento
	 * 
	 * @param Int
	 *            return boolean
	 */
	public boolean excluirEstabelecimentoController(int Int) {
		return this.daoEstabelecimento.excluirEstabelecimentoDAO(Int);
	}
}