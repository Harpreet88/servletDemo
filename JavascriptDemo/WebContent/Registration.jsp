<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script src="email-validation.js"></script>
<form id="registerForm" action="registration" method="post" onsubmit="validateRegistrationForm()">
<Fieldset>
<legend>Social Information</legend>
<h1 style="text-align: center"> REGISTRATION FORM </h1>           
      
    <p>Name: <input type="text" size=65 name="name"> </p><br>        
    <p>E-mail Address: <input type="text" size=65 name="eMail">  </p><br> 
     <p>Password: <input type="text" size=65 name="password"> </p><br> 
    <p>Telephone: <input type="text" size=65 name="telephone"> </p><br>   
    
    <p>Communication: 
    <p>Telephone:<input type="checkbox" size=65 name="communication"> </p><br> 
    <p>Email: <input type="checkbox" size=65 name="communication"> </p><br> 
    <p>Letter: <input type="checkbox" size=65 name="communication"> </p><br> 
           
    <p>SELECT YOUR COURSE    
        <select type="text" value="" name="Subject"> 
            <option>BTECH</option> 
            <option>BBA</option> 
            <option>BCA</option> 
            <option>B.COM</option> 
            <option>B.E</option> 
        </select></p><br><br> 
    <p>Comments:  <textarea cols="55" name="Comment">  </textarea></p> 
    <p><input type="submit" value="send" name="Submit" onclick="ValidateEmail(document.registerForm.EMail)">      
        <input type="reset" value="Reset" name="Reset">   
    </p>    
     </Fieldset>      
</form><font color='red'>${requestScope.error}</font>
</body>
</html>