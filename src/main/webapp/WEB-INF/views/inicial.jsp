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

<br/>
<div class ="container-fluid">
<div class="row">
    <div class="col col-lg-4">
        <br>
        <h5>Perfil</h5>
        <img src="/images/foto.jpg"  width="150" height="200"  alt="Perfil">
        <br><h6>Rian Alves</h6>
        <h6>24 anos</h6><br>
    </div>
    <div class="col">

        <br>
        <h5>Bem vindo ao PharmaSpy, Rian Alves</h5><br>
        <p>
            <br>

        <a href="escolha-medicamento.html" class="btn btn-info">Iniciar Novo Chamado</a>
            <a href="escolha-medicamento.html" class="btn btn-primary">Meus chamados</a>
            <br>
        <br>

        <h6>Notícias_____________________________________________________________________</h6>
        <br><br>
        <h6>
            <a href="https://oglobo.globo.com/economia/defesa-do-consumidor/anvisa-suspende-importacao-venda-de-remedio-para-hipertensao-arterial-23007291">
                Anvisa suspende importação e venda de remédio para hipertensão arterial

            </a>
        </h6>
        <img src="/images/pilula.png"  width="400" height="290"  alt="Perfil"><br>

        RIO — A importação, a distribuição e a venda do insumo farmacêutico ativo valsartana fabricado por uma empresa chinesa e
        outra indiana foram suspensas pela Agência Nacional de Vigilância Sanitária (Anvisa).
        Segundo o órgão, uma entidade europeia de controle de medicamentos encontrou a impureza tóxica N-nitrosodimetilamina (NDMA)
        no produto, com um "elevado risco sanitário para a saúde pública".
        <a href="https://oglobo.globo.com/economia/defesa-do-consumidor/anvisa-suspende-importacao-venda-de-remedio-para-hipertensao-arterial-23007291">
           Continua...
        </a>
        </p>
    </div>
    <div class="col">
        <br>
        <h5>Útimos Chamados</h5>
    </div>

</div>
</div>
<%@include file="fragments/footer.jspf" %>