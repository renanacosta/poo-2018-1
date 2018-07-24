package DAO;

import java.util.ArrayList;
import conexao.ConexaoPostgre;
import model.ModelAplicativo;

/**
 *
 * @author Renan Acosta
 */
public class DAOAplicativo extends ConexaoPostgre {

	/**
	 * grava Aplicativo
	 * 
	 * @param ModelAplicativo
	 *            return int
	 */
	public int salvarAplicativoDAO(ModelAplicativo ModelAplicativo) {
		try {
			this.conectar();
			return this.insertSQL("INSERT INTO Aplicativo (" + "nome," + "cnpj," + "razao_social" + ") VALUES (" + "'"
					+ ModelAplicativo.getNome() + "'," + "'" + ModelAplicativo.getCnpj() + "'," + "'"
					+ ModelAplicativo.getRazaoSocial() + "'" + ");");
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * recupera Aplicativo
	 * 
	 * @param pNome
	 *            return ModelAplicativo
	 */
	public ModelAplicativo getAplicativoDAO(String Nome) {
		ModelAplicativo modelAplicativo = new ModelAplicativo();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "nome," + "cnpj," + "razao_social" + " FROM" + " Aplicativo" + " WHERE"
					+ " nome = '" + Nome + "'" + ";");

			while (this.getResultSet().next()) {
				modelAplicativo.setNome(this.getResultSet().getString(1));
				modelAplicativo.setCnpj(this.getResultSet().getString(2));
				modelAplicativo.setRazaoSocial(this.getResultSet().getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return modelAplicativo;
	}

	/**
	 * recupera uma lista de Aplicativo return ArrayList
	 */
	public ArrayList<ModelAplicativo> getListaAplicativoDAO() {
		ArrayList<ModelAplicativo> listamodelAplicativo = new ArrayList<>();
		ModelAplicativo modelAplicativo = new ModelAplicativo();
		try {
			this.conectar();
			this.executarSQL("SELECT " + "nome," + "cnpj," + "razao_social" + " FROM" + " Aplicativo" + ";");

			while (this.getResultSet().next()) {
				modelAplicativo = new ModelAplicativo();
				modelAplicativo.setNome(this.getResultSet().getString(1));
				modelAplicativo.setCnpj(this.getResultSet().getString(2));
				modelAplicativo.setRazaoSocial(this.getResultSet().getString(3));
				listamodelAplicativo.add(modelAplicativo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.fecharConexao();
		}
		return listamodelAplicativo;
	}

	/**
	 * atualiza Aplicativo
	 * 
	 * @param ModelAplicativo
	 *            return boolean
	 */
	public boolean atualizarAplicativoDAO(ModelAplicativo ModelAplicativo) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL(
					"UPDATE Aplicativo SET " + "nome = '" + ModelAplicativo.getNome() + "'," + "cnpj = '"
							+ ModelAplicativo.getCnpj() + "'," + "razao_social = '" + ModelAplicativo.getRazaoSocial()
							+ "'" + " WHERE " + "nome = '" + ModelAplicativo.getNome() + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}

	/**
	 * exclui Aplicativo
	 * 
	 * @param Nome
	 *            return boolean
	 */
	public boolean excluirAplicativoDAO(String Nome) {
		try {
			this.conectar();
			return this.executarUpdateDeleteSQL("DELETE FROM Aplicativo " + " WHERE " + "nome = '" + Nome + "'" + ";");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			this.fecharConexao();
		}
	}
}