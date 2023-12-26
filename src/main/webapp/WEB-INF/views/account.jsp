<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td{
        border: 1px solid black;
        border-collapse: collapse;
        padding: 5px 10px;
        margin: 0 auto;
    }
    
    input[type="submit"]{
       height: 50px;
    }  
      
    a{
	color: black;
	text-decoration:none;
	}
    
    fieldset{
    margin-top: 15px
    
    }
    h2{
    text-align: center;}
	
</style>
</head>
<body>
	<h2>계좌 생성</h2>
   	<hr/>
	<form action="/account" method="post" style="text-align: center;">	<!-- controller의 mapping url과 action url이 같아야함. -->
		<table>
			<tr>
				<th>ID</th>
				<th>
					<input type="text" name="accPassword" value="" placeholder="계좌 비밀번호를 입력하세요."/>
				</th>
				<th>
					<input type="submit" value="계좌 생성"/>
				</th>
			</tr>  
		</table>
	</form>					
</body>
</html>