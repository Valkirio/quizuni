$(document).ready(function(){
	$(".dropdown-trigger").dropdown({hover: true});
		
	$('select').formSelect();
	
	verificaCheckbox();
			
});

$("input[name=fgQuestaoAtiva]").click(function(){
	
	if($("input[name=fgQuestaoAtiva]").prop("checked") == true){
		$("input[name=fgQuestaoAtiva]").val('on');		
		$("input[name=fgQuestaoAtiva]").prop("checked", true);
	}else{
		$("input[name=fgQuestaoAtiva]").prop("checked", false);
	}	
});

$("input[name=fgVerdadeiraA]").click(function(){
	
	if($("input[name=fgVerdadeiraA]").prop("checked") == true){
		$("input[name=fgVerdadeiraA]").val('on');		
		$("input[name=fgVerdadeiraA]").prop("checked", true);
	}else{
		$("input[name=fgVerdadeiraA]").prop("checked", false);
	}	
});

$("input[name=fgVerdadeiraB]").click(function(){
	
	if($("input[name=fgVerdadeiraB]").prop("checked") == true){
		$("input[name=fgVerdadeiraB]").val('on');		
		$("input[name=fgVerdadeiraB]").prop("checked", true);
	}else{
		$("input[name=fgVerdadeiraB]").prop("checked", false);
	}	
});

$("input[name=fgVerdadeiraC]").click(function(){
	
	if($("input[name=fgVerdadeiraC]").prop("checked") == true){
		$("input[name=fgVerdadeiraC]").val('on');		
		$("input[name=fgVerdadeiraC]").prop("checked", true);
	}else{
		$("input[name=fgVerdadeiraC]").prop("checked", false);
	}	
});

$("input[name=fgVerdadeiraD]").click(function(){
	
	if($("input[name=fgVerdadeiraD]").prop("checked") == true){
		$("input[name=fgVerdadeiraD]").val('on');		
		$("input[name=fgVerdadeiraD]").prop("checked", true);
	}else{
		$("input[name=fgVerdadeiraD]").prop("checked", false);
	}	
});

$("input[name=fgVerdadeiraE]").click(function(){
	
	if($("input[name=fgVerdadeiraE]").prop("checked") == true){
		$("input[name=fgVerdadeiraE]").val('on');		
		$("input[name=fgVerdadeiraE]").prop("checked", true);
	}else{
		$("input[name=fgVerdadeiraE]").prop("checked", false);
	}	
});


function verificaCheckbox(){
	
	if($("input[name=fgQuestaoAtiva]").val() == 'on'){		
		$("input[name=fgQuestaoAtiva]").prop("checked", true);
		$("input[name=fgQuestaoAtiva]").val('on');
	}else{		
		$("input[name=fgQuestaoAtiva]").prop("checked", false);		
	}	
	
	if($("input[name=fgVerdadeiraA]").val() == 'on'){		
		$("input[name=fgVerdadeiraA]").prop("checked", true);
		$("input[name=fgVerdadeiraA]").val('on');
	}else{		
		$("input[name=fgVerdadeiraA]").prop("checked", false);		
	}
	
	if($("input[name=fgVerdadeiraB]").val() == 'on'){		
		$("input[name=fgVerdadeiraB]").prop("checked", true);
		$("input[name=fgVerdadeiraB]").val('on');
	}else{		
		$("input[name=fgVerdadeiraB]").prop("checked", false);		
	}
	
	if($("input[name=fgVerdadeiraC]").val() == 'on'){		
		$("input[name=fgVerdadeiraC]").prop("checked", true);
		$("input[name=fgVerdadeiraC]").val('on');
	}else{		
		$("input[name=fgVerdadeiraC]").prop("checked", false);		
	}
	
	if($("input[name=fgVerdadeiraD]").val() == 'on'){		
		$("input[name=fgVerdadeiraD]").prop("checked", true);
		$("input[name=fgVerdadeiraD]").val('on');
	}else{		
		$("input[name=fgVerdadeiraD]").prop("checked", false);		
	}
	
	if($("input[name=fgVerdadeiraE]").val() == 'on'){		
		$("input[name=fgVerdadeiraE]").prop("checked", true);
		$("input[name=fgVerdadeiraE]").val('on');
	}else{		
		$("input[name=fgVerdadeiraE]").prop("checked", false);		
	}
	
}
