package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Br
 */
public class ConexaoPostgre {

	private boolean status = false;
	private String mensagem = ""; // variavel que vai informar o status da conexao
	private Connection con = null; // variavel para conexao
	private Statement statement;
	private ResultSet resultSet;

	private String servidor = ModelSessaoUsuario.ip;
	private String nomeDoBanco = "Ifood";
	private String usuario = "postgres";
	private String senha = "postgres";

	public ConexaoPostgre() {
	}

	public ConexaoPostgre(String Servidor, String nomeDoBanco, String Usuario, String Senha) {
		this.servidor = Servidor;
		this.nomeDoBanco = nomeDoBanco;
		this.usuario = Usuario;
		this.senha = Senha;
	}

	/**
	 * Abre uma conexao com o banco
	 * 
	 * @return Connection
	 */
	public Connection conectar() {
		try {
			// Driver do PostgreSQL
			Class.forName("org.postgresql.Driver").newInstance();

			// local do banco, nome do banco, usuario e senha
			String url = "jdbc:postgresql://" + this.servidor + "/" + this.nomeDoBanco + "?user=" + this.usuario
					+ "&password=" + this.senha;
			this.setCon((Connection) DriverManager.getConnection(url));

			// se ocorrer tudo bem, ou seja, se conectar a linha a segui é executada
			this.status = true;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return this.getCon();
	}

	/**
	 * Executa consultas SQL
	 * 
	 * @param pSQL
	 * @return int
	 */
	public boolean executarSQL(String SQL) {
		try {
			// createStatement de con para criar o Statement
			this.setStatement(getCon().createStatement());

			// Definido o Statement, executamos a query no banco de dados
			this.setResultSet(getStatement().executeQuery(SQL));

		} catch (SQLException ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean executarUpdateDeleteSQL(String SQL) {
		try {

			// createStatement de con para criar o Statement
			this.setStatement(getCon().createStatement());

			// Definido o Statement, executamos a query no banco de dados
			getStatement().executeUpdate(SQL);

		} catch (SQLException ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Executa insert SQL
	 * 
	 * @param pSQL
	 * @return boolean
	 */
	public int insertSQL(String SQL) {
		int status = 0;
		try {
			// createStatement de con para criar o Statement
			this.setStatement(getCon().createStatement());

			// Definido o Statement, executamos a query no banco de dados
			this.getStatement().executeUpdate(SQL);

			// consulta o ultimo id inserido
			this.setResultSet(this.getStatement().executeQuery("SELECT lastval();"));

			// recupera o ultimo id inserido
			while (this.resultSet.next()) {
				status = this.resultSet.getInt(1);
			}

			// retorna o ultimo id inserido
			return status;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return status;
		}
	}

	/**
	 * encerra a conexão corrente
	 * 
	 * @return boolean
	 */
	public boolean fecharConexao() {
		try {
			if ((this.getResultSet() != null) && (this.statement != null)) {
				this.getResultSet().close();
				this.statement.close();
			}
			this.getCon().close();
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return false;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return this.status;
	}

	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * @return the resultSet
	 */
	public ResultSet getResultSet() {
		return resultSet;
	}

	/**
	 * @param mensagem
	 *            the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	/**
	 * @return the con
	 */
	public Connection getCon() {
		return con;
	}

	/**
	 * @param con
	 *            the con to set
	 */
	public void setCon(Connection con) {
		this.con = con;
	}

	/**
	 * @param statement
	 *            the statement to set
	 */
	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	/**
	 * @param resultSet
	 *            the resultSet to set
	 */
	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

}
