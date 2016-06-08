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
					Revisión SHCP <small>Administración</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
					<li class="active">Revisión SHCP</li>
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
								<table id="detalles_table" class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>Proyecto</th>
											<th>Monto Ministrado SHCP</th>
											<th>Monto Recaudado</th>
											<th>Diferencia</th>
											<th>Observaciones</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>Construcción de Escuela Benito Juarez</td>
											<td>$324,324,678,236,008</td>
											<td>$324,678,236,008</td>
											<td>$435,508</td>
											<td>
												<a href="#" data-toggle="modal" data-target="#observacion_modal">
													<i class="fa fa-comment"></i> Observación
												</a>
											</td>
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
	
	<div class="modal fade bs-example-modal-lg" role="dialog" id="observacion_modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<h4 class="modal-title">Emitir Observación</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label>Observación</label> 
						<textarea class="form-control" rows="4" placeholder="Máximo 140 caracteres"></textarea>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cancelar</button>
					<button type="button" class="btn btn-primary"><i class="icon fa fa-plus-circle"></i> Aceptar</button>
				</div>
			</div>
		</div>
	</div>
	
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
	                "emptyTable":     "Sin información por mostrar",
	                "info":           "Mostrando _START_ de _END_ de _TOTAL_ proyectos",
	                "infoEmpty":      "Sin información por mostrar",
	                "infoFiltered":   "(filtered from _MAX_ total entries)",
	                "infoPostFix":    "",
	                "thousands":      ",",
	                "lengthMenu":     "Mostrar _MENU_ proyectos",
	                "loadingRecords": "Cargando...",
	                "processing":     "Procesando...",
	                "search":         "Buscar:",
	                "zeroRecords":    "Sin información por mostrar",
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