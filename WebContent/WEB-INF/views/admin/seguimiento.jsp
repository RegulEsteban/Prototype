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
					Reportes <small>Proyectos de Inversión</small>
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
					        	<h3 class="box-title">Consulta de proyectos</h3>
					        </div>
					                
			                <form class="form-horizontal">
			                	<div class="box-body">
			                    	<div class="col-md-6">
			                    		<div class="form-group">
				                      		<label class="col-sm-4 control-label">Entidad Federativa</label>
				                      		<div class="col-sm-8">
				                        		<input type="text" class="form-control" value="Aguascalientes" disabled="disabled">
				                      		</div>
				                    	</div>
				                    	<div class="form-group">
				                      		<label class="col-sm-4 control-label">Municipio</label>
				                      		<div class="col-sm-8">
				                        		<input type="text" class="form-control" value="Asientos" disabled="disabled">
				                      		</div>
				                    	</div>
				                    	<div class="form-group">
				                      		<label class="col-sm-4 control-label">Trimestre</label>
				                      		<div class="col-sm-8">
				                        		<input type="text" class="form-control" placeholder="Trimestre">
				                      		</div>
				                    	</div>
			                    	</div>
			                    	<div class="col-md-6">
			                    		<div class="form-group">
				                      		<label class="col-sm-4 control-label">Ramo</label>
				                      		<div class="col-sm-8">
				                        		<input type="text" class="form-control" placeholder="Ramo">
				                      		</div>
				                    	</div>
				                    	<div class="form-group">
				                      		<label class="col-sm-4 control-label">Programa Presupuestario</label>
				                      		<div class="col-sm-8">
				                        		<input type="text" class="form-control" placeholder="Programa Presupuestario">
				                      		</div>
				                    	</div>
				                    	<div class="form-group">
				                      		<label class="col-sm-4 control-label">Ciclo de Recursos</label>
				                      		<div class="col-sm-8">
				                        		<input type="text" class="form-control" placeholder="Ciclo de Recursos">
				                      		</div>
				                    	</div>
			                    	</div>
			                  	</div>
			                  	<div class="box-footer">
			                  		<a href="inicio.do" class="btn btn-default"><i class="fa fa-home"></i> Ir al Inicio</a>
			                    	<button type="button" class="btn btn-info bg-aqua pull-right"><i class="fa fa-search"></i> Consultar</button>
			                  	</div>
			                </form>
					    </div>
					              
						<div class="box box-info">
							<div class="box-body">
								<button type="button" class="btn btn-info bg-aqua"><i class="fa fa-download"></i> Descargar Consulta</button>
								<table id="detalles_table" class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>Entidad Federativa</th>
											<th>Municipio</th>
											<th>Ramo</th>
											<th>Programa Presupuestario</th>
											<th>Ciclo de Recursos</th>
											<th>Registrados</th>
											<th>Observados</th>
											<th>Revisados</th>
											<th>Total</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>Aguascalientes</td>
											<td>Asientos</td>
											<td>28 Energía</td>
											<td>200L Programa de atención a los amigos</td>
											<td>2016</td>
											<td>45</td>
											<td>87</td>
											<td>17</td>
											<td>356</td>
										</tr>
									</tbody>
								</table>
								
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