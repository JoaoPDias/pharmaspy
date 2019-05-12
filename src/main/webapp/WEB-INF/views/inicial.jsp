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
        <h6>Perfil</h6>
        <img src="/images/logoPharmaSpy.jpg" class="rounded mx-auto d-block" width="150" height="250" align="left" alt="Perfil">

    </div>
    <div class="col">

        <p>
        <img src="/images/logoPharmaSpy.jpg" class="rounded mx-auto d-block" width="500" height="166" align="left" alt="Imagem">
        <br/>
        <h6>PharmaSpy</h6>
        </p>
    </div>

</div>
</div>
<%@include file="fragments/footer.jspf" %>