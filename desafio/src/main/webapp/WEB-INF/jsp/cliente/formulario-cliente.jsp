<html>
<body>
	${clientes} -----
	</br></br></br>
	<form method="POST" action="http://localhost:8080/salvar">
	<table border="1">
	<tr>
		<td>Nome:</td>
		<td>
			<input type="text" name="nome">
		</td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="cadastrar"></td>
	</tr>
	</table>
	</form>
</body>
</html>