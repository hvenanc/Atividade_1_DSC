package repository;

import java.util.ArrayList;
import java.util.List;

import model.entities.Coleta;

public class ColetaRepository {
	
	private List<Coleta> coletas = new ArrayList<>();
	
	public void cadstrarColeta(Coleta coleta) {
		coletas.add(coleta);	
	}
	
	public void removerColeta(Coleta coleta) {
		coletas.remove(coleta);	
	}
	
	public List<Coleta> getColetas() {
		return this.coletas;
	}
	
	
	
	

}
