<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>


<tags:pageTemplate titulo="Cadastro de Questões" bodyClass="blue-grey lighten-5" origem="ROLE_CLI">

<div class="container" style=" margin-top: 100px;">
	<div class="row">	
        <div class="col s12 m7">
          <div class="card-content">
                    
            <span class="card-title flow-text center"><i class="medium material-icons prefix">stars</i> Parabéns ${ player.name }</span>
           
            <div class="card-content">
              <p class="flow-text left">Pontua&ccedil;&atilde;o final ${score} ponto(s)</p>
            </div>
           
          </div>
        </div>
    </div>
</div>

</tags:pageTemplate>