package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Fornecedor;
import model.Produto;

public class ProdutoDAO implements DAO<Produto>{

	@Override
	public void insert(Produto r) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "INSERT INTO produto " +
					 "(nome,localizacao,qtdeminima,qtdemaxima,qtdeestoque) " + 
					 "VALUES (?,?,?,?,?)";
		
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, r.getNome());
			pst.setString(2, r.getLocalizacao());
			pst.setInt(3, r.getQtdeMinima());
			pst.setInt(4, r.getQtdeMaxima());
			pst.setInt(5, r.getQtdeEstoque());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
		
	}
		
	

	@Override
	

	public ArrayList<Produto> select () {
		ArrayList<Produto> lista = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT id,nome,localizacao,qtdeminima,qtdemaxima,qtdeestoque" +
					 " FROM produto";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int codigo = rs.getInt(1);
				String nome = rs.getString(2);
				String localizacao = rs.getString(3);
				int qtdeminima = rs.getInt(4);
				int qtdemaxima = rs.getInt(5);
				int qtdeestoque = rs.getInt(6);
				lista.add(new Produto (codigo,nome,localizacao,qtdeminima,qtdemaxima,qtdeestoque));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
				} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
		return lista;
	}
}
