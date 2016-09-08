$(document).ready(init);
	function init()
	{
		
		$( "#employee" ).change(
		function()
		{
	    $.getJSON('emp.json',
		function(data) {
        display(data);
    });
   
		});
		
		
		
	function display(data) {
    $('#detail').css("display", "block");
    switch($('#employee').val())
	{
        case "Riya" :
            $('#name').text(data.Riya.name);
            $('#email').text(data.Riya.email);
            $('#dob').text(data.Riya.dob);
            $('#address').text(data.Riya.address);
            break;
        case "Astha" :
            $('#name').text(data.Astha.name);
            $('#email').text(data.Astha.email);
            $('#dob').text(data.Astha.dob);
            $('#address').text(data.Astha.address);
            break;
        case "Amita" :
            $('#name').text(data.Amita.name);
            $('#email').text(data.Amita.email);
            $('#dob').text(data.Amita.dob);
            $('#address').text(data.Amita.address);
            break;
		case "Jyoti" :
            $('#name').text(data.Jyoti.name);
            $('#email').text(data.Jyoti.email);
            $('#dob').text(data.Jyoti.dob);
            $('#address').text(data.Jyoti.address);
            break;
			case "Ayushi" :
            $('#name').text(data.Ayushi.name);
            $('#email').text(data.Ayushi.email);
            $('#dob').text(data.Ayushi.dob);
            $('#address').text(data.Ayushi.address);
            break;
        default :
            $('#detail').css("display", "none");
            
    }
}
		
		
		
		
   }

