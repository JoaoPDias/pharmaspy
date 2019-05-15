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
    <div class="col"></div>
    <div class="col-6">
        <form class="form" method="post" action="/escolha-medicamento.html">
            <br>
            <h5>Para iniciar um chamado, escolha o medicamento que deseja relatar o efeito adverso:</h5>

                <input type="text" class="form-control form-control-lg" id="buscamedicamento" name="buscamedicamento"
                       placeholder="Busque aqui o produto fármaco para o qual deseja abrir chamado">
                <br>
                <button type="submit" class="btn btn-success">Buscar Medicamento</button>


        </form>
        <br>

    </div>
    <div class="col"></div>

</div>
<div class="row">
    <div class="col"></div>
    <div class="col-6">
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
        <div class="col"></div>
</div>
</div>
<%@include file="fragments/footer.jspf" %>