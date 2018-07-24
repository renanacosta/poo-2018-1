package DAO;

import java.util.ArrayList;
import conexao.ConexaoPostgre;
import model.ModelLocalizacao;

/**
 *
 * @author Renan Acosta
 */
public class DAOLocalizacao extends ConexaoPostgre {

	/**
	 * grava Localizacao
	 * 
	 * @param ModelLocalizacao
	 *            return int
	 */
	public int salvarLocalizacaoDAO(ModelLocalizacao ModelLocalizacao) {
		try {
			this.conectar();
			return this.insertSQL("INSERT INTO Localizacao (" + "id_pk," + "cep," + "cidade," + "endereco,"
					+ "complemento" + ") VALUES (" + "'" + ModelLocalizacao.getId() + "'," + "'"
					+ ModelLocalizacao.getCep() + "'," + "'" + ModelLocalizacao.getCidade() + "'," + "'"
					+ ModelLocalizacao.getEndereco() + "'," + "'" + ModelLocalizacao.getComplemento() + "'" + ");");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * recupera Localizacao
	 * 
	 * @param pInt
	 *            return ModelLocalizacao
	 */
	public ModelLocalizacao getLocalizacaoDAO(int Id) {
		ModelLocalizacao modelLocalizacao = new ModelLocalizacao();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "id_pk," + "cep," + "cidade," + "endereco," + "complemento" + " FROM"
					+ " Localizacao" + " WHERE" + " id_pk = '" + Id + "'" + ";");

			while (this.getResultSet().next()) {
				modelLocalizacao.setInt(this.getResultSet().getInt(1));
				modelLocalizacao.setCep(this.getResultSet().getString(2));
				modelLocalizacao.setCidade(this.getResultSet().getString(3));
				modelLocalizacao.setEndereco(this.getResultSet().getString(4));
				modelLocalizacao.setComplemento(this.getResultSet().getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return modelLocalizacao;
	}

	/**
	 * recupera uma lista de Localizacao return ArrayList
	 */
	public ArrayList<ModelLocalizacao> getListaLocalizacaoDAO() {
		ArrayList<ModelLocalizacao> listamodelLocalizacao = new ArrayList<>();
		ModelLocalizacao modelLocalizacao = new ModelLocalizacao();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "id_pk," + "cep," + "cidade," + "endereco," + "complemento" + " FROM"
					+ " Localizacao" + ";");

			while (this.getResultSet().next()) {
				modelLocalizacao = new ModelLocalizacao();
				modelLocalizacao.setInt(this.getResultSet().getInt(1));
				modelLocalizacao.setCep(this.getResultSet().getString(2));
				modelLocalizacao.setCidade(this.getResultSet().getString(3));
				modelLocalizacao.setEndereco(this.getResultSet().getString(4));
				modelLocalizacao.setComplemento(this.getResultSet().getString(5));
				listamodelLocalizacao.add(modelLocalizacao);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return listamodelLocalizacao;
	}

	/**
	 * atualiza Localizacao
	 * 
	 * @param ModelLocalizacao
	 *            return boolean
	 */
	public boolean atualizarLocalizacaoDAO(ModelLocalizacao ModelLocalizacao) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL("UPDATE Localizacao SET " + "id_pk = '" + ModelLocalizacao.getId()
					+ "'," + "cep = '" + ModelLocalizacao.getCep() + "'," + "cidade = '" + ModelLocalizacao.getCidade()
					+ "'," + "endereco = '" + ModelLocalizacao.getEndereco() + "'," + "complemento = '"
					+ ModelLocalizacao.getComplemento() + "'" + " WHERE " + "id_pk = '" + ModelLocalizacao.getId() + "'"
					+ ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * exclui Localizacao
	 * 
	 * @param Id
	 *            return boolean
	 */
	public boolean excluirLocalizacaoDAO(int Id) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL("DELETE FROM Localizacao " + " WHERE " + "id_pk = '" + Id + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}
}