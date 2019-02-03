<html>
<body>
	<a href="/">NOVO CADASTRO</a>&nbsp;|&nbsp;
	<a href="/listar">LISTAR</a>
	
	<br><br><br>
	<form method="POST" action="/${empty cliente? 'criar' : 'alterar'}">
		<input type="hidden" name="id" value="${cliente.id}" />
		
		<table border="1">
		<tr>
			<td>Nome:</td>
			<td>
				<input type="text" name="nome" required value="${cliente.nome}" />
			</td>
		</tr>
		<tr>
			<td>CEP:</td>
			<td>
				<input type="text" name="cep" value="">
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="${empty cliente? 'criar' : 'alterar'}"></td>
		</tr>
		</table>
	</form>
</body>
</html>