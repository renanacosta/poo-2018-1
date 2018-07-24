package controler;

import model.ModelCardapio;
import DAO.DAOCardapio;
import java.util.ArrayList;

/**
 *
 * @author Renan Acosta
 */
public class ControllerCardapio {

	private DAOCardapio daoCardapio = new DAOCardapio();

	/**
	 * grava Cardapio
	 * 
	 * @param pModelCardapio
	 *            return int
	 */
	public int salvarCardapioController(ModelCardapio ModelCardapio) {
		return this.daoCardapio.salvarCardapioDAO(ModelCardapio);
	}

	/**
	 * recupera Cardapio
	 * 
	 * @param TiposDeProduto
	 *            return ModelCardapio
	 */
	public ModelCardapio getCardapioController(String TiposDeProduto) {
		return this.daoCardapio.getCardapioDAO(TiposDeProduto);
	}

	/**
	 * recupera uma lista deCardapio
	 * 
	 * @param TiposDeProduto
	 *            return ArrayList
	 */
	public ArrayList<ModelCardapio> getListaCardapioController() {
		return this.daoCardapio.getListaCardapioDAO();
	}

	/**
	 * atualiza Cardapio
	 * 
	 * @param ModelCardapio
	 *            return boolean
	 */
	public boolean atualizarCardapioController(ModelCardapio ModelCardapio) {
		return this.daoCardapio.atualizarCardapioDAO(ModelCardapio);
	}

	/**
	 * exclui Cardapio
	 * 
	 * @param TiposDeProduto
	 *            return boolean
	 */
	public boolean excluirCardapioController(String TiposDeProduto) {
		return this.daoCardapio.excluirCardapioDAO(TiposDeProduto);
	}
}