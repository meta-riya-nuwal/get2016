

function register()
{

var name=document.getElementById('name').value;
var address=document.getElementById('address').value;
var number=document.getElementById('number').value;
var email=document.getElementById('email').value;
var qualify=document.getElementById('qualify').value;

var patternName = /^[A-Za-z]+$/;  
var patternAdd = /^[a-zA-Z0-9\,\' '\-]+$/;  
var patternNum=/^[789][0-9]+$/;

var patternEmail=/^[A-Za-z]$/; 
	if(name=="")
	{
	alert("Please Enter name");
	}
	else {
		if(!name.match(patternName))
		{
		alert("Don't include digit or special symbol");
		}
		if(name.length<3 || name.length>12)
		{
			alert("Length of name should be between 3 to 10");
		}
	}
	
	if(address=="")
	{
	alert("Please Enter Address");
	}
	else {
		if(!address.match(patternAdd))
		{
		alert("Don't include special symbol in address");
		}
		if(address.length<10 || address.length>50)
		{
			alert("Length of address should be between 10 to 50");
		}
	}
	
	if(number=="")
	{
	alert("Please Enter Phone number");
	}
	else {
		if(!number.match(patternNum))
		{
		alert("Only Enter digits and first number should only from starts from 7/8/9");
		}
		if(number.length>10 || number.length<10)
		{
			alert("Phone number should be only 10 digits");
		}
	}
	
	if(email=="")
	{
	alert("Please Enter Email");
	}
	else {
	var atpos = email.indexOf("@");
    var dotpos = email.lastIndexOf(".");
	
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=email.length) {
        alert("Not a valid e-mail address");
       
    }
	var first=email.charAt(0);
	if(!first.match(patternEmail))
		{
		alert("First character should only be alphabet");
		}
	}
	
	
	
	if(document.getElementById('male').checked==false && document.getElementById('female').checked==false)
	{
		alert("please select your gender");
	}
	
	if(qualify=='')
	{
		alert("Plz select your qualification");
	}
	
	
	var certify=document.getElementsByName("certify");
	
    var flag=false;
for(var i = 0; i < certify.length; i++) {
    if(certify[i].checked == true) {
		
		flag=true;
     break;
     }
}
if(flag==false)
{
	alert("Select your certifications");
}
}