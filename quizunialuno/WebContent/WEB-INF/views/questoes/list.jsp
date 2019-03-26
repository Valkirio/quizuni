<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<tags:pageTemplate titulo="Lista de Questões" bodyClass="blue-grey lighten-5">	

   <div id="listaQuestoes">
		<h3 class="main-title center">Lista de Questões</h3>
		<div class="container">
			<table class="striped responsive-table">
				<thead>
					<tr>
						<th style="text-align: left;">Título da pergunta</th>
						<th style="text-align: center;">Status</th>
						<th style="text-align: center;">Ações</th>
					</tr>
				</thead>
				<c:forEach items="${listaDeQuestoes}" var="item" >
				<tr>
					<td style="text-align: left;">${item.titulo}</td>
					<td style="text-align: center;">
						${item.fgQuestaoAtiva eq 'on' ? 'On' : 'Off'}
					</td>
					<td style="text-align: center;">
						<a href="${s:mvcUrl('QC#update').arg(0, item.id).build()}" title="Visualizar">
							<i class="tiny material-icons ">perm_contact_calendar</i>
						</a>						
					</td>
					
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
   
   
</tags:pageTemplate>