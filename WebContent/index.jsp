<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CADASTRO DE AGENDA</title>
</head>
<body>

<h2>Insira os dados do contato para cadastrar um novo contato</h2>
	<form action="novocontato">
		<label>Nome:</label>
		<input type="text" name="nome">
		<br><br>
		<label>Email:</label>
		<input type="text" name="email">
		<br><br>
		<label>Endereco:</label>
		<input type="text" name="endereco">
		<br><br>
		<label>Data nascimento:</label>
		<input type="date" name="dataNascimento">
		<br><br>
		<label>Telefone:</label>
		<input type="text" name="telefone">
		<br><br>
	 	<input type="submit" value="Cadastrar">
		
	
	</form>

</body>
</html>