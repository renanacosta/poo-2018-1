package controler;

import model.ModelCompra;
import DAO.DAOCompra;
import java.util.ArrayList;

/**
 *
 * @author Renan Acosta
 */
public class ControllerCompra {

	private DAOCompra daoCompra = new DAOCompra();

	/**
	 * grava Compra
	 * 
	 * @param pModelCompra
	 *            return int
	 */
	public int salvarCompraController(ModelCompra ModelCompra) {
		return this.daoCompra.salvarCompraDAO(ModelCompra);
	}

	/**
	 * recupera Compra
	 * 
	 * @param Id
	 *            return ModelCompra
	 */
	public ModelCompra getCompraController(int Id) {
		return this.daoCompra.getCompraDAO(Id);
	}

	/**
	 * recupera uma lista deCompra
	 * 
	 * @param pId
	 *            return ArrayList
	 */
	public ArrayList<ModelCompra> getListaCompraController() {
		return this.daoCompra.getListaCompraDAO();
	}

	/**
	 * atualiza Compra
	 * 
	 * @param ModelCompra
	 *            return boolean
	 */
	public boolean atualizarCompraController(ModelCompra ModelCompra) {
		return this.daoCompra.atualizarCompraDAO(ModelCompra);
	}

	/**
	 * exclui Compra
	 * 
	 * @param Id
	 *            return boolean
	 */
	public boolean excluirCompraController(int Id) {
		return this.daoCompra.excluirCompraDAO(Id);
	}
}