package controller;

import jakarta.ejb.EJB;
import jakarta.inject.Named;

@Named
public class LoginMB {
	
	private String email;
	private String senha;
	
	@EJB
	private LoginRemote login;
	
	public String autenticar() {
		if(login.autenticar(email, senha)) {
			return "home";
		}
		else {
			return null;
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
