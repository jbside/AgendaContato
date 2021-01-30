package contado.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import contato.beans.ContatoBeans;
import contato.conexao.Conexao;

public class ContatoDAO {
	
	public void cadastrarContato(ContatoBeans contato) throws SQLException {
		
		Conexao conexao = new Conexao();
		String sql = "insert into agenda (nome,email,endereco,datanas,telefone) values(?,?,?,?,?)";
		PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
		
		pstmt.setString(1, contato.getNome());
		pstmt.setString(2, contato.getEmail());
		pstmt.setString(3, contato.getEndereco());
		pstmt.setDate(4,new java.sql.Date(contato.getDataNascimento().getTime()));
		pstmt.setString(5,contato.getTelefone());
		pstmt.execute();
		
		
		
	}

}
