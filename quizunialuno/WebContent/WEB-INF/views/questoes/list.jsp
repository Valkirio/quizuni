<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<tags:pageTemplate titulo="Lista de Questões" bodyClass="blue-grey lighten-5" origem="ROLE_ADM">	

   <div id="listaQuestoes">
		<h3 class="main-title center">Lista de Questões</h3>
		<div class="container">
			<table class="table bordered responsive-table">
				<thead>
					<tr>
						<th style="text-align: center;">ID</th>
						<th style="text-align: left;">QUEST&Atilde;O</th>
						<th style="text-align: center;">STATUS</th>				
					</tr>
				</thead>
				<c:forEach items="${listaDeQuestoes}" var="item" >
				<tr>
					<td>${item.id}</td>
					<td style="text-align: left;">${item.description}</td>
					<td style="text-align: center;">
						${item.active eq true ? 'Ativo' : 'Inativo'}
					</td>					
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
   
   
</tags:pageTemplate>