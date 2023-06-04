package model.beans;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import model.entities.Coleta;
import repository.ColetaRepository;

@Local
@Stateless
public class ColetaBean {


	@EJB
	ColetaRepository coletaRepository;
	
	public boolean validaData(Coleta coleta) {

		try {
			String data = coleta.getData();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate  d = LocalDate.parse(data, formatter);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}
	
	public  void adicionarColeta(Coleta coleta) {
		if(validaData(coleta) && coleta.getItem() != null && coleta.getUsuario() != null) {
			this.coletaRepository.cadstrarColeta(coleta);
		}

	}
	
	public void removerColeta(Coleta coleta) {
		if(coleta != null) {
			this.coletaRepository.removerColeta(coleta);
		}
	}
	
	public List<Coleta> getColetas() {
		return this.coletaRepository.getColetas();
	}
	
	
}
