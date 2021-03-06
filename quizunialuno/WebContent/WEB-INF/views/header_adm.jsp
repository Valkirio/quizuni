<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/resources/img/" var="img" />

<!-- Dropdown Structure -->
<ul id="dropdown1" class="dropdown-content">
  <li><a href="/quizunialuno/question/create">Cadastro Pergunta</a></li>  
  <li class="divider"></li>
  <li><a href="/quizunialuno/question/list-all">Lista de Perguntas</a></li>
  <li><a href="/quizunialuno/play">Rating</a></li>
</ul>
<nav>
  <div class="nav-wrapper teal darken-3">
    <a href="${s:mvcUrl('HC#index').build()}" class="brand-logo"><i class="material-icons">grid_off</i>QuizUniAluno</a>
    <ul class="right hide-on-med-and-down">
      <li><a href="${s:mvcUrl('HC#index').build()}">Home</a></li>      
      <!-- Dropdown Trigger -->
      <li>
      	<li><a class="dropdown-button" href="#!" data-activates="dropdown1">Administração<i class="material-icons right">arrow_drop_down</i></a></li>
      </li>
    </ul>
  </div>
</nav>