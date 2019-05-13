<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<body onload="updateSize();">
<%@include file="fragments/nav.jspf" %>
<div class="row">
    <div class="col-lg-4 col-md-4 col-sm-12"></div>
    <div class="col-lg-4 col-md-4 col-sm-12">
        <form class="form" method="post" action="/chamado.html" enctype="multipart/form-data">
            Estamos abrindo um chamado. Relate preenchendo as informações abaixo:
            <div class="form-group">
                <label for="medicamento">Medicamento Escolhido</label>
                <input type="text" class="form-control" id="medicamento"
                       placeholder="Medicamento" readonly value="${medicamento.nomeMedicamento}">
                <input type="hidden" value="${medicamento.idMedicamento}" name="medicamento">
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
                <label for="farmacia">Fármacia ou Drogaria em que o medicamento foi adquirido</label>
                <input type="text" class="form-control" id="farmacia" name="farmacia"
                       placeholder="Farmácia ou Drogaria de Aquisição">
            </div>

            <div class="form-group">
                <label for="cep">CEP do Estabelecimento</label>
                <input type="text" class="form-control" id="cep" name="cep"
                       placeholder="*****-***">
                <button class="btn btn-success" type="button" onclick="buscaCep()">Buscar Endereço</button>
            </div>

            <div class="form-group">
                <label for="logradouro">Logradouro do Estabelecimento</label>
                <input type="text" class="form-control" id="logradouro" name="logradouro" readonly>
            </div>

            <div class="form-group">
                <label for="bairro">Bairro do Estabelecimento</label>
                <input type="text" class="form-control" id="bairro" name="bairro" readonly>
            </div>

            <div class="form-group">
                <label for="cep">Complemento</label>
                <input type="text" class="form-control" id="complemento" name="complemento">
            </div>

            <div class="form-group">
                <label for="cep">Cidade do Estabelecimento</label>
                <input type="text" class="form-control" id="localidade" name="localidade" readonly>
            </div>

            <div class="form-group">
                <label for="cep">UF do Estabelecimento</label>
                <input type="text" class="form-control" id="uf" name="uf" readonly>
            </div>

            <div class="form-group">

                <label for="relato">Relato</label>
                <textarea class="form-control" id="relato" name="relato" rows="10" cols="40" maxlength="500" placeholder="Relate aqui a experiência que teve com o medicamento escolhido.">

               </textarea>

            </div>


            <div class="form-group">
                <label for="fileInput">Anexar foto</label>
                <input id="fileInput" type="file" name="uploadingFiles" onchange="updateSize();" multiple>
                <small class="form-text text-muted">
                    Arquivos Selecionados: <span id="fileNum">0</span>
                </small>

            </div>

            <button type="submit" class="btn btn-success">Salvar</button>
            <button type="reset" class="btn btn-danger">Cancelar</button>
        </form>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-12"></div>
</div>
<%@include file="fragments/footer.jspf" %>
<script src="/js/functions.js"></script>