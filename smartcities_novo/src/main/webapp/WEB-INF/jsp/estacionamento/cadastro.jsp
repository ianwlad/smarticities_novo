<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Estacionamento</title>
</head>
<body>
	<h1>Cadastro de estacionamento</h1>
	${msg }
	<c:url value="/estacionamento/cadastrar" var="action" />
	<form:form action="${action }" method="post" commandName="estacionamento">
		<div class="form-group">
			<form:label path="nome">Nome</form:label>
			<form:input path="nome"/>
		</div>
		<div class="form-group">
			<form:label path="endereco">Endereço</form:label>
			<form:input path="endereco"/>
		</div>
		<div class="form-group">
			<form:label path="vagas">Número de Vagas</form:label>
			<form:input path="vagas" />
		</div>
		<div class="form-group">
			<form:label path="preco">Preço</form:label>
			<form:input path="preco"/>
		</div>
		<input type="submit" value="Salvar">
	</form:form>
</body>
</html>