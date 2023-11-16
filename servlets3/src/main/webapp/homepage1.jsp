<!DOCTYPE html>
<%-- <%@ page contentType="text/css" %> --%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link rel="stylesheet" href="/webapp/css/homepage.css" type="text/css"> -->
    <style>
    .hero{
    width: 100%;
    height: 100vh;
    /* background-color: chartreuse; */
    /* color: aliceblue; */
    /* background-image:url("https://cdn.pixabay.com/photo/2021/10/23/16/31/italy-6735340_960_720.jpg"); */
    background-repeat: no;
    /* background-position:center; */
    background-size:cover;
    /* position:absolute; */
    margin-top: 250px;
    margin-left:600px;
}
.bdy{
    margin: auto;
    background-image: url("https://cdn.pixabay.com/photo/2021/10/23/16/31/italy-6735340_960_720.jpg");
    background-position:center;
    background-repeat: no-repeat; 
    background-size: cover;
   position: relative;
}

.btn{
    width: 10%;
    height: 30px;
    background: rgb(24, 135, 168);
    /* outline: none;
    border: none; */
    border-radius: 10px;
    color:red;
    margin: 10px 0;
    cursor: pointer;
    opacity: .5;
}
.division{
    color: brown;
    margin-left: 70px;
}
    </style>
    <title>Document</title>
</head>
<body class="bdy" >
    
   
<form  action="./login1.jsp" method="get" class="hero">
   <div class="division">
    <h1>Welcome!!!</h1>
   </div>
      <div>
        <input class="btn" type="submit" value="Login" />
         <input class="btn" type="submit" value="Register" formaction="./register1.jsp" />
      </div>
   
  </form>

</body>
</html>