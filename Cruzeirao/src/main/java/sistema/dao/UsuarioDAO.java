package sistema.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import enums.Roles;
import sistema.cruzeirao.Usuario;
import sistema.dao.generic.GenericoDAO;



public class UsuarioDAO extends GenericoDAO<Usuario>  {

		
	protected Class<Usuario> getClasseEntidade() {
		return Usuario.class;
	}

	public Usuario pesquisarPorUserName(String userName) {
			Map<String, Object> parametros = new HashMap<String, Object>();
			parametros.put("username", userName);

			return super.pesquisarUm(Usuario.PESQUISAR_POR_USERNAME, parametros);
	}
	
	public List<Usuario> usuarioJogadores(){

		return super.pesquisaJogadores(Usuario.PESQUISAR_JOGADOR);
	}
	
	public List<Usuario> usuariotecnico(){

		return super.pesquisaJogadores(Usuario.PESQUISAR_TECNICO);
	}
	
	public List<Usuario> usuarioPreparador(){

		return super.pesquisaJogadores(Usuario.PESQUISAR_PREPARADOR);
	}
	
	public List<Usuario> usuarioMassagista(){

		return super.pesquisaJogadores(Usuario.PESQUISAR_MASSAGISTA);
	}
	
	
}
  