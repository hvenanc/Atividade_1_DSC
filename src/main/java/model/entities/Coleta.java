package model.entities;

public class Coleta {
	
	private ItemColeta item;
	private Usuario usuario;
	private String data;
	
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
