
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
<title>PharmaSpy</title>
</head>

<div class="row">
    <div class="col"></div>
    <div class="col"></div>
    <div class="col"><br/>
        <div class="box-parent-login">
            <div class="well bg-white box-login">


                <img src="imagem/logoPharmaSpy2s.jpg" class="rounded mx-auto d-block" width="500" height="166" alt="Imagem">
                <br/>
                <form method="post">
                    <fieldset>

                        <div class="form-group ls-login-user">
                            <label for="userLogin">E-mail</label>
                            <input class="form-control ls-login-bg-user input-lg" id="userLogin" type="text" aria-label="Usuário" placeholder="Usuário" name="usuario">
                        </div>

                        <div class="form-group ls-login-password">
                            <label for="userPassword">Senha</label>
                            <input class="form-control ls-login-bg-password input-lg" id="userPassword" type="password" aria-label="Senha" placeholder="Senha" name="senha">
                        </div>

                        <center><a href="">Esqueci minha senha</a></center><br/>

                        <input type="submit" value="Entrar" class="btn btn-primary btn-lg btn-block" name="acessar" >

                        <center>Não possui cadastro? </center>
                        <center> <a href="">Cadastre-se agora</a></center>

                    </fieldset>
                </form>
            </div>
            <c:if test="${erroLogin == true}">
                <div class="alert alert-danger" role="alert">
                    <center>Erro ao realizar Login! Verifique a senha!</center>
                </div>
            </c:if>
        </div>
    </div>
    <div class="col"></div>
    <div class="col"></div>
</div>

<%@include file="fragments/footer.jspf" %>