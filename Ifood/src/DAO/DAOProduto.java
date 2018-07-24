package DAO;

import java.util.ArrayList;

import conexao.ConexaoPostgre;
import model.ModelProduto;
/**
*
* @author Renan Acosta
*/
public class DAOProduto extends ConexaoPostgre {

    /**
    * grava Produto
    * @param pModelProduto
    * return int
    */
    public int salvarProdutoDAO(ModelProduto ModelProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO Produto ("
                    + "id_pk,"
                    + "nome,"
                    + "preco"
                + ") VALUES ("
                    + "'" + ModelProduto.getId() + "',"
                    + "'" + ModelProduto.getNome() + "',"
                    + "'" + ModelProduto.getPreco() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Produto
    * @param pId
    * return ModelProduto
    */
    public ModelProduto getProdutoDAO(int Id){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_pk,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " Produto"
                 + " WHERE"
                     + " id_pk = '" + Id + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setPreco(this.getResultSet().getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList<ModelProduto>();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_pk,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " Produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setId(this.getResultSet().getInt(1));
                modelProduto.setNome(this.getResultSet().getString(2));
                modelProduto.setPreco(this.getResultSet().getString(3));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto ModelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE Produto SET "
                    + "id_pk = '" + ModelProduto.getId() + "',"
                    + "nome = '" + ModelProduto.getNome() + "',"
                    + "preco = '" + ModelProduto.getPreco() + "'"
                + " WHERE "
                    + "id_pk = '" + ModelProduto.getId() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Produto
    * @param Id
    * return boolean
    */
    public boolean excluirProdutoDAO(int Id){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM Produto "
                + " WHERE "
                    + "id_pk = '" + Id + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}