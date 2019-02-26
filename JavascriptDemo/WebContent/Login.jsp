<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <form name="loginForm" onsubmit="validateLoginForm()" method="post" action="login">
    <div class="row">
      <h2 style="text-align:center">Login Manually</h2>
      
         <h2>sign in manually:</h2> 
        </div>

        <input type="text" name="username" placeholder="Username" >
        <input type="password" name="password" placeholder="Password" >
        <input type="submit" value="Login">
          </form>
      </div><font color='red'>${requestScope.error}</font>
</body>
</html>