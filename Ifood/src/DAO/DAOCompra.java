package DAO;

import java.util.ArrayList;
import conexao.ConexaoPostgre;
import model.ModelCompra;

/**
 *
 * @author Renan Acosta
 */
public class DAOCompra extends ConexaoPostgre {

	/**
	 * grava Compra
	 * 
	 * @param ModelCompra
	 *            return int
	 */
	public int salvarCompraDAO(ModelCompra ModelCompra) {
		try {
			this.conectar();
			return this.insertSQL("INSERT INTO Compra (" + "id_pk," + "valor" + ") VALUES (" + "'" + ModelCompra.getId()
					+ "'," + "'" + ModelCompra.getValor() + "'" + ");");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * recupera Compra
	 * 
	 * @param Id
	 *            return ModelCompra
	 */
	public ModelCompra getCompraDAO(int Id) {
		ModelCompra modelCompra = new ModelCompra();
		try {
			this.conectar();
			this.executarSQL(
					"SELECT " + "id_pk," + "valor" + " FROM" + " Compra" + " WHERE" + " id_pk = '" + Id + "'" + ";");

			while (this.getResultSet().next()) {
				modelCompra.setId(this.getResultSet().getInt(1));
				modelCompra.setValor(this.getResultSet().getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return modelCompra;
	}

	/**
	 * recupera uma lista de Compra return ArrayList
	 */
	public ArrayList<ModelCompra> getListaCompraDAO() {
		ArrayList<ModelCompra> listamodelCompra = new ArrayList<>();
		ModelCompra modelCompra = new ModelCompra();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "id_pk," + "valor" + " FROM" + " Compra" + ";");

			while (this.getResultSet().next()) {
				modelCompra = new ModelCompra();
				modelCompra.setId(this.getResultSet().getInt(1));
				modelCompra.setValor(this.getResultSet().getString(2));
				listamodelCompra.add(modelCompra);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return listamodelCompra;
	}

	/**
	 * atualiza Compra
	 * 
	 * @param ModelCompra
	 *            return boolean
	 */
	public boolean atualizarCompraDAO(ModelCompra ModelCompra) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL(
					"UPDATE Compra SET " + "id_pk = '" + ModelCompra.getId() + "'," + "valor = '"
							+ ModelCompra.getValor() + "'" + " WHERE " + "id_pk = '" + ModelCompra.getId() + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * exclui Compra
	 * 
	 * @param Id
	 *            return boolean
	 */
	public boolean excluirCompraDAO(int Id) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL("DELETE FROM Compra " + " WHERE " + "id_pk = '" + Id + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}
}