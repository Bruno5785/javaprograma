package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;

/**
 * A classe FornecedorDAO prov� a 
 * comunica��o da classe model.Fornecedor
 * com o banco de dados. � respons�vel tamb�m
 * pelo mapeamento O/R da classe.
 * @author brunp
 * @see model.Fornecedor
 * @see <a href="http://conectadamente.com/pages/java/javaOOPPersistencia.html">
 * Mapeamento Objeto Relacional</a>
 */


public class ClienteDAO {
	/**
	 * Gera a persist�ncia do Fornecedor r no 
	 * banco de dados.
	 * 
	 * @param r Um objeto da classe Fornecedor
	 */
	public void insert (Cliente r) {
		/**
		 * O Connection con � respons�vel pela 
		 * conex�o com o banco de dados.
		 */
		Connection con = null;  // conex�o com o bd
		PreparedStatement pst = null;  // statement sql
		ResultSet rs = null;  // retorno do bd
		String sql = "INSERT INTO clientes " +
					 "(cpf,nome,celular,email)" + 
					 "VALUES (?,?,?,?)";  // comando para inser��o
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1,r.getCpf());
			pst.setString(2,r.getNome());
			pst.setString(3,r.getCelular());
			pst.setString(4,r.getEmail());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
	}
	
	/**
	 * Retorna a lista de fornecedores 
	 * cadastrados no banco de dados.
	 * 
	 * @return O ArrayList com objetos Fornecedor.
	 */
	public ArrayList<Cliente> select () {
		ArrayList<Cliente> lista = new ArrayList<>();
		Connection con = null;  // conex�o com o bd
		PreparedStatement pst = null;  // statement sql
		ResultSet rs = null;  // retorno do bd
		String sql = "SELECT id,cpf,nome,celular,email " +
					 " FROM clientes";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int codigo = rs.getInt(1);
				String cpf = rs.getString(2);
				String nome = rs.getString(3);
				String celular = rs.getString(4);
				String email = rs.getString(5);
				lista.add(new Cliente(codigo,cpf,nome,celular,email));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
		return lista;
	}

	/**
	 * Pesquisa o fornecedor com c�digo informado
	 * no banco de dados. Se encontrar, retorna
	 * um objeto do tipo Fornecedor. Caso o c�digo n�o 
	 * existe no banco de dados, retorna null.
	 * 
	 * @return Um objeto do tipo Fornecedor
	 */
	public Cliente select(int id) {
		Cliente cliente = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT id,cpf,nome,celular,email " +
					 "FROM clientes " +
					 " WHERE id = ? ";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				int codigo = rs.getInt(1);
				String cpf = rs.getString(2);
				String nome = rs.getString(3);
				String celular = rs.getString(4);
				String email = rs.getString(5);
				cliente = new Cliente(codigo,cpf,nome,celular,email);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
		return cliente;
	}
	
}


