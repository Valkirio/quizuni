package br.com.quiz.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.quiz.model.Questoes;

public class QuestoesValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {		
		return Questoes.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.titulo.required");
		ValidationUtils.rejectIfEmpty(errors, "opcaoA", "field.opcaoA.required");
		ValidationUtils.rejectIfEmpty(errors, "opcaoB", "field.opcaoB.required");
		ValidationUtils.rejectIfEmpty(errors, "opcaoC", "field.opcaoC.required");
		ValidationUtils.rejectIfEmpty(errors, "opcaoD", "field.opcaoD.required");
		ValidationUtils.rejectIfEmpty(errors, "opcaoE", "field.opcaoE.required");
		
		Questoes questao = (Questoes) target;
		
		if (questao.getTitulo().length() > 2000) {
			errors.rejectValue("titulo", "field.titulo.maxsize");
		}
		
		if (questao.getOpcaoA().length() > 2000) {
			errors.rejectValue("opcaoA", "field.resposta.maxsize");
		}
		
		if (questao.getTitulo().length() > 2000) {
			errors.rejectValue("opcaoB", "field.resposta.maxsize");
		}
		
		if (questao.getTitulo().length() > 2000) {
			errors.rejectValue("opcaoC", "field.resposta.maxsize");
		}
		
		if (questao.getTitulo().length() > 2000) {
			errors.rejectValue("opcaoD", "field.resposta.maxsize");
		}
		
		if (questao.getTitulo().length() > 2000) {
			errors.rejectValue("opcaoE", "field.resposta.maxsize");
		}
		
		if( StringUtils.isEmpty(questao.getFgVerdadeiraA()) &&
			StringUtils.isEmpty(questao.getFgVerdadeiraB()) &&
			StringUtils.isEmpty(questao.getFgVerdadeiraC()) &&
			StringUtils.isEmpty(questao.getFgVerdadeiraD()) &&
			StringUtils.isEmpty(questao.getFgVerdadeiraE()) ) {
			errors.rejectValue("fgVerdadeiraA", "field.opcao.required");
		}
		
	}

}
