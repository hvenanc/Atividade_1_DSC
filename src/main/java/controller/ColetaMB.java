package controller;

import java.util.List;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import model.beans.ColetaBean;
import model.entities.Coleta;
import model.entities.ItemColeta;
import model.entities.Usuario;

@Named
@RequestScoped
public class ColetaMB {
	
	@EJB
	ColetaBean coletaBean;
	
	private ItemColeta item;
	private Usuario usuario;
	private String data;
	
	public void cadastrarColeta() {
		
		Coleta coleta = new Coleta();
		
		coleta.setData(this.data);
		coleta.setItem(this.item);
		coleta.setUsuario(this.usuario);
		
		this.coletaBean.adicionarColeta(coleta);
		
	}
	
	public List<Coleta> listarColetas() {
		return coletaBean.getColetas();
	}
	
	public ItemColeta getItem() {
		return item;
	}
	
	public void setItem(ItemColeta item) {
		this.item = item;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
