<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/resources/img/" var="img" />

<nav>
  <div class="nav-wrapper teal darken-3">
    <a href="${s:mvcUrl('HC#index').build()}" class="brand-logo"><i class="material-icons">grid_off</i>QuizUniAluno</a>
    <ul class="right hide-on-med-and-down">       
      <li><a href="/quizunialuno/index">Nova Partida</a></li>
      <li><a href="/quizunialuno/play">Rating</a></li>    
    </ul>
  </div>
</nav>
<c:if test="${player.name != '' && player.name != null}">
	<span class="new badge left" data-badge-caption="${player.name}">Jogador:</span>
</c:if>
