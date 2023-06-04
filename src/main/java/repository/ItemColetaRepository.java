package repository;

import java.util.ArrayList;
import java.util.List;

import model.entities.ItemColeta;

public class ItemColetaRepository {
	
	private List<ItemColeta> itensColeta = new ArrayList<>();
	
	public void inserirItem(ItemColeta item) {
		itensColeta.add(item);
	}
	
	public void removerItem(ItemColeta item) {
		itensColeta.remove(item);
	}
	
	public List<ItemColeta> getItens() {
		return this.itensColeta;
	}

}
