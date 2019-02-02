<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	<table border="1">
	<c:forEach var="cliente" items="${clientes}">
        <tr>
			<td>
				<a href="/excluir">EXCLUIR</a>
				<a href="/editar">ALTERAR</a>
			</td>
			<td>
				${cliente.nome}
			</td>
		</tr> 
    </c:forEach>
	</table>
</body>
</html>