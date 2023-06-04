package controller;

import java.util.List;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import model.beans.ItemColetaBean;
import model.entities.ItemColeta;

@Named
@RequestScoped
public class ItemColetaMB {

	@EJB
	ItemColetaBean itemColetabean;
	
	private String nome;
	private double quantidade;
	private String descricao;
	
	public void inserirItem() {
		
		ItemColeta item = new ItemColeta();
		
		item.setDescricao(this.descricao);
		item.setNome(this.nome);
		item.setQuantidade(this.quantidade);
		
		this.itemColetabean.inserirItem(item);
	}
	
	public List<ItemColeta> listaItens() {
		return itemColetabean.getItens();
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
