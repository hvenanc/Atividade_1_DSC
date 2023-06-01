package controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.EJB;
import model.beans.ItemColetaBean;
import model.entities.ItemColeta;

public class ItemColetaMB {

	@EJB
	ItemColetaBean coletabean;
	
	private ItemColeta coleta;
	
	public void inserirItem() {
		coletabean.inserirItem(coleta);
	}
	
	public void removerItem() {
		coletabean.removerItem(coleta);
	}
	
	public List<ItemColeta> getItens() {
		return new ArrayList<ItemColeta>(coletabean.getItens());
	}

	public ItemColeta getColeta() {
		return coleta;
	}

	public void setColeta(ItemColeta coleta) {
		this.coleta = coleta;
	}
	
}
