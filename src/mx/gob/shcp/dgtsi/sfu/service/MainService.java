package mx.gob.shcp.dgtsi.sfu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.gob.shcp.dgtsi.sfu.proyectos.model.ClasifProyectoCat;
import mx.gob.shcp.dgtsi.sfu.proyectos.model.ClasifProyectoCatExample;
import mx.gob.shcp.dgtsi.sfu.proyectos.repository.ClasifProyectoCatMapper;

public class MainService implements MainServiceInterfase {
	
	@Autowired
	private ClasifProyectoCatMapper clasifProyectoMapper;
	
	@Override
	public List<ClasifProyectoCat> getProyectos(){
		ClasifProyectoCatExample ex = new ClasifProyectoCatExample();
		ex.createCriteria().andIdClasifProyectoEqualTo(new Integer(1));
		return clasifProyectoMapper.selectByExample(ex);
	}
}
