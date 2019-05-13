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

function buscaCep() {
    var cep = $('#cep').val();
    var logradouro = $('#logradouro');
    var bairro = $('#bairro');
    var complemento = $('#complemento');
    var localidade = $('#localidade');
    var uf = $('#uf');

    $.ajax({
        type: "POST",
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        url: "/endereco.html",
        data: JSON.stringify(cep), // Note it is important
        success: function (result) {
            console.log(result.localidade);
            logradouro.val(result.logradouro);
            bairro.val(result.bairro);
            complemento.val(result.complemento);
            localidade.val(result.localidade);
            uf.val(result.uf);
        }
    });
}