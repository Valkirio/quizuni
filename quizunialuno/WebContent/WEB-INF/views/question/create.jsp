<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<tags:pageTemplate titulo="Cadastro de Questões" bodyClass="blue-grey lighten-5">	

	<div class="container">
		<h4 class="main-title center">CADASTRO DE QUESTÕES</h4>

		<f:form modelAttribute="question" method="POST" action="/quizunialuno/question/create">
			<div class="input-field col s2">
				<input type="text" name="description" value="${ question.description }" />
				<label>Enunciado</label>
			</div>

			<c:forEach var="alternative" items="${ question.alternatives }" varStatus="idx">
				<div class="col s2">
					<div class="row">
						<div class="input-field col s10">
							<input type="text" name="alternatives[${ idx.index }].description" />
							<label>Alternativa ${ idx.index + 1 }</label>
						</div>
						<div class="col s2">
							<input type="checkbox" data-group="qs" class="rs" id="alt${ idx.index }" name="alternatives[${ idx.index }].correct" value="true"/>
							<label for="alt${ idx.index }">Alternativa Correta?</label>
						</div>
						
					</div>
				</div>

			</c:forEach>
			

			<div class="col s2">
				<p> 
					<input type="checkbox" id="active" name="active" checked="checked" value="true" />
					<label for="active">Ativa?</label>
				</p>
			</div>

			<div class="center">
				<button type="submit" class="btn">Gravar</button>			
			</div>
		</f:form>

	</div>
	
</tags:pageTemplate>
