package mx.gob.shcp.dgtsi.sfu.controller;

import mx.gob.shcp.dgtsi.sfu.service.AdministracionServiceInterfase;
import mx.gob.shcp.dgtsi.sfu.util.SpringServiceFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
	
	private final AdministracionServiceInterfase adminService = (AdministracionServiceInterfase) SpringServiceFactory.createBean("adminService");
	String user_dependencia = "Secretaría de Hacienda y Crédito Público";
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/revision-proyectos.do")
	public String revision(Model model){
		model.addAttribute("user_dependencia", user_dependencia);
		model.addAttribute("esAdmin", true);
		
		return "admin/revision_proyectos"; 		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/reportes.do")
	public String reportes(Model model){
		model.addAttribute("user_dependencia", user_dependencia);
		model.addAttribute("esAdmin", true);
		
		return "admin/reportes"; 		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/seguimiento.do")
	public String seguimiento(Model model){
		model.addAttribute("user_dependencia", user_dependencia);
		model.addAttribute("esAdmin", true);
		
		return "admin/seguimiento"; 		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/administracion-campos.do")
	public String camposAdmin(Model model){
		model.addAttribute("user_dependencia", user_dependencia);
		model.addAttribute("esAdmin", true);
		
		return "admin/campos-captura"; 		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/catalogos.do")
	public String camposAdmin(@RequestParam String tipo, Model model){
		model.addAttribute("user_dependencia", user_dependencia);
		model.addAttribute("esAdmin", true);
		
		if(tipo.equalsIgnoreCase("tipo_proyecto")){
			model.addAttribute("tipoProyecto", true);
			model.addAttribute("tiposList", adminService.getTiposProyecto());
		}
		
		return "admin/catalogo"; 		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/nuevo-registro-catalogo.do")
	public @ResponseBody String nuevo(String tipo, String value, Model model){
		
		if(tipo.equalsIgnoreCase("tipo_proyecto")){
			if(!value.isEmpty()){
				if(adminService.saveTipoProyecto(value)){
					int idTipo = adminService.getTipoProyectoByDesc(value);
					if(idTipo != 0){
						return ""+idTipo;
					}
				}
			}
		}
		
		return ":(";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/eliminar-registro-catalogo.do")
	public @ResponseBody String eliminar(String tipo, String ide, Model model){
		if(tipo.equalsIgnoreCase("tipo_proyecto")){
			if(!ide.isEmpty()){
				if(adminService.removeTipoProyecto(Integer.parseInt(ide))){
					return "ok";
				}
			}
		}
		
		return ":(";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/editar-registro-catalogo.do")
	public @ResponseBody String editar(String tipo, String ide, String value, Model model){
		
		if(tipo.equalsIgnoreCase("tipo_proyecto")){
			if(!value.isEmpty() && !ide.isEmpty()){
				if(adminService.editTipoProyecto(Integer.parseInt(ide), value)){
					return "ok";
				}
			}
		}
		
		return ":(";
	}
}
