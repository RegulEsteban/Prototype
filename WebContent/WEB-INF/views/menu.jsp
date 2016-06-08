<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<noscript>
	<div class="alert alert-danger" role="alert">
    	<h3><i class="fa fa-warning"></i> Por favor de habilitar Javascript para un buen funcionamiento en la página.</h3>
    </div>
</noscript>
<header class="main-header">
<!-- esto es un cambio -->
	<!-- Header Navbar: style can be found in header.less -->
	<nav class="navbar navbar-static-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a href="http://www.hacienda.gob.mx" class="navbar-brand">
					<img alt="Brand" src="./THEME_SFU/dist/img/shcp_logo.jpg" style="max-width:200px; margin-top: -7px;margin-right: 15px;">
				</a>
				<a href="inicio.do" class="navbar-brand">
					<img alt="Brand" src="./THEME_SFU/dist/img/sfu_logo.png" class="brand-img" style="max-width:200px; margin-top: -7px;">
				</a>
			</div>
			
			<div class="navbar-custom-menu">
				<ul class="nav navbar-nav">
					<!-- Messages: style can be found in dropdown.less-->
					<li class="dropdown messages-menu">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  			<i class="fa fa-envelope-o"></i>
                  			<span class="label label-danger">4</span>
                		</a>
						<ul class="dropdown-menu">
							<li class="header">Tienes 4 mensajes</li>
							<li>
								<!-- inner menu: contains the actual data -->
								<ul class="menu">
									<li>
										<!-- start message --> 
										<a href="#">
											<div class="pull-left"><img src="dist/img/asientos-ags.jpg" class="img-circle" alt="User Image"></div>
											<h4>Support Team <small><i class="fa fa-clock-o"></i> 5 mins</small></h4>
											<p>Why not buy a new awesome theme?</p>
										</a>
									</li>
									<!-- end message -->
									<li>
										<a href="#">
											<div class="pull-left"><img src="dist/img/user3-128x128.jpg" class="img-circle" alt="User Image"></div>
											<h4>AdminLTE Design Team <small><i class="fa fa-clock-o"></i> 2 hours</small></h4>
											<p>Why not buy a new awesome theme?</p>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="pull-left"><img src="dist/img/user4-128x128.jpg" class="img-circle" alt="User Image"></div>
											<h4>Developers <small><i class="fa fa-clock-o"></i> Today</small></h4>
											<p>Why not buy a new awesome theme?</p>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="pull-left"><img src="dist/img/user3-128x128.jpg" class="img-circle" alt="User Image"></div>
											<h4>Sales Department <small><i class="fa fa-clock-o"></i> Yesterday</small></h4>
											<p>Why not buy a new awesome theme?</p>
										</a>
									</li>
									<li>
										<a href="#">
											<div class="pull-left"><img src="dist/img/user4-128x128.jpg" class="img-circle" alt="User Image"></div>
											<h4>Reviewers <small><i class="fa fa-clock-o"></i> 2 days</small></h4>
											<p>Why not buy a new awesome theme?</p>
										</a>
									</li>
								</ul>
							</li>
							<li class="footer"><a href="#">See All Messages</a></li>
						</ul>
					</li>
					<!-- Notifications: style can be found in dropdown.less -->
					<li class="dropdown notifications-menu">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
							<i class="fa fa-bell-o"></i> <span class="label label-danger">10</span>
						</a>
						<ul class="dropdown-menu">
							<li class="header">Tienes 10 notificaciones</li>
							<li>
								<!-- inner menu: contains the actual data -->
								<ul class="menu">
									<li>
										<a href="#"> <i class="fa fa-users text-aqua"></i> 5 new members joined today</a>
									</li>
									<li>
										<a href="#"> <i class="fa fa-warning text-yellow"></i> Very long description here that may not fit into the page and may cause design problems</a>
									</li>
									<li>
										<a href="#"> <i class="fa fa-users text-red"></i> 5 new members joined</a>
									</li>
									<li>
										<a href="#"> <i class="fa fa-shopping-cart text-green"></i> 25 sales made</a>
									</li>
									<li>
										<a href="#"> <i class="fa fa-user text-red"></i>You changed your username</a>
									</li>
								</ul>
							</li>
							<li class="footer"><a href="#">View all</a></li>
						</ul>
					</li>

					<!-- User Account: style can be found in dropdown.less -->
					<li class="dropdown user user-menu">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<img src="./THEME_SFU/dist/img/asientos-ags.jpg" class="user-image" alt="User Image">
							<core:choose>
								<core:when test="${esAdmin eq true}">
									<span class="hidden-xs-user">${user_dependencia}</span>
								</core:when>
								<core:otherwise>
									<span class="hidden-xs-user">${user_entidad_fed}/${user_municipio}</span>
								</core:otherwise>
							</core:choose>
						</a>
						<ul class="dropdown-menu">
							<!-- User image -->
							<li class="user-header">
								<img src="./THEME_SFU/dist/img/asientos-ags.jpg" class="img-circle" alt="User Image">
								<core:choose>
									<core:when test="${esAdmin eq true}">
										<p>${user_dependencia}</p>
									</core:when>
									<core:otherwise>
										<p>${user_municipio} <small>${user_entidad_fed}</small></p>
									</core:otherwise>
								</core:choose>
								
							</li>
							<li class="user-footer">
								<div class="pull-left">
									<a href="#" class="btn btn-default btn-flat">Perfil</a>
								</div>
								<div class="pull-right">
									<a href="#" class="btn btn-default btn-flat">Cerrar Sesión</a>
								</div>
							</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</nav>
</header>