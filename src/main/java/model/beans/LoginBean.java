package model.beans;

import jakarta.ejb.Stateless;

@Stateless
public class LoginBean {

	public boolean autenticar(String email, String senha) {
		// Exemplo de login
		return "user@gmail.com".equals(email) && "123".equals(senha);
	}

}
