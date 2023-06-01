package model.beans;

import java.util.ArrayList;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import model.entities.Usuario;

@Local
@Stateless
public class UsuarioBean {

private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	
	public ArrayList<Usuario> getUsuarios() {
		return listaUsuarios;
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
}
