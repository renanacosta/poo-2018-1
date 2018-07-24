package model;

import DAO.DAOAplicativo;
import DAO.DAOCardapio;
import DAO.DAOCompra;
import DAO.DAOEstabelecimento;
import DAO.DAOLocalizacao;
import DAO.DAOProduto;
import DAO.DAOUsuario;

public class mainIfood {

	public static void main(String[] args) throws Exception {

		DAOAplicativo DAOaplicativo = new DAOAplicativo();
		DAOCardapio DAOcardapio = new DAOCardapio();
		DAOCompra DAOcompra = new DAOCompra();
		DAOEstabelecimento DAOestabelicimento = new DAOEstabelecimento();
		DAOLocalizacao DAOlocalizacao = new DAOLocalizacao();
		DAOProduto DAOproduto = new DAOProduto();
		DAOUsuario DAOusuario = new DAOUsuario();
		// Cria um usuario insere no banco de dados

		// Cria um usuario insere no banco de dados
		ModelUsuario usuario1 = new ModelUsuario();
		System.out.println(usuario1.isTransient());

		// insere o usuário no banco de dados
		ModelUsuario.save(usuario1);
		System.out.println(usuario1.isPersistent());

		ModelUsuario usuario2 = new ModelUsuario();
		DAOUsuario.save(usuario2);

	}

}
