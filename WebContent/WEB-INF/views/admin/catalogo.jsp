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
					Administración de Catálogos <small>Administración</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
					<li class="active">Administración de Catálogos</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="row">
					<div class="col-md-12">
						
						<core:if test="${tipoProyecto eq true}">
							<div class="box box-info">
								<div class="box-header with-border">
						        	<h3 class="box-title">Tipos de Proyectos</h3>
						    	</div>
						    	
								<div class="box-body">
									<div class="col-md-12">
										<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#tipo-proyecto-modal">
											<i class="fa fa-plus"></i> Agregar Registro
										</button>
										<hr>
										<table id="table-tipos-proyectos" class="table table-bordered table-striped">
											<thead>
												<tr>
													<th class="text-center">Descripción</th>
													<th class="text-center">Eliminar</th>
													<th class="text-center">Editar</th>
												</tr>
											</thead>
											<tbody>
												<core:if test="${empty tiposList}">
													<tr>
														<td class="text-center">Aún no se registran tipos de proyectos.</td>
														<td class="text-center"> :( </td>
														<td class="text-center"> :( </td>
													</tr>
												</core:if>
												
												<core:forEach var="tipo" items="${tiposList}">
													<tr id="tipo-proyecto-${tipo.idTipoProyecto}">
														<td class="text-center tipo-desc">${tipo.descripcion}</td>
														<td class="text-center"><a href="#" ide="${tipo.idTipoProyecto}" class="eliminar-modal"><i class="fa fa-remove"></i> Eliminar</a></td>
														<td class="text-center"><a href="#" ide="${tipo.idTipoProyecto}" class="editar-modal"><i class="fa fa-pencil"></i> Editar</a></td>
													</tr>
												</core:forEach>
											</tbody>
										</table>
									</div>
									
								</div>
								<div class="box-footer">
			                  		<a href="inicio.do" class="btn btn-default"><i class="fa fa-home"></i> Ir al Inicio</a>
			                  	</div>
							</div>
						</core:if>
						
					</div>
				</div>
			</section>
		</div>
		
		<jsp:include page="../footer.jsp" />
		
	</div>
	
	
	<div class="modal fade bs-example-modal-lg" role="dialog" id="tipo-proyecto-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<h4 class="modal-title">Agregar Tipo de Proyecto</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label>Descripción</label> 
						<input type="text" class="form-control" id="descripcion-nuevo-tipo" placeholder="Ingrese el valor del nuevo registro">
						<br>
						<div class="alert alert-danger" id="alert-error" role="alert"></div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cancelar</button>
					<button type="button" id="button-guarda-tipo" class="btn btn-primary"><i class="icon fa fa-plus-circle"></i> Guardar</button>
				</div>
			</div>
		</div>
	</div>
	
	<div class="modal fade bs-example-modal-lg" role="dialog" id="tipo-delete-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<h4 id="title-remove" class="modal-title"></h4>
					<input type="hidden" id="ide-temp">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger pull-left" data-dismiss="modal">Cancelar</button>
					<button type="button" id="button-elimina-tipo" class="btn btn-primary"><i class="icon fa fa-check"></i> Aceptar</button>
				</div>
			</div>
		</div>
	</div>
	
	<div class="modal fade bs-example-modal-lg" role="dialog" id="tipo-edita-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<h4 class="modal-title">Editar Tipo de Proyecto</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label>Descripción</label> 
						<input type="text" class="form-control" id="descripcion-edita-tipo" placeholder="Ingrese la descripción del Tipo de Proyecto">
						<br>
						<input type="hidden" id="ide-temp-editar">
						<div class="alert alert-danger" id="alert-error-edit" role="alert"></div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default pull-left" data-dismiss="modal">Cancelar</button>
					<button type="button" id="button-edita-tipo" class="btn btn-primary"><i class="icon fa fa-plus-circle"></i> Guardar</button>
				</div>
			</div>
		</div>
	</div>
	
	<jsp:include page="../js.jsp" />

	<script>
		$(function() {
			$("#alert-error").hide();
			$("#alert-error-edit").hide();
			$('#descripcion-nuevo-tipo').on('input',function(e){
				$("#alert-error").hide();
				$("#alert-error").html("");
			});

		});
			
		$(document).on('click', ".editar-modal", function() {
			var ide = $(this).attr('ide');
			var desc = $(this).closest("tr").find(".tipo-desc").text();
			$("#descripcion-edita-tipo").val(desc);
			$("#ide-temp-editar").val(ide);
			$("#tipo-edita-modal").modal('show');      
		});
		
		$(document).on('click', ".eliminar-modal", function() {
			var ide = $(this).attr('ide');
			var desc = $(this).closest("tr").find(".tipo-desc").text();
			$("#title-remove").html("¿Seguro que desea eliminar el Tipo de Proyecto '"+desc+"'?");
			$("#ide-temp").val(ide);
			$("#tipo-delete-modal").modal('show');      
		});
		
		$(document).on('click', "#button-edita-tipo", function() {
			var ideTemp = $("#ide-temp-editar").val();
			var desc = $("#descripcion-edita-tipo").val();
			
			if(desc === ""){
				$("#alert-error-edit").html("<p>Error</p>");
				$("#alert-error-edit").show();
				
				return false;
			}else if(ideTemp === "" || ideTemp === 0){
				alert("Ocurrió un error al momento de editar el registro. Inténtelo más tarde");
			}else{
				$.post("editar-registro-catalogo.do",{tipo: "tipo_proyecto", ide: ideTemp, value: desc}, function(respuesta){
					if(respuesta === "ok"){
						$("#tipo-proyecto-"+ideTemp).find(".tipo-desc").text(desc);
						$("#tipo-edita-modal").modal('hide');
					}else{
						alert("Ocurrió un error al momento de elimanar registro. Inténtelo más tarde");
					}
				});
			}
			
		});
		
		$(document).on('click', "#button-elimina-tipo", function() {
			var ideTemp = $("#ide-temp").val();
			
			if(ideTemp === "" || ideTemp === 0){
				alert("Ocurrió un error al momento de eliminar registro. Inténtelo más tarde");
			}else{
				$.post("eliminar-registro-catalogo.do",{tipo: "tipo_proyecto", ide: ideTemp}, function(respuesta){
					if(respuesta === "ok"){
						$("#tipo-proyecto-"+ideTemp).remove();
						$("#tipo-delete-modal").modal('hide');
					}else{
						alert("Ocurrió un error al momento de elimanar registro. Inténtelo más tarde");
					}
				});
			}
		});
		
		$(document).on('click', "#button-guarda-tipo", function() {
			var val_tipo = $("#descripcion-nuevo-tipo").val();
			
			if(val_tipo === ""){
				$("#alert-error").html("<p>Error</p>");
				$("#alert-error").show();
				
				return false;
			}else{
				$.post("nuevo-registro-catalogo.do",{tipo: "tipo_proyecto", value: val_tipo}, function(respuesta){
					if(respuesta != ":("){
						$('#table-tipos-proyectos tr:last').after('<tr id="tipo-proyecto-'+respuesta+'">'+
								'<td class="text-center tipo-desc">'+val_tipo+'</td>'+
								'<td class="text-center"><a href="#" ide="'+respuesta+'" class="eliminar-modal"><i class="fa fa-remove"></i> Eliminar</a></td>'+
								'<td class="text-center"><a href="#" ide="'+respuesta+'" class="editar-modal"><i class="fa fa-pencil"></i> Editar</a></td></tr>');
						
						$("#tipo-proyecto-modal").modal('hide');
						$('#descripcion-nuevo-tipo').val("");
					}else{
						alert("Ocurrió un error al momento de guardar registro. Inténtelo más tarde");
					}
				});
			}
		});

	</script>
</body>
</html>