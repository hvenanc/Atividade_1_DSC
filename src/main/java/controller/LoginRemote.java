package controller;

import jakarta.ejb.Remote;

@Remote
public interface LoginRemote {

	public boolean autenticar(String email, String senha);
	
}
