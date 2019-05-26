<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<tags:pageTemplate titulo="Cadastro de Questões" bodyClass="blue-grey lighten-5" origem="ROLE_CLI">	

<br/><br/>
<div class="progress">
     <div class="indeterminate orange darken-3"></div>
 </div>

<f:form method="POST" action="/quizunialuno/play/finalize">

	<div class="blue-grey lighten-5">
		<div class="row">
	    <div class="col s12">
	      <ul class="tabs">
	      	<c:forEach var="question" items="${ questions }" varStatus="idx">
	      		<li class="tab"><a href="#q${ idx.index }" class="green-text"><span class="hide-on-med-and-down">Pergunta </span>${ idx.index + 1 }</a></li>
	      	</c:forEach>
	      </ul>
	    </div>
	    <c:forEach var="question" items="${ questions }" varStatus="idx">
	
		    <div id="q${ idx.index }" class="col s12">
		    
		    	<p class="push-s1">${ idx.index + 1} - ${ question.description }</p>
		    
			    <c:forEach var="alternative" items="${ question.alternatives }" varStatus="status">
					
					<div class="push-s1">
					  <input type="checkbox" data-group="rs${ question.id }" name="responses" class="rs" id="check${ alternative.id }" value="${ question.id },${ alternative.id }">
					  <label for="check${ alternative.id }">${ alternative.sequence } - ${ alternative.description }</label>
					</div>   
		
				</c:forEach>
	
			    <c:if test="${ idx.index == (size - 1 )}">
					<div class="push-s1">
						<button type="submit" class="btn waves-effect waves-light left orange darken-3">Finalizar</button>
					</div>
				</c:if>
		    </div>
		    
		    
	  	</c:forEach>
	  	
	  	</div>
	</div>
		
</f:form>




</tags:pageTemplate>
