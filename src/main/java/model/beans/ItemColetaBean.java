package model.beans;


import java.util.List;

import jakarta.ejb.EJB;
import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import model.entities.ItemColeta;
import repository.ItemColetaRepository;

@Local
@Stateless
public class ItemColetaBean {

	@EJB
	ItemColetaRepository itensRepository;
	
	
	public void inserirItem(ItemColeta item) {
		if(item != null && item.getQuantidade() > 0 && item.getDescricao() != null && item.getNome() != null) {
			this.itensRepository.inserirItem(item);
		}
	}
	
	public void removerItem(ItemColeta item) {
		if(item != null) {
			this.itensRepository.removerItem(item);
		}
	}
	
	
	public List<ItemColeta> getItens() {
		return this.itensRepository.getItens();
	}
	
}
