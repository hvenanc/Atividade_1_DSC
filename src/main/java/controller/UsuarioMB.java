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
	
	private String nomeUsuario;
	private String nomeCompleto;
	private String email;
	private String cpf;
	private String dataNasc;
	private String cep;
	private String senha;
	
	public void cadastrarUsuario() {
		Usuario usuario = new Usuario();
		
		usuario.setNomeUsuario(this.nomeUsuario);
		usuario.setNomeCompleto(this.nomeCompleto);
		usuario.setEmail(this.email);
		usuario.setCpf(this.cpf);
		usuario.setDataNasc(this.dataNasc);
		usuario.setCep(this.cep);
		usuario.setSenha(this.senha);
		
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
