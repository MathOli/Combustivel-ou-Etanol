package br.fatec.melhor.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.fatec.melhor.model.combustivel;

@ManagedBean
@RequestScoped
public class combustivelBean {
	
	private combustivel combustivel = new combustivel();
	private String situacao;
	
	public combustivelBean() {
		
	}
	public combustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(combustivel combustivel) {
		this.combustivel = combustivel;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String calcularMelhor() {
		combustivel.setCombustivel(combustivel.getGasolina() * 0.7);
		
		if(combustivel.getEtanol() <= combustivel.getCombustivel()) {
			situacao = "Abastaça com Etanol";
		} else {
			situacao = "Abastaça com Gasolina";
		}
		
		return "/resultado";
	}
	
	
	
	
}
