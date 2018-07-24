package DAO;

import java.util.ArrayList;
import conexao.ConexaoPostgre;
import model.ModelCardapio;

/**
 *
 * @author Renan Acosta
 */
public class DAOCardapio extends ConexaoPostgre {

	/**
	 * grava Cardapio
	 * 
	 * @param ModelCardapio
	 *            return int
	 */
	public int salvarCardapioDAO(ModelCardapio ModelCardapio) {
		try {
			this.conectar();
			return this.insertSQL("INSERT INTO Cardapio (" + "pk__tipos_de_produto" + ") VALUES (" + "'"
					+ ModelCardapio.getTiposDeProduto() + "'" + ");");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * recupera Cardapio
	 * 
	 * @param TiposDeProduto
	 *            return ModelCardapio
	 */
	public ModelCardapio getCardapioDAO(String TiposDeProduto) {
		ModelCardapio modelCardapio = new ModelCardapio();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "pk__tipos_de_produto" + " FROM" + " Cardapio" + " WHERE"
					+ " pk__tipos_de_produto = '" + TiposDeProduto + "'" + ";");

			while (this.getResultSet().next()) {
				modelCardapio.setTiposDeProduto(this.getResultSet().getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return modelCardapio;
	}

	/**
	 * recupera uma lista de Cardapio return ArrayList
	 */
	public ArrayList<ModelCardapio> getListaCardapioDAO() {
		ArrayList<ModelCardapio> listamodelCardapio = new ArrayList<>();
		ModelCardapio modelCardapio = new ModelCardapio();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "pk__tipos_de_produto" + " FROM" + " Cardapio" + ";");

			while (this.getResultSet().next()) {
				modelCardapio = new ModelCardapio();
				modelCardapio.setTiposDeProduto(this.getResultSet().getString(1));
				listamodelCardapio.add(modelCardapio);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return listamodelCardapio;
	}

	/**
	 * atualiza Cardapio
	 * 
	 * @param ModelCardapio
	 *            return boolean
	 */
	public boolean atualizarCardapioDAO(ModelCardapio ModelCardapio) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL(
					"UPDATE Cardapio SET " + "pk__tipos_de_produto = '" + ModelCardapio.getTiposDeProduto() + "'"
							+ " WHERE " + "pk__tipos_de_produto = '" + ModelCardapio.getTiposDeProduto() + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * exclui Cardapio
	 * 
	 * @param TiposDeProduto
	 *            return boolean
	 */
	public boolean excluirCardapioDAO(String TiposDeProduto) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL(
					"DELETE FROM Cardapio " + " WHERE " + "pk__tipos_de_produto = '" + TiposDeProduto + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}
}