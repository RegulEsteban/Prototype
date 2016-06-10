package mx.gob.shcp.dgtsi.sfu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/inicio.do")
	public String inicio(Model model){
		
//		model.addAttribute("esCaptura", true);
//		model.addAttribute("esRevisor", true);
//		model.addAttribute("esObservador", true);
		
		model.addAttribute("user_municipio", "Asientos");
		model.addAttribute("user_entidad_fed", "Aguascalientes");
		model.addAttribute("user_dependencia", "Secretaría de Hacienda y Crédito Público");
		model.addAttribute("esAdmin", true);

		return "inicio";
	}
}
