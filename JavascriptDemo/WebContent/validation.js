function validateLoginForm(){
	if(loginForm.username.value==""){
		alert("enter Username");
		return false;
	}
	else if(loginForm.password.value==""){
		alert("Enter Password");
		return false;
	}
}

function validateRegistrationForm(){
	if(registerForm.Username.value==""){
		alert("enter Username");
		return false;
	}
	else if(registerForm.Password.value==""){
		alert("Enter Password");
		return false;
	}
	else if(registerForm.EMail.value==""){
		alert("Enter email");
		return false;
	}
	else if(registerForm.Telephone.value==""){
		alert("Enter telephone");
		return false;
	}
}
//******************************************************PASSWORD
function validatePassword(){
	if(changePasswordFrm.password.value.length>=6){
		if(changePasswordFrm.password.value.search(/[0-9]/)!=-1&&
				changePasswordFrm.password.value.search(/[A-Z]/)!=-1&&
				changePasswordFrm.password.value.search(/[!@#$%^&*()_+]/)!=-1){
			return true;
		}
	
	else{
		alert("password must contain atleast 1 uppercase and special letter");
		return false;
	}
}
else{
	alert("minimum of 6 characters");
	return false;
}
}
function check() {
	
}

//*******************************************************EMAIL

function ValidateEmail(inputText)
{
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(inputText.value.match(mailformat))
{
document.form1.text1.focus();
return true;
}
else
{
alert("You have entered an invalid email address!");
document.form1.text1.focus();
return false;
}
}