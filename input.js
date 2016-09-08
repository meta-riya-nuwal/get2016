$(document).ready(init);
	function init()
	{
		
   
	 
	 
  $( "#name" ).keyup(
    function() {
    var value = $('#name').val();
	
	
    $( "#new" ).text( value );
	$("#name").animate(
	{
		backgroundColor:'gray'
	},5000
	);
	});
     
  $( "#age" ).keyup(function() {
    var value = $('#age').val();
   
    $( "#new" ).text( value );
	$("#age").animate(
	{
	'backgroundColor':'gray'
	},5000
	);
	
  });
  
  $( "#address" ).keyup(function() {
    var value = $('#address').val();
  
    $( "#new" ).text( value );
	$("#address").animate(
	{
	'backgroundColor':'gray'
	},5000
	);
	
	
  });
	}