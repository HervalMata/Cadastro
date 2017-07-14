package br.fpl.dev.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.FlowEvent;

import br.fpl.dev.beans.Pessoa;
import br.fpl.dev.utils.CidadeUtil;
import br.fpl.dev.utils.EstadoUtil;

@Named
@ViewScoped
public class CadastroBean implements Serializable {

	private Pessoa pessoa;

	private List<String> estados = EstadoUtil.getEstadoList(); // Busca os estados da lista
	
	private List<String> cidades;

	@PostConstruct
	public void init() {
		pessoa = new Pessoa();
	}
	
	/**
	 * AutoComplete para cidades, baseando-se no estado selecionado
	 * @param query
	 * @return cidades com a mesma letra
	 */
	public List<String> completeText(String query) {
		List<String> cidadesFiltradas = new ArrayList<>();
		
		if ( pessoa.getEstado() != null ){
			
			cidades = CidadeUtil.cidadesPorEstado(pessoa.getEstado());
	
			for (int i = 0; i < cidades.size(); i++) {
	
				String c = cidades.get(i);
	
				if (c.toLowerCase().startsWith(query.toLowerCase())) {
					cidadesFiltradas.add(c);
				}
			}
		}

		return cidadesFiltradas;
	}
	
	/**
	 * Exibe a mensagem de pessoa cadastrada
	 */
	public void salvar() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!",
				pessoa.getNomeCompleto() + " Cadastrado com sucesso!"));
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

	public List<String> getEstados() {
		return estados;
	}

	public List<String> getCidades() {
		return cidades;
	}

}