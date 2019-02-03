<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	<a href="/">NOVO CADASTRO</a>	
	</br></br></br>

	<table border="1">
	<c:forEach var="cliente" items="${clientes}">
        <tr>
        	<td>
				${cliente.nome}
			</td>
			<td>
				<a href="/detalhar?id=${cliente.id}">DETALHAR</a>
			</td>
			<td>
				<a href="/excluir?id=${cliente.id}">EXCLUIR</a>
			</td>
		</tr> 
    </c:forEach>
	</table>
</body>
</html>