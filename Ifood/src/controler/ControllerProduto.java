package controler;

import model.ModelProduto;
import DAO.DAOProduto;
import java.util.ArrayList;

/**
 *
 * @author Renan Acosta
 */
public class ControllerProduto {

	private DAOProduto daoProduto = new DAOProduto();

	/**
	 * grava Produto
	 * 
	 * @param ModelProduto
	 *            return int
	 */
	public int salvarProdutoController(ModelProduto ModelProduto) {
		return this.daoProduto.salvarProdutoDAO(ModelProduto);
	}

	/**
	 * recupera Produto
	 * 
	 * @param Id
	 *            return ModelProduto
	 */
	public ModelProduto getProdutoController(int Id) {
		return this.daoProduto.getProdutoDAO(Id);
	}

	/**
	 * recupera uma lista deProduto
	 * 
	 * @param Id
	 *            return ArrayList
	 */
	public ArrayList<ModelProduto> getListaProdutoController() {
		return this.daoProduto.getListaProdutoDAO();
	}

	/**
	 * atualiza Produto
	 * 
	 * @param ModelProduto
	 *            return boolean
	 */
	public boolean atualizarProdutoController(ModelProduto ModelProduto) {
		return this.daoProduto.atualizarProdutoDAO(ModelProduto);
	}

	/**
	 * exclui Produto
	 * 
	 * @param Id
	 *            return boolean
	 */
	public boolean excluirProdutoController(int Id) {
		return this.daoProduto.excluirProdutoDAO(Id);
	}
}