<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<tags:pageTemplate titulo="Cadastro de Questões" bodyClass="blue-grey lighten-5" origem="ROLE_CLI">	

<div class="container">
	
	<div class="col s12">
		<div class="row">	
	
		<table class="table striped bordered responsive-table">
			<thead>
	          <tr>
	              <th>ID</th>
	              <th>JOGADOR</th>
	              <th>E-MAIL</th>
	              <th>PONTUA&Ccedil;&Atilde;O</th>
	          </tr>
	        </thead>
	        <tbody>
	        <c:forEach var="r" items="${ rank }" varStatus="idx">
	          <tr>
	            <td>${ idx.index + 1 }</td>
	            <td>${ r.name }</td>
	            <td>${ r.email }</td>
	            <td>${ r.score }</td>
	          </tr>
	        </c:forEach>
	        </tbody>		
		</table>
		
		</div>
	</div>
</div>

</tags:pageTemplate>