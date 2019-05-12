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
        <form class="form" method="post" action="/chamado.html">
            Estamos abrindo um chamado. Relate preenchendo as informações abaixo:
            <div class="form-group">
                <label for="medicamento">Escolha o medicamento: </label>
                <select id="medicamento" name='medicamento' class="form-control">
                    <c:forEach items="${medicamentos}" var="medicamento">
                        <option value="${medicamento.id}">${medicamento.nome}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label for="vencimento">Vencimento</label>
                <input type="date" class="form-control" id="vencimento" name="vencimento" placeholder="**/**/****">
            </div>
            <div class="form-group">
                <label for="lote">Lote</label>
                <input type="text" class="form-control" id="lote" name="lote"
                       placeholder="Lote">
            </div>

            <div class="form-group">
                <label for="farmaceutico">Laboratório: </label>
                <select id="farmaceutico" name='farmaceutico' class="form-control">
                    <c:forEach items="${farmaceuticas}" var="farmaceutico">
                        <option value="${farmaceutico.id}">${farmaceutico.nome}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label for="relato">Relato</label>
                <input type="text" class="form-control" id="relato" name="relato"
                       placeholder="Relato">
            </div>

            <div class="form-group">
                <label for="anexo">Anexo</label>
                <input type="text" class="form-control" id="anexo" name="anexo"
                       placeholder="Anexo">

                <button>Anexar Foto</button>
            </div>



            <button type="submit" class="btn btn-success">Salvar</button>
            <button type="reset" class="btn btn-danger">Cancelar</button>
        </form>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-12"></div>
</div>
<%@include file="fragments/footer.jspf" %>