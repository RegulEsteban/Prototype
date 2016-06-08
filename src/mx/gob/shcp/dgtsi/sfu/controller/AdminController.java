package mx.gob.shcp.dgtsi.sfu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
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
		}
		
		return "admin/catalogo"; 		
	}
}
