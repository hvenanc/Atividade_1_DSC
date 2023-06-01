package model.beans;

import java.util.ArrayList;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import model.entities.Coleta;

@Local
@Stateless
public class ColetaBean {

private ArrayList<Coleta> coletas = new ArrayList<>();
	
	public ArrayList<Coleta> getColetas() {
		return coletas;
	}
	
	public void criarColeta(Coleta coleta) {
		coletas.add(coleta);
	}
	
	public void removerColeta(Coleta coleta) {
		coletas.remove(coleta);
	}
	
}
