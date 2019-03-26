<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<tags:pageTemplate titulo="Cadastro de Questões" bodyClass="blue-grey lighten-5">	

   <div id="formularioQuestoes" class="container">
   
   	<h4 class="main-title center">CADASTRO DE QUESTÕES</h4>
   
   	<div class="row">
	    <f:form action="${s:mvcUrl('QC#create').build()}" class="col s12" modelAttribute="questoes" method="post" acceptCharset="utf-8">
	      	   <input type="hidden" name="id" value="${questoes.id}" />
	      	   <f:errors path="fgVerdadeiraA" cssClass="helper-text red-text" />
		       <div class="input-field col s10">
		          <i class="material-icons prefix">event_note</i>
		          <textarea id="titulo" name="titulo" class="materialize-textarea validate">${questoes.titulo}</textarea>
		          <label for="titulo">Título da pergunta</label>
		          <f:errors path="titulo" cssClass="helper-text red-text" />
		      </div>
	        
	          <div class="col s2">
		          <p>
			          <label>
			          	<input class="filled-in" id="fgQuestaoAtiva" name="fgQuestaoAtiva" type="checkbox" value="${questoes.fgQuestaoAtiva}" />
			          	<span>Questão Ativa</span>
			          </label>	
			       </p>	          
	          </div>	        
	        
	          <div class="input-field col s10"> 
		          <i class="material-icons prefix">format_list_bulleted</i>	               
		          <textarea id="opcaoA" name="opcaoA" class="materialize-textarea validate">${questoes.opcaoA}</textarea>	          
		          <label for="opcaoA">Opção A</label>
		          <f:errors path="opcaoA" cssClass="helper-text red-text" />
	          </div>
	          
	          <div class="col s2">
		          <p>
			          <label>
			          	<input class="with-gap" name="fgVerdadeiraA" type="checkbox" value="${questoes.fgVerdadeiraA}" />
			          	<span>Verdadeira A</span>
			          </label>	
			       </p>	          
	          </div>	       
	       
	                  
	          <div class="input-field col s10">
		          <i class="material-icons prefix">format_list_bulleted</i>
		          <textarea id="opcaoB" name="opcaoB" class="materialize-textarea validate">${questoes.opcaoB}</textarea>		          
		          <label for="opcaoB">Opção B</label>
		          <f:errors path="opcaoB" cssClass="helper-text red-text" />
	          </div>
	          
	          <div class="col s2">
		          <p>
			          <label>
			          	<input class="with-gap" name="fgVerdadeiraB" type="checkbox" value="${questoes.fgVerdadeiraB}" />
			          	<span>Verdadeira B</span>
			          </label>
		          </p>
	          </div>
	      	        	        
	          <div class="input-field col s10">
		          <i class="material-icons prefix">format_list_bulleted</i>
		          <textarea id="opcaoC" name="opcaoC" class="materialize-textarea validate">${questoes.opcaoC}</textarea>
		          <label for="opcaoC">Opção C</label>
		          <f:errors path="opcaoC" cssClass="helper-text red-text" />
	          </div>
	          
	          <div class="col s2">
		          <p>
			          <label>
			          	<input class="with-gap" name="fgVerdadeiraC" type="checkbox" value="${questoes.fgVerdadeiraC}" />
			          	<span>Verdadeira C</span>
			          </label>
		          </p>
	          </div>
	       
	          <div class="input-field col s10">
		          <i class="material-icons prefix">format_list_bulleted</i>
		          <textarea id="opcaoD" name="opcaoD" class="materialize-textarea validate">${questoes.opcaoD}</textarea>
		          <label for="opcaoD">Opção D</label>
		          <f:errors path="opcaoD" cssClass="helper-text red-text" />
	          </div>
	          
	          <div class="col s2">
		          <p>
			          <label>
			          	<input class="with-gap" name="fgVerdadeiraD" type="checkbox" value="${questoes.fgVerdadeiraD}" />
			          	<span>Verdadeira D</span>
			          </label>
		          </p>
	          </div>
	       	         
	          <div class="input-field col s10">
		          <i class="material-icons prefix">format_list_bulleted</i>
		          <textarea id="opcaoE" name="opcaoE" class="materialize-textarea validate">${questoes.opcaoE}</textarea>
		          <label for="opcaoE">Opção E</label>
		          <f:errors path="opcaoE" cssClass="helper-text red-text" />
	          </div>
	          
	          <div class="col s2">
		          <p>
			          <label>
			          	<input name="fgVerdadeiraE" type="checkbox" value="${questoes.fgVerdadeiraE}" />
			          	<span>Verdadeira E</span>
			          </label>
		          </p>
	          </div>
	       	   
	       	<div class="col s12">     	        
		        <button type="submit" class="waves-effect waves-light btn right">
		        	Cadastrar<i class="material-icons right">send</i>
		        </button>
	        </div>
	      
	    </f:form>
	</div>    
       
   </div>
</tags:pageTemplate>