package model.beans;


import java.text.ParseException;
import java.text.SimpleDateFormat;
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

		String data = coleta.getData();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            sdf.parse(data);
            return true;
        } catch (ParseException e) {
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
