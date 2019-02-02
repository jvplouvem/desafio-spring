<html>
<body>
	<a href="/listar">LISTAR</a>
	
	</br></br></br>
	<form method="POST" action="/${empty cliente? 'criar' : 'alterar'}">
	<table border="1">
	<tr>
		<td>Nome:</td>
		<td>
			<input type="hidden" name="id" value="${cliente.id}">
			<input type="text" name="nome" value="${cliente.nome}">
		</td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="cadastrar"></td>
	</tr>
	</table>
	</form>
</body>
</html>