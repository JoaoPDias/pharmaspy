<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
--%>

<%@include file="fragments/header.jspf" %>
</head>
<%@include file="fragments/nav.jspf" %>
<div class="row">
    <div class="col-lg-4 col-md-4 col-sm-12"></div>
    <div class="col-lg-4 col-md-4 col-sm-12">
        <form class="form" method="post" action="/cadastro-usuario.html">
            <div class="form-group">
                <label for="tipo">Categoria do Usuário</label>
                <select id="tipo" name='tipo' class="form-control">
                    <c:forEach items="${tipos}" var="tipo">
                        <option value="${tipo.id}">${tipo.nome}</option>
                    </c:forEach>
                </select
            </div>
            <div class="form-group">
                <label for="nome">Nome</label>
                <input type="text" class="form-control" id="nome" name="nome"
                       placeholder="Nome">
            </div>
            <div class="form-group">
                <label for="nascimento">Nascimento</label>
                <input type="date" class="form-control" id="nascimento" name="nascimento" placeholder="Nascimento">
            </div>
            <div class="form-group">
                <label for="cidade">Cidade</label>
                <input type="text" class="form-control" id="cidade" name="cidade"
                       placeholder="Cidade">

            </div>
            <div class="form-group">
                <label for="estado">Estado</label>
                <select id="estado" name='estado' class="form-control">
                    <c:forEach items="${estados}" var="estado">
                        <option value="${estado.id}">${estado.nome}</option>
                    </c:forEach>
                </select
            </div>
            <div class="form-group">
                <label for="email">E-mail</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="E-mail do Membro">
            </div>
            <div class="form-group">
                <label for="senha">Senha</label>
                <input type="password" class="form-control" id="senha" name="senha" placeholder="Senha">
            </div>

            <button type="submit" class="btn btn-success">Salvar</button>
            <button type="reset" class="btn btn-danger">Cancelar</button>
        </form>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-12"></div>
</div>
<%@include file="fragments/footer.jspf" %>