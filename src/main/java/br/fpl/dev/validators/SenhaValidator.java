package br.fpl.dev.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class SenhaValidator implements Validator{
	
	@Override
	public void validate(FacesContext context, UIComponent uiComponent, Object o) 
			throws ValidatorException {
		
		String senha = (String) o;
		
		if (senha.length() < 6){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"A 'Senha' dete ter no mínimo 6 digitos.","");
			throw new ValidatorException(msg);
		}
	}
}
