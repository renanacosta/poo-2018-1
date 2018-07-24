package DAO;

import java.util.ArrayList;
import conexao.ConexaoPostgre;
import model.ModelUsuario;

/**
 *
 * @author Renan Acosta
 */
public class DAOUsuario extends ConexaoPostgre {

	/**
	 * grava Usuario
	 * 
	 * @param pModelUsuario
	 *            return int
	 */
	public int salvarUsuarioDAO(ModelUsuario ModelUsuario) {
		try {
			this.conectar();
			return this.insertSQL(
					"INSERT INTO Usuario (" + "pk_int," + "nome," + "email" + ") VALUES (" + "'" + ModelUsuario.getId()
							+ "'," + "'" + ModelUsuario.getNome() + "'," + "'" + ModelUsuario.getEmail() + "'" + ");");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * recupera Usuario
	 * 
	 * @param pInt
	 *            return ModelUsuario
	 */
	public ModelUsuario getUsuarioDAO(int id) {
		ModelUsuario modelUsuario = new ModelUsuario();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "id_pk," + "nome," + "email" + " FROM" + " Usuario" + " WHERE" + " pk_id = '"
					+ id + "'" + ";");

			while (this.getResultSet().next()) {
				modelUsuario.setId(this.getResultSet().getInt(1));
				modelUsuario.setNome(this.getResultSet().getString(2));
				modelUsuario.setEmail(this.getResultSet().getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return modelUsuario;
	}

	/**
	 * recupera uma lista de Usuario return ArrayList
	 */
	public ArrayList<ModelUsuario> getListaUsuarioDAO() {
		ArrayList<ModelUsuario> listamodelUsuario = new ArrayList<>();
		ModelUsuario modelUsuario = new ModelUsuario();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "id_pk," + "nome," + "email" + " FROM" + " Usuario" + ";");

			while (this.getResultSet().next()) {
				modelUsuario = new ModelUsuario();
				modelUsuario.setId(this.getResultSet().getInt(1));
				modelUsuario.setNome(this.getResultSet().getString(2));
				modelUsuario.setEmail(this.getResultSet().getString(3));
				listamodelUsuario.add(modelUsuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return listamodelUsuario;
	}

	/**
	 * atualiza Usuario
	 * 
	 * @param pModelUsuario
	 *            return boolean
	 */
	public boolean atualizarUsuarioDAO(ModelUsuario ModelUsuario) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL("UPDATE Usuario SET " + "id_pk = '" + ModelUsuario.getId() + "',"
					+ "nome = '" + ModelUsuario.getNome() + "'," + "email = '" + ModelUsuario.getEmail() + "'"
					+ " WHERE " + "id_pk = '" + ModelUsuario.getId() + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * exclui Usuario
	 * 
	 * @param pInt
	 *            return boolean
	 */
	public boolean excluirUsuarioDAO(int Id) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL("DELETE FROM Usuario " + " WHERE " + "pk_id = '" + Id + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}

	public static void save(ModelUsuario usuario2) {
		// TODO Auto-generated method stub

	}
}