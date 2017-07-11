package br.fpl.dev.controllers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.FlowEvent;

import br.fpl.dev.beans.Pessoa;
import br.fpl.dev.beans.Telefone;

@Named
@ViewScoped
public class CadastroBean implements Serializable {

	private Pessoa pessoa;
	
	@PostConstruct
	public void init() {
		Telefone telefone = new Telefone();
		pessoa = new Pessoa(telefone);
	}
	
	public void salvar(){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", pessoa.getNomeCompleto() + " Cadastrado com sucesso!" ));
	}
	
	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
