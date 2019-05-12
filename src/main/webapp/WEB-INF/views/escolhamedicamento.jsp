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
        <form class="form" method="post" action="/escolha-medicamento.html">
            Para iniciar um chamado, escolha o medicamento que deseja relatar o efeito adverso:


            <div class="form-group">
                <label for="buscamedicamento">Buscar</label>
                <input type="text" class="form-control" id="buscamedicamento" name="buscamedicamento"
                       placeholder="Busque aqui o medicamento que deseja encontrar">

                <button type="submit" class="btn btn-success">Buscar Medicamento</button>
                <button type="reset" class="btn btn-danger">Cancelar</button>
            </div>

            <br>
            <table class="table">
                <thead>
                <th>Medicamento</th>
                <th>Laboratório</th>
                <th>Ação</th>
                </thead>
                <tbody>
                <c:forEach var="medicamento" items="${medicamentos}">
                    <tr>
                        <td>${medicamento.nome}</td>
                        <td>${medicamento.laboratorio}</td>
                        <td><a href="chamado.html/${medicamento.id}" class="btn btn-primary">Iniciar Chamado</a></td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>


        </form>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-12"></div>
</div>
<%@include file="fragments/footer.jspf" %>