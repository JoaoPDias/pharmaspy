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
    <div class="col-lg-10 col-md-10 col-sm-12">
        <form class="form" method="post" action="/escolha-medicamento.html">
            <h3>Para iniciar um chamado, escolha o medicamento que deseja relatar o efeito adverso:</h3>
            <div class="col-lg-9 container-fluid">
                <input type="text" class="form-control form-control-lg" id="buscamedicamento" name="buscamedicamento"
                       placeholder="Busque aqui o medicamento que deseja abrir chamado">
                <br>
                <button type="submit" class="btn btn-success">Buscar Medicamento</button>
            </div>

        </form>
        <br>
        <div class="col-lg-12 col-md-12 col-sm-12">
            <table class="table table-responsive-sm">
                <thead>
                <th>Medicamento</th>
                <th>Laboratório</th>
                <th>Ação</th>
                </thead>
                <tbody>
                <c:forEach var="medicamento" items="${medicamentos}">
                    <tr>
                        <td>${medicamento.nomeMedicamento}</td>
                        <td>${medicamento.farmaceutica.nome}</td>
                        <td><a href="chamado.html/${medicamento.idMedicamento}" class="btn btn-primary">Iniciar
                            Chamado</a>
                        </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</div>
<%@include file="fragments/footer.jspf" %>