package controler;

import java.util.ArrayList;
import DAO.DAOAplicativo;
import model.ModelAplicativo;

/**
 *
 * @author Renan Acosta
 */
public class ControllerAplicativo {

	private DAOAplicativo daoAplicativo = new DAOAplicativo();

	/**
	 * grava Aplicativo
	 * 
	 * @param ModelAplicativo
	 *            return int
	 */
	public int salvarAplicativoController(ModelAplicativo ModelAplicativo) {
		return this.daoAplicativo.salvarAplicativoDAO(ModelAplicativo);
	}

	/**
	 * recupera Aplicativo
	 * 
	 * @param Nome
	 *            return ModelAplicativo
	 */
	public ModelAplicativo getAplicativoController(String Nome) {
		return this.daoAplicativo.getAplicativoDAO(Nome);
	}

	/**
	 * recupera uma lista deAplicativo
	 * 
	 * @param Nome
	 *            return ArrayList
	 */
	public ArrayList<ModelAplicativo> getListaAplicativoController() {
		return this.daoAplicativo.getListaAplicativoDAO();
	}

	/**
	 * atualiza Aplicativo
	 * 
	 * @param ModelAplicativo
	 *            return boolean
	 */
	public boolean atualizarAplicativoController(ModelAplicativo ModelAplicativo) {
		return this.daoAplicativo.atualizarAplicativoDAO(ModelAplicativo);
	}

	/**
	 * exclui Aplicativo
	 * 
	 * @param Nome
	 *            return boolean
	 */
	public boolean excluirAplicativoController(String Nome) {
		return this.daoAplicativo.excluirAplicativoDAO(Nome);
	}
}