
	$(document).ready(init);
	function init()
	{
		
     $('span.message').css(
	 {
		 "color":"cyan",
		 "font-size":"40px"
	 }
	 );
	 
	 $('div.box:first').css(
	 {
		 'border':'solid 2px pink',
		
		 'color':'green'
	 }
	);
	
	$('button').click(function()
	{
		$('button').css(
	{
		'padding':'10px 20px',
		'background-color':'brown',
		'border-radius':'5px'
	});
	}
	);

	$('img').click(function()
	{
    $("img[alt='hello']").css(
	{
	"border":"solid 3px red"
	}
	); }
	);

	
	$('div#myDiv input' ).css(
	{
		'width':'300px'
	}
	);
	
	 $("input[name='txt']").css(
	{
	"border":"solid 3px yellow"
	}
	); 
	
	$("p:not(p.box)").css(
	{
	"border":"solid 3px gray"
	}
	); 
	
	$("div.box,div.errorClass").css(
	{
	"border":"solid 3px #EA977A"
	}
	); 
	
	$("div.box,div.errorClass").css(
	{
	"border":"solid 3px #EA977A"
	}
	); 
	
	$(".box.errorClass").css(
	{
	'background-color':'#E8B29F'
	}
	); 
	$('div.errorClass span.info' ).css(
	{
		'color':'brown',
		'font-size':'20px'
	}
	);
	}
	