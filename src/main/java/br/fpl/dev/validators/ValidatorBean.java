package br.fpl.dev.validators;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import br.fpl.dev.controllers.CadastroBean;
import br.fpl.dev.utils.CidadeUtil;

@Named
@RequestScoped
public class ValidatorBean implements Serializable { // Para validações com injeção de Bean
	
	@Inject
	private CadastroBean cadastro;
	
	public void cidadeValidator(FacesContext context, UIComponent uiComponent, Object o) throws ValidatorException {
		
		String cidade = (String) o;

		List<String> cidades = CidadeUtil.cidadesPorEstado(cadastro.getPessoa().getEstado());

		if (!(cidades.contains(cidade))) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"'" + cidade + "' não pertence ao 'Estado' selecionado.", "");
			throw new ValidatorException(msg);
		}
	}

}
