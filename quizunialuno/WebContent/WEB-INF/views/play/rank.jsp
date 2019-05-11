<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<tags:pageTemplate titulo="Cadastro de Questões" bodyClass="blue-grey lighten-5">	

<div class="row">
	<div class="col s10 push-s1">
	
		<ul>
			<c:forEach var="r" items="${ rank }" varStatus="idx">
				<li>${ idx.index + 1 } - ${ r.name } - ${ r.email } - ${ r.score } </li>
			</c:forEach>
		</ul>
		
		<a class="btn waves-effect light" href="/quizunialuno/index">Jogar outra partida</a>
	</div>
</div>


</tags:pageTemplate>