package br.fpl.dev.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class BairroValidator implements Validator {
	
	@Override
	public void validate(FacesContext context, UIComponent uiComponent, Object o) 
			throws ValidatorException {
		
		String bairro = (String) o;
		
		if (bairro.length() < 5){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Nome do 'Bairro' muito curto.","");
			throw new ValidatorException(msg);
		}
	}
}
