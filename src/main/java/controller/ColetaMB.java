package controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.EJB;
import model.beans.ColetaBean;
import model.entities.Coleta;

public class ColetaMB {
	
	@EJB
	ColetaBean coletaBean;
	
	private Coleta coleta;
	
	public void cadastrarUsuario() {
		coletaBean.criarColeta(coleta);
	}
	
	public void removerUsuario() {
		coletaBean.removerColeta(coleta);
	}
	
	public List<Coleta> getColetas() {
		return new ArrayList<Coleta>(coletaBean.getColetas());
	}

}
