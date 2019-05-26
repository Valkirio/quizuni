<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<tags:pageTemplate titulo="Sejá bem vindo ao Quiz" bodyClass="blue-grey lighten-5">	

   <div class="container" style=" margin-top: 100px;">

   
   
   	<div class="row">
	    <form method="POST" action="/quizunialuno/play" class="col s8">	      
	      <div class="row">
	        <div class="input-field col s8">
	          <i class="material-icons prefix">account_circle</i>
	          <input id="icon_prefix" type="text" name="name" class="validate">
	          <label for="icon_prefix">Nome</label>
	          <span class="helper-text" data-error="wrong" data-success="Nome válido"></span>
	        </div>
	        <div class="input-field col s8">
	          <i class="material-icons prefix">mail</i>
	          <input id="icon_mail" name="email" type="email" class="validate">
	          <label for="icon_mail">E-mail</label>
	          <span class="helper-text" data-error="E-mail inválido" data-success="E-mail válido"></span>
	        </div>
	        
	        <div class="input-field col s8">
	        	<button type="submit" class="waves-effect waves-light btn right" >
	        		Inciar<i class="material-icons right">send</i>
	        	</button>
	        </div>
	      </div>
	    </form>
	</div>    
       
   </div>
</tags:pageTemplate>