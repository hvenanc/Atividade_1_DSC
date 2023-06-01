package controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import model.beans.UsuarioBean;
import model.entities.Usuario;

@Named
@RequestScoped
public class UsuarioMB {

	@EJB
	UsuarioBean usuarioBean;
	
	private Usuario usuario;
	
	public void cadastrarUsuario() {
		usuarioBean.cadastrarUsuario(usuario);
	}
	
	public List<Usuario> getUsuarios() {
		return new ArrayList<Usuario>(usuarioBean.getUsuarios());
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
