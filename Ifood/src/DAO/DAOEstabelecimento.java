package DAO;

import java.util.ArrayList;
import conexao.ConexaoPostgre;
import model.ModelEstabelecimento;

/**
 *
 * @author Renan Acosta
 */
public class DAOEstabelecimento extends ConexaoPostgre {

	/**
	 * grava Estabelecimento
	 * 
	 * @param ModelEstabelecimento
	 *            return int
	 */
	public int salvarEstabelecimentoDAO(ModelEstabelecimento ModelEstabelecimento) {
		try {
			this.conectar();
			return this.insertSQL("INSERT INTO Estabelecimento (" + "id_pk," + "nome," + "descricao" + ") VALUES ("
					+ "'" + ModelEstabelecimento.getId() + "'," + "'" + ModelEstabelecimento.getNome() + "'," + "'"
					+ ModelEstabelecimento.getDescricao() + "'" + ");");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * recupera Estabelecimento
	 * 
	 * @param Id
	 *            return ModelEstabelecimento
	 */
	public ModelEstabelecimento getEstabelecimentoDAO(int Id) {
		ModelEstabelecimento modelEstabelecimento = new ModelEstabelecimento();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "id_pk," + "nome," + "descricao" + " FROM" + " Estabelecimento" + " WHERE"
					+ " id_pk = '" + Id + "'" + ";");

			while (this.getResultSet().next()) {
				modelEstabelecimento.setInt(this.getResultSet().getInt(1));
				modelEstabelecimento.setNome(this.getResultSet().getString(2));
				modelEstabelecimento.setDescricao(this.getResultSet().getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return modelEstabelecimento;
	}

	/**
	 * recupera uma lista de Estabelecimento return ArrayList
	 */
	public ArrayList<ModelEstabelecimento> getListaEstabelecimentoDAO() {
		ArrayList<ModelEstabelecimento> listamodelEstabelecimento = new ArrayList<>();
		ModelEstabelecimento modelEstabelecimento = new ModelEstabelecimento();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "id_pk," + "nome," + "descricao" + " FROM" + " Estabelecimento" + ";");

			while (this.getResultSet().next()) {
				modelEstabelecimento = new ModelEstabelecimento();
				modelEstabelecimento.setInt(this.getResultSet().getInt(1));
				modelEstabelecimento.setNome(this.getResultSet().getString(2));
				modelEstabelecimento.setDescricao(this.getResultSet().getString(3));
				listamodelEstabelecimento.add(modelEstabelecimento);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return listamodelEstabelecimento;
	}

	/**
	 * atualiza Estabelecimento
	 * 
	 * @param pModelEstabelecimento
	 *            return boolean
	 */
	public boolean atualizarEstabelecimentoDAO(ModelEstabelecimento ModelEstabelecimento) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL("UPDATE Estabelecimento SET " + "id_pk = '"
					+ ModelEstabelecimento.getId() + "'," + "nome = '" + ModelEstabelecimento.getNome() + "',"
					+ "descricao = '" + ModelEstabelecimento.getDescricao() + "'" + " WHERE " + "id_pk = '"
					+ ModelEstabelecimento.getId() + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * exclui Estabelecimento
	 * 
	 * @param Id
	 *            return boolean
	 */
	public boolean excluirEstabelecimentoDAO(int Id) {
		try {
			this.conectar();
			return this
					.executarUpdateDeleteSQL("DELETE FROM Estabelecimento " + " WHERE " + "id_pk = '" + Id + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}
}