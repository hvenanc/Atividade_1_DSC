package model.beans;

import java.util.ArrayList;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import model.entities.ItemColeta;

@Local
@Stateless
public class ItemColetaBean {

	private ArrayList<ItemColeta> itensColeta = new ArrayList<>();
	
	
	public ArrayList<ItemColeta> getItens() {
		return itensColeta;
	}
	
	public boolean validaItem(ItemColeta item) {
		return item.getQuantidade() > 0;
	}
	
	public void inserirItem(ItemColeta item) {
		itensColeta.add(item);
	}
	
	public void removerItem(ItemColeta item) {
		itensColeta.remove(item);
	}
	
}
