package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Fornecedor;

public class FornecedorDAO {
	
	public void insert (Fornecedor r) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "INSERT INTO fornecedor " +
					 "(cnpj,nome,telefone,email) " + 
					 "VALUES (?,?,?,?)";
		
		
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, r.getCnpj());
			pst.setString(2, r.getNome());
			pst.setString(3, r.getTelefone());
			pst.setString(4, r.getEmail());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
		
	}
	
	public ArrayList<Fornecedor> select ( ) {
		ArrayList<Fornecedor> lista = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT id,cnpj,nome,telefone,email" +
					 " FROM fornecedor";
		try {
			con = ConnectionFactory.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int codigo = rs.getInt(1);
				String cnpj = rs.getString(2);
				String nome = rs.getString(3);
				String telefone = rs.getString(4);
				String email = rs.getString(5);
				lista.add(new Fornecedor (codigo,cnpj,nome,telefone,email));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
				} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}
		return lista;
	}

}
