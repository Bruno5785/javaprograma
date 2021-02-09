package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import model.Entrada;
import model.Fornecedor;
import model.Produto;
import util.Converte;


/**
 *  A classe EntradaDAO provê a comunicação da 
 * classe model.Entrada com o banco
 * de dados. É responsável também pelo mapeamento 
 * O/R da classe.
 * @author brunp
 *@see model.Entrada
 * @see <a href="http://conectadamente.com/pages/java/javaOOPPersistencia.html">
 *      Mapeamento Objeto Relacional</a>
 */
public class EntradaDAO implements DAO<Entrada>{

	/**
	 * Gera a persistência da Entrada r no banco de dados.
	 * 
	 * @param r Um objeto da classe Entrada
	 */	@Override
	public void insert(Entrada r) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null; 
		String sql = "INSERT INTO entrada " + 
					 "(produto,fornecedor,data," +
					 "doc,qtde,valor)" + 
					 "VALUES (?,?,?,?,?,?)";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			pst.setInt(1, r.getProduto().getId());
			pst.setInt(2, r.getFornecedor().getId());
			pst.setString(3, Converte.date2dmy(r.getData()));
			pst.setString(4, r.getDoc());
			pst.setInt(5, r.getQtde());
			pst.setDouble(6, r.getValor());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con, pst, rs);
		}		 
	}

	@Override
	public ArrayList<Entrada> select () {
		ArrayList<Entrada> lista = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT id,produto,fornecedor,data,doc,qtde,valor" +
					 " FROM entrada" + 
					 " ORDER BY data ";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int codigo = rs.getInt(1);
				int codProduto = rs.getInt(2);
				int codFornecedor = rs.getInt(3);
				String dtstr = rs.getString(4);
				Date data = Converte.str2date(dtstr);
				String doc = rs.getString(5);
				int qtde = rs.getInt(6);
				double valor = rs.getDouble(7);
				Produto produto = new ProdutoDAO().selec(codProduto);
				Fornecedor fornecedor = new FornecedorDAO().select(codFornecedor);
				lista.add(new Entrada (codigo,produto,fornecedor,data,doc,qtde,valor));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
				} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
		return lista;
	}

}