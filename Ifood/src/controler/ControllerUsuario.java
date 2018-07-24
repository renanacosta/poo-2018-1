package controler;

import java.util.ArrayList;
import DAO.DAOUsuario;
import model.ModelUsuario;

/**
 *
 * @author Renan Acosta
 */
public class ControllerUsuario {

	private DAOUsuario daoUsuario = new DAOUsuario();

	/**
	 * grava Usuario
	 * 
	 * @param ModelUsuario
	 *            return int
	 */
	public int salvarUsuarioController(ModelUsuario ModelUsuario) {
		return this.daoUsuario.salvarUsuarioDAO(ModelUsuario);
	}

	/**
	 * recupera Usuario
	 * 
	 * @param Int
	 *            return ModelUsuario
	 */
	public ModelUsuario getUsuarioController(int Int) {
		return this.daoUsuario.getUsuarioDAO(Int);
	}

	/**
	 * recupera uma lista deUsuario
	 * 
	 * @param Int
	 *            return ArrayList
	 */
	public ArrayList<ModelUsuario> getListaUsuarioController() {
		return this.daoUsuario.getListaUsuarioDAO();
	}

	/**
	 * atualiza Usuario
	 * 
	 * @param pModelUsuario
	 *            return boolean
	 */
	public boolean atualizarUsuarioController(ModelUsuario ModelUsuario) {
		return this.daoUsuario.atualizarUsuarioDAO(ModelUsuario);
	}

	/**
	 * exclui Usuario
	 * 
	 * @param Int
	 *            return boolean
	 */
	public boolean excluirUsuarioController(int Int) {
		return this.daoUsuario.excluirUsuarioDAO(Int);
	}
}