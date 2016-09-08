$(document).ready(init);
	function init()
	{
		
     $('#start').click(function() {
	 $('#box').animate(
	 {
	left:'+=500px'
	 },1000);
	 });
	
	 $('#stop').click(
	 function() {
	$('#box').stop();
	 });
	 
	  $('#back').click(function() {
	 $('#box').animate(
	 {
		color:'green',left:'-=500px'
	
	 },1000);
	 });
	
	  $('#left').click(function() {  
	 $('#box').animate(
	 {
	left:'-=50px'
	 });
	 });
	 
	   $('#right').click(function() {
	 $('#box').animate(
	 {
	right:'+=50px'
	 });
	 });
	 
	   $('#bottom').click(function() {
	 $('#box').animate(
	 {
	top:'+=50px'
	 });
	 });
	 
	   $('#top').click(function() {
	 $('#box').animate(
	 {
	top:'-=50px'
	 });
	 });
	
	
	 }