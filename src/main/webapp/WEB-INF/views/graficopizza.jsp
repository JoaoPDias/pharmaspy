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
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
    google.charts.load("current", {packages:["corechart"]});
    google.charts.setOnLoadCallback(drawChartFarmaco);
    google.charts.setOnLoadCallback(drawChartEstado);
    function drawChartFarmaco() {
        var data = google.visualization.arrayToDataTable([
            ['Fármacos', 'Chamados'],
            ['Cloridrato de Doxiciclina',     40],
            ['Axetilcefuroxima',      25],
            ['Amoxicilina',  21],
            ['Acetilcisteína', 17],
            ['Aminofilina',    122]
        ]);

        var options = {
            title: '5 maiores Fármacos reportados',
            is3D: true,
           legend:{'alignment':'center'}
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart_3d_farmaco'));
        chart.draw(data, options);
    }
    function drawChartEstado() {
        var data = google.visualization.arrayToDataTable([
            ['Estados', 'Chamados'],
            ['Minas Gerais',     234],
            ['Mato Grosso',      121],
            ['Rio Grande do Norte',  45],
            ['Amapá', 33],
            ['Santa Catarina',    161]
        ]);

        var options = {
            title: '5 Estados com maior quantidade de chamados',
            is3D: true,
            legend:{'alignment':'center'}
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart_3d_estado'));
        chart.draw(data, options);
    }
</script>
</head>
<title>5 Maiores Fármacos Reportados</title>
<%@include file="fragments/nav.jspf" %>

<div class="container-fluid">
    <div class="row">
        <h6>Visualize abaixo os gráficos com o resumo dos dados</h6>
    </div>
    <div id="piechart_3d_farmaco" style="width: 900px; height: 500px;" class="align-content-lg-center"></div>
    <div id="piechart_3d_estado" style="width: 900px; height: 500px;" class="align-content-lg-center"></div>
</div>

<%@include file="fragments/footer.jspf" %>
<script src="/js/functions.js"></script>