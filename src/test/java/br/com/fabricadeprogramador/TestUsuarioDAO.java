package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {
	public static void main(String[] args) {
	//	testAlterar();
		testExcluir();
	}

	public static void testCadastrar() {
		Usuario usu = new Usuario();
		usu.setNome("ze");
		usu.setLogin("ze");
		usu.setSenha("ze");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
	}

	public static void testAlterar() {
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Vivilaine");
		usu.setLogin("vivilaine");
		usu.setSenha("vivilaine");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
	}
	public static void testExcluir() {
		Usuario usu = new Usuario();
		usu.setId(4);

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
	}

}
