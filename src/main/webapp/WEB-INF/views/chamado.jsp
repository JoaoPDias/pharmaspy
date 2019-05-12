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
        <form class="form" method="post" action="/chamado.html">
            Estamos abrindo um chamado. Relate preenchendo as informações abaixo:
            <div class="form-group">
                <label for="medicamento">Medicamento Escolhido</label>
                <input type="text" class="form-control" id="medicamento" name="medicamento"
                       placeholder="Medicamento" readonly value="${medicamento.nomeMedicamento}">
                <input type="hidden" value="${medicamento.idMedicamento}">
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
                <label for="lote">Fármacia ou Drogaria em que o medicamento foi adquirido</label>
                <input type="text" class="form-control" id="lote" name="lote"
                       placeholder="Lote">
            </div>

            <div class="form-group">
                <label for="lote">CEP do Estabelecimento</label>
                <input type="text" class="form-control" id="cep" name="cep"
                       placeholder="*****-***">
            </div>

            <div class="form-group">

                <label for="relato">Relato</label>
               <textarea class="form-control" id="relato" name="relato" rows="10" cols="40" maxlength="500">
                   Relate aqui a experiência que teve com o medicamento escolhido.
               </textarea>

            </div>


            <form name="uploadingForm" enctype="multipart/form-data" action="/upload.html" method="POST">
                <p>
                    Anexar foto
                    <input id="fileInput" type="file" name="uploadingFiles" onchange="updateSize();" multiple>
                    selected files: <span id="fileNum">0</span>;
                    total size: <span id="fileSize">0</span>
                </p>
                <p>
                    <input type="submit" value="Upload files">
                </p>
            </form>
            <script>
                function updateSize() {
                    var nBytes = 0,
                        oFiles = document.getElementById("fileInput").files,
                        nFiles = oFiles.length;
                    for (var nFileId = 0; nFileId < nFiles; nFileId++) {
                        nBytes += oFiles[nFileId].size;
                    }

                    var sOutput = nBytes + " bytes";
                    // optional code for multiples approximation
                    for (var aMultiples = ["KiB", "MiB", "GiB", "TiB", "PiB", "EiB", "ZiB", "YiB"], nMultiple = 0, nApprox = nBytes / 1024; nApprox > 1; nApprox /= 1024, nMultiple++) {
                        sOutput = nApprox.toFixed(3) + " " + aMultiples[nMultiple] + " (" + nBytes + " bytes)";
                    }
                    // end of optional code

                    document.getElementById("fileNum").innerHTML = nFiles;
                    document.getElementById("fileSize").innerHTML = sOutput;
                }
            </script>

            <button type="submit" class="btn btn-success">Salvar</button>
            <button type="reset" class="btn btn-danger">Cancelar</button>
        </form>
    </div>
    <div class="col-lg-4 col-md-4 col-sm-12"></div>
</div>
<%@include file="fragments/footer.jspf" %>