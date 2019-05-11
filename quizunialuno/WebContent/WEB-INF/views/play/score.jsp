<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>


<tags:pageTemplate titulo="Cadastro de Questões" bodyClass="blue-grey lighten-5">	

<h1 class="center">Parabéns ${ player.name }</h1>
<h2 class="center">Pontuação final<br />${ score }</h2>

<a class="btn waves-effect light" href="/quizunialuno/play">Ver Ranking</a>

</tags:pageTemplate>