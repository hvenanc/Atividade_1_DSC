package repository;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.Singleton;
import model.entities.Usuario;

@Singleton
public class UsuarioRepository {
	
	private List<Usuario> listaUsuarios = new ArrayList<>();
	
	
	public void cadastrarUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
	public List<Usuario> getUsuarios() {
		return this.listaUsuarios;
	}

}
