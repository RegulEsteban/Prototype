<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../jstl.jsp"%>
<!DOCTYPE html >
<html>
<head>
    <jsp:include page="../head.jsp" />
</head>

<body class="hold-transition skin-black-light layout-top-nav">
	<div class="wrapper">
		<%@include file="../menu.jsp"%>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					Reportes <small>Administración</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
					<li class="active">Reportes</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="row">
					<div class="col-md-12">
					
						<div class="box box-info">
							<div class="box-header with-border">
					        	<h3 class="box-title">Generar Reportes</h3>
					    	</div>
					    	
							<div class="box-body">
								<table id="detalles_table" class="table table-bordered table-striped">
									<thead>
										<tr>
											<th class="text-center">Aspectos Generales</th>
											<th class="text-center">Reportado</th>
											<th class="text-center">Generar Reporte</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td class="text-center">1.- Número de Proyectos</td>
											<td class="text-center">45</td>
											<td class="text-center"><a href="#"><i class="fa fa-download"></i> Generar Reporte</a></td>
										</tr>
										<tr>
											<td class="text-center">2.- Localización de proyectos</td>
											<td class="text-center">45</td>
											<td class="text-center"><a href="#"><i class="fa fa-download"></i> Generar Reporte</a></td>
										</tr>
									</tbody>
								</table>
								
							</div>
							<div class="box-footer">
		                  		<a href="inicio.do" class="btn btn-default"><i class="fa fa-home"></i> Ir al Inicio</a>
		                  	</div>
						</div>
					</div>
				</div>
			</section>
		</div>
		
		<jsp:include page="../footer.jsp" />
		
	</div>
	<!-- ./wrapper -->
	
	<jsp:include page="../js.jsp" />
	
	<script>
		$(function() {

			$("#detalles_table").DataTable({
				"paging" : true,
				"lengthChange" : false,
				"searching" : true,
				"info" : false,
// 				"scrollX": true,
				"lengthMenu": [[ 10, 25, 50, -1], [ 10, 25, 50, "Todos"]],
				"language": {
	            	"decimal":        "",
	                "emptyTable":     "Sin proyectos por mostrar",
	                "info":           "Mostrando _START_ de _END_ de _TOTAL_ proyectos",
	                "infoEmpty":      "0 proyectos",
	                "infoFiltered":   "(filtered from _MAX_ total entries)",
	                "infoPostFix":    "",
	                "thousands":      ",",
	                "lengthMenu":     "Mostrar _MENU_ proyectos",
	                "loadingRecords": "Cargando...",
	                "processing":     "Procesando...",
	                "search":         "Buscar:",
	                "zeroRecords":    "Ningún proyecto encontrado",
	                "paginate": {
	                    "first":      "Primero",
	                    "last":       "Último",
	                    "next":       "Siguiente",
	                    "previous":   "Anterior"
	                },
	                "aria": {
	                    "sortAscending":  ": activate to sort column ascending",
	                    "sortDescending": ": activate to sort column descending"
	                }
	            }
			});

		});

	</script>
</body>
</html>