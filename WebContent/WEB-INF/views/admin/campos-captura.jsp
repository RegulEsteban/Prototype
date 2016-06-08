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
					Administración de Campos del Proyecto<small>Administración</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
					<li class="active">Administración de Campos del Proyecto</li>
				</ol>
			</section>

			<section class="content">

				<div class="row">
					<div class="col-md-12">
						
						<div class="box box-info">
					    	<div class="box-header with-border">
					        	<h3 class="box-title">Administración de Campos del Proyecto</h3>
					        </div>
					                
			                <form class="form-horizontal">
			                	<div class="box-body">
			                    	
			                    	<div class="form-group">
			                      		<label class="col-sm-4 control-label">Fuente de financiamiento</label>
			                      		<div class="col-sm-8">
			                        		<select class="form-control">
												<option value="0">Selecciona la Fuente de Financiamiento</option>
												<option>option 1</option>
												<option>option 2</option>
												<option>option 3</option>
												<option>option 4</option>
												<option>option 5</option>
											</select>
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
							
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="nombreProyecto">Nombre del Proyecto</label> 
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox" id="check_nombre">
						                        </span>
						                        <input type="text" class="form-control" id="check_nombre_text" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group">
											<label>Tipo de Programa o Proyecto</label> 
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox" id="check_tipo">
						                        </span>
						                        <input type="text" class="form-control" id="check_tipo_text" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group">
											<label>Clasificación del Proyecto</label>
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox" id="check_clasif">
						                        </span>
						                        <input type="text" class="form-control" id="check_clasif_text" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group">
											<label>Fecha de Inicio</label>
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="instEjecutora">Institución Ejecutora</label> 
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group">
											<label for="instEjecutora">Entidad Federativa</label> 
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group">
											<label for="municipio">Municipio</label>
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group">
											<label>Fecha estimada de término</label>
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
									</div>
									
									<div class="col-md-6">
										<h4>Meta Estimada</h4>
									
										<div class="form-group">
											<label>Unidad de Medida</label>
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
									
										<div class="form-group">
											<label for="num_meta">Meta</label> 
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
									
										<h4>Población Beneficiada</h4>
										
										<div class="form-group div_beneficio">
											<label>Mujeres</label>
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group div_beneficio">
											<label>Hombres</label>
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
									</div>
									<div class="col-md-6">
										<h4>Geolocalización</h4>
										<div class="form-group">
											<label for="direccion">Dirección</label> 
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group">
											<label for="latitud">Latitud</label> 
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										<div class="form-group">
											<label for="longitud">Longitud</label> 
											<div class="input-group">
						                        <span class="input-group-addon">
						                        	<input type="checkbox">
						                        </span>
						                        <input type="text" class="form-control" disabled="disabled" value="No Obligatorio">
						                    </div>
										</div>
										
										<hr>
										<button type="button" class="btn btn-primary btn-lg pull-right"><i class="fa fa-check"></i> Guardar Cambios</button>
									</div>

								</div>
								
							</div>
						</div>

					</div>
				</div>
			</section>
		</div>
		
		<jsp:include page="../footer.jsp" />
		
	</div>
	
	<jsp:include page="../js.jsp" />
	
	<script>
		$(function() {
			
			$('#check_nombre').change(function() {
		        if($(this).is(":checked")) {
// 		            var returnVal = confirm("Are you sure?");
// 		            $(this).attr("checked", returnVal);
		            $('#check_nombre_text').val("Obligatorio");
		        }else{
		        	$('#check_nombre_text').val("No Obligatorio");
		        }
		                
		    });
			
			$('#check_tipo').change(function() {
		        if($(this).is(":checked")) {
		            $('#check_tipo_text').val("Obligatorio");
		        }else{
		        	$('#check_tipo_text').val("No Obligatorio");
		        }
		    });
			
			$('#check_clasif').change(function() {
		        if($(this).is(":checked")) {
		            $('#check_clasif_text').val("Obligatorio");
		        }else{
		        	$('#check_clasif_text').val("No Obligatorio");
		        }
		    });

		});

	</script>
</body>
</html>