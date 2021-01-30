package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import contado.DAO.ContatoDAO;
import contato.beans.ContatoBeans;

@SuppressWarnings("serial")
public class novocontato extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ContatoDAO novocontato = new ContatoDAO();
		ContatoBeans beans = new ContatoBeans();
		PrintWriter print = resp.getWriter();

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String dataNasc = req.getParameter("dataNascimento");
		String telefone = req.getParameter("telefone");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date n = null;
		try {
			n = sdf.parse(dataNasc);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		beans.setNome(nome);
		beans.setEmail(email);
		beans.setEndereco(endereco);
		beans.setTelefone(telefone);
		beans.setDataNascimento(n);

		try {	
			novocontato.cadastrarContato(beans);
			print.println("Contato " + nome + " cadastrado com sucesso");

		} catch (SQLException e) {
			print.println("Erro ao cadastrar usuário");
			e.printStackTrace();
			e.printStackTrace();
			
		}

	}

}
